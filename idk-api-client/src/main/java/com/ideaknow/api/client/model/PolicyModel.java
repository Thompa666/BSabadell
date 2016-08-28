package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.formatter.IDKAmountFormatter;

public class PolicyModel extends BaseModel implements Parcelable, IDKDisplayData {

    private String certifiedNumber;
    private String code;
    private AmountModel amount;
    private String productDesc;
    private String productType;
    private String productCode;
    private String owner;
    private boolean hasDetail;

    public PolicyModel() {
        this.amount = new AmountModel();
    }

    public String getCertifiedNumber() {
        return certifiedNumber;
    }

    public void setCertifiedNumber(String certifiedNumber) {
        this.certifiedNumber = certifiedNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isHasDetail() {
        return hasDetail;
    }

    public void setHasDetail(boolean hasDetail) {
        this.hasDetail = hasDetail;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getValue() {
        return IDKAmountFormatter.format(amount);
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        return new IDKDisplayData[0];
    }

    @Override
    public boolean isClickable() {
        return true;
    }

    @Override
    public String toString() {
        return "PolicyModel{" +
                "certifiedNumber='" + certifiedNumber + '\'' +
                ", code='" + code + '\'' +
                ", amount=" + amount +
                ", productDesc='" + productDesc + '\'' +
                ", productType='" + productType + '\'' +
                ", productCode='" + productCode + '\'' +
                ", owner='" + owner + '\'' +
                ", hasDetail=" + hasDetail +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.certifiedNumber);
        dest.writeString(this.code);
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.productDesc);
        dest.writeString(this.productType);
        dest.writeString(this.productCode);
        dest.writeString(this.owner);
        dest.writeByte(hasDetail ? (byte) 1 : (byte) 0);
    }

    private PolicyModel(Parcel in) {
        this.certifiedNumber = in.readString();
        this.code = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.productDesc = in.readString();
        this.productType = in.readString();
        this.productCode = in.readString();
        this.owner = in.readString();
        this.hasDetail = in.readByte() != 0;
    }

    public static final Creator<PolicyModel> CREATOR = new Creator<PolicyModel>() {
        public PolicyModel createFromParcel(Parcel source) {
            return new PolicyModel(source);
        }

        public PolicyModel[] newArray(int size) {
            return new PolicyModel[size];
        }
    };

}
