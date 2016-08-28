package com.ideaknow.api.client.model.checks;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CompanyModel;

public class CheckModel implements Parcelable {

    private AccountModel account;
    private AccountModel checkAccount;
    private AmountModel amount;
    private String checkNumber;
    private String checkType;
    private String expirationDate;
    private String paymentDate;
    private CompanyModel company;
    private boolean checkToOrder;

    public CheckModel() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public AccountModel getCheckAccount() {
        return checkAccount;
    }

    public void setCheckAccount(AccountModel checkAccount) {
        this.checkAccount = checkAccount;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "CheckModel{" +
                "account=" + account +
                ", checkAccount=" + checkAccount +
                ", amount=" + amount +
                ", checkNumber='" + checkNumber + '\'' +
                ", checkType='" + checkType + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", company=" + company +
                ", checkToOrder=" + checkToOrder +
                '}';
    }

    public boolean isCheckToOrder() {
        return checkToOrder;
    }

    public void setCheckToOrder(boolean checkToOrder) {
        this.checkToOrder = checkToOrder;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.checkAccount, 0);
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.checkNumber);
        dest.writeString(this.checkType);
        dest.writeString(this.expirationDate);
        dest.writeString(this.paymentDate);
        dest.writeParcelable(this.company, 0);
        dest.writeByte(checkToOrder ? (byte) 1 : (byte) 0);
    }

    private CheckModel(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.checkAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.checkNumber = in.readString();
        this.checkType = in.readString();
        this.expirationDate = in.readString();
        this.paymentDate = in.readString();
        this.company = in.readParcelable(CompanyModel.class.getClassLoader());
        this.checkToOrder = in.readByte() != 0;
    }

    public static final Creator<CheckModel> CREATOR = new Creator<CheckModel>() {
        public CheckModel createFromParcel(Parcel source) {
            return new CheckModel(source);
        }

        public CheckModel[] newArray(int size) {
            return new CheckModel[size];
        }
    };
}
