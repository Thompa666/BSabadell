package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.formatter.IDKAmountFormatter;
import com.ideaknow.lib.StringUtils;

public class AccountModel extends BaseModel implements Parcelable, IDKDisplayData, Cloneable {

    private static final String SHAREHOLDER_CODE = "00130";

    private String alias;
    private String description;
    private String availability;
    private String owner;
    private String product;
    private String bic;
    private String number;
    private String iban;
    private AmountModel amount;
    private int numOwners;
    private boolean isOwner;
    private boolean isSBPManaged;
    private boolean isIberSecurities;
    private String joint;
    private String mobileWarning;
    private String productType;
    private String entityCode;
    private String contractCode;

    public AccountModel() {
        amount = new AmountModel();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public int getNumOwners() {
        return numOwners;
    }

    public void setNumOwners(int numOwners) {
        this.numOwners = numOwners;
    }

    public boolean isIsOwner() {
        return isOwner;
    }

    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    public boolean isIsSBPManaged() {
        return isSBPManaged;
    }

    public void setIsSBPManaged(boolean isSBPManaged) {
        this.isSBPManaged = isSBPManaged;
    }

    public boolean isIsIberSecurities() {
        return isIberSecurities;
    }

    public void setIsIberSecurities(boolean isIberSecurities) {
        this.isIberSecurities = isIberSecurities;
    }

    public String getJoint() {
        return joint;
    }

    public void setJoint(String joint) {
        this.joint = joint;
    }

    public String getMobileWarning() {
        return mobileWarning;
    }

    public void setMobileWarning(String mobileWarning) {
        this.mobileWarning = mobileWarning;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public boolean isShareHolder() {
        return product.contains(SHAREHOLDER_CODE);
    }

    @Override
    public String getTitle() {
        if (!StringUtils.isEmpty(alias)) {
            return alias;
        } else if (!StringUtils.isEmpty(description)) {
            return description;
        } else if (!StringUtils.isEmpty(iban)) {
            return iban;
        } else {
            return number;
        }
    }

    @Override
    public String getValue() {
        return IDKAmountFormatter.format(amount);
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        return null;
    }

    @Override
    public boolean isClickable() {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return amount == null || amount.isEmpty();
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "alias='" + alias + '\'' +
                ", description='" + description + '\'' +
                ", availability='" + availability + '\'' +
                ", owner='" + owner + '\'' +
                ", product='" + product + '\'' +
                ", bic='" + bic + '\'' +
                ", number='" + number + '\'' +
                ", iban='" + iban + '\'' +
                ", amount=" + amount +
                ", numOwners=" + numOwners +
                ", isOwner=" + isOwner +
                ", isSBPManaged=" + isSBPManaged +
                ", isIberSecurities=" + isIberSecurities +
                ", joint='" + joint + '\'' +
                ", mobileWarning='" + mobileWarning + '\'' +
                ", productType='" + productType + '\'' +
                ", entityCode='" + entityCode + '\'' +
                ", contractCode='" + contractCode + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.alias);
        dest.writeString(this.description);
        dest.writeString(this.availability);
        dest.writeString(this.owner);
        dest.writeString(this.product);
        dest.writeString(this.bic);
        dest.writeString(this.number);
        dest.writeString(this.iban);
        dest.writeParcelable(this.amount, 0);
        dest.writeInt(this.numOwners);
        dest.writeByte(isOwner ? (byte) 1 : (byte) 0);
        dest.writeByte(isSBPManaged ? (byte) 1 : (byte) 0);
        dest.writeByte(isIberSecurities ? (byte) 1 : (byte) 0);
        dest.writeString(this.joint);
        dest.writeString(this.mobileWarning);
        dest.writeString(this.productType);
        dest.writeString(this.entityCode);
        dest.writeString(this.contractCode);
    }

    private AccountModel(Parcel in) {
        this.alias = in.readString();
        this.description = in.readString();
        this.availability = in.readString();
        this.owner = in.readString();
        this.product = in.readString();
        this.bic = in.readString();
        this.number = in.readString();
        this.iban = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.numOwners = in.readInt();
        this.isOwner = in.readByte() != 0;
        this.isSBPManaged = in.readByte() != 0;
        this.isIberSecurities = in.readByte() != 0;
        this.joint = in.readString();
        this.mobileWarning = in.readString();
        this.productType = in.readString();
        this.entityCode = in.readString();
        this.contractCode = in.readString();
    }

    public static Parcelable.Creator<AccountModel> CREATOR = new Parcelable.Creator<AccountModel>() {
        public AccountModel createFromParcel(Parcel source) {
            return new AccountModel(source);
        }

        public AccountModel[] newArray(int size) {
            return new AccountModel[size];
        }
    };

    public AccountModel clone(){
        try {
            return (AccountModel) super.clone();
        } catch (CloneNotSupportedException e) {
            // Should never happen.
            throw new RuntimeException(e.toString());
        }
    }
}

