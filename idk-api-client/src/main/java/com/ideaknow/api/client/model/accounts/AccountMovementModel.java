package com.ideaknow.api.client.model.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;

public class AccountMovementModel implements Parcelable {

    private String date;
    private String concept;
    private AmountModel amount;
    private boolean canSplit;
    private String cardNumber;
    private AmountModel balance;
    private boolean existDocument;
    private String apuntNumber;
    private String productCode;
    private String valueDate;
    private String conceptCode;
    private String conceptDetail;
    private String timeStamp;
    private String referencor;
    private String sessionDate;
    private String returnBillCode;
    private String numPAN;

    public AccountMovementModel() {
        amount = new AmountModel();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public boolean isCanSplit() {
        return canSplit;
    }

    public void setCanSplit(boolean canSplit) {
        this.canSplit = canSplit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public AmountModel getBalance() {
        return balance;
    }

    public void setBalance(AmountModel balance) {
        this.balance = balance;
    }

    public boolean isExistDocument() {
        return existDocument;
    }

    public void setExistDocument(boolean existDocument) {
        this.existDocument = existDocument;
    }

    public String getApuntNumber() {
        return apuntNumber;
    }

    public void setApuntNumber(String apuntNumber) {
        this.apuntNumber = apuntNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getConceptDetail() {
        return conceptDetail;
    }

    public void setConceptDetail(String conceptDetail) {
        this.conceptDetail = conceptDetail;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getReferencor() {
        return referencor;
    }

    public void setReferencor(String referencor) {
        this.referencor = referencor;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public String getReturnBillCode() {
        return returnBillCode;
    }

    public void setReturnBillCode(String returnBillCode) {
        this.returnBillCode = returnBillCode;
    }

    public String getConceptCode() {
        return conceptCode;
    }

    public void setConceptCode(String conceptCode) {
        this.conceptCode = conceptCode;
    }

    public String getNumPAN() {
        return numPAN;
    }

    public void setNumPAN(String numPAN) {
        this.numPAN = numPAN;
    }

    @Override
    public String toString() {
        return "AccountMovementModel{" +
                "date='" + date + '\'' +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", canSplit=" + canSplit +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", existDocument=" + existDocument +
                ", apuntNumber='" + apuntNumber + '\'' +
                ", productCode='" + productCode + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", conceptCode='" + conceptCode + '\'' +
                ", conceptDetail='" + conceptDetail + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", referencor='" + referencor + '\'' +
                ", sessionDate='" + sessionDate + '\'' +
                ", returnBillCode='" + returnBillCode + '\'' +
                ", numPAN='" + numPAN + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.date);
        dest.writeString(this.concept);
        dest.writeParcelable(this.amount, 0);
        dest.writeByte(canSplit ? (byte) 1 : (byte) 0);
        dest.writeString(this.cardNumber);
        dest.writeParcelable(this.balance, 0);
        dest.writeByte(existDocument ? (byte) 1 : (byte) 0);
        dest.writeString(this.apuntNumber);
        dest.writeString(this.productCode);
        dest.writeString(this.valueDate);
        dest.writeString(this.conceptCode);
        dest.writeString(this.conceptDetail);
        dest.writeString(this.timeStamp);
        dest.writeString(this.referencor);
        dest.writeString(this.sessionDate);
        dest.writeString(this.returnBillCode);
        dest.writeString(this.numPAN);
    }

    private AccountMovementModel(Parcel in) {
        this.date = in.readString();
        this.concept = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.canSplit = in.readByte() != 0;
        this.cardNumber = in.readString();
        this.balance = in.readParcelable(AmountModel.class.getClassLoader());
        this.existDocument = in.readByte() != 0;
        this.apuntNumber = in.readString();
        this.productCode = in.readString();
        this.valueDate = in.readString();
        this.conceptCode = in.readString();
        this.conceptDetail = in.readString();
        this.timeStamp = in.readString();
        this.referencor = in.readString();
        this.sessionDate = in.readString();
        this.returnBillCode = in.readString();
        this.numPAN = in.readString();
    }

    public static final Creator<AccountMovementModel> CREATOR =
            new Creator<AccountMovementModel>() {
                public AccountMovementModel createFromParcel(Parcel source) {
                    return new AccountMovementModel(source);
                }

                public AccountMovementModel[] newArray(int size) {
                    return new AccountMovementModel[size];
                }
            };
}
