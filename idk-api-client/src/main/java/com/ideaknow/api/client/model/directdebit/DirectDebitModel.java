package com.ideaknow.api.client.model.directdebit;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;

public class DirectDebitModel implements Parcelable {

    public static String TYPE_STATUS_BLOCK = "N";
    public static String TYPE_STATUS_ACTIVE = "A";
    public static String TYPE_STATUS_NULL = "";
    public static String TYPE_STATUS_INACTIVE = "I";
    public static final int ACTION_CHANGE_ACCOUNT = 0;
    public static final int ACTION_REACTIVATE = 1;
    public static final int ACTION_BLOCK = 2;
    public static final String ACTION_STRING_CHANGE_ACCOUNT = "M";
    public static final String ACTION_STRING_REACTIVATE = "A";
    public static final String ACTION_STRING_BLOCK = "B";

    private AccountModel account;
    private AmountModel amount;
    private String contract;
    private String debtor;
    private String issuer;
    private String initDate;
    private String lastDate;
    private String numOp;
    private String reference;
    private String status;
    private boolean pay;

    public DirectDebitModel() {
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNumOp() {
        return numOp;
    }

    public void setNumOp(String numOp) {
        this.numOp = numOp;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getDebtor() {
        return debtor;
    }

    public void setDebtor(String debtor) {
        this.debtor = debtor;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "DirectDebitModel{" +
                "account=" + account +
                ", amount=" + amount +
                ", contract='" + contract + '\'' +
                ", debtor='" + debtor + '\'' +
                ", issuer='" + issuer + '\'' +
                ", initDate='" + initDate + '\'' +
                ", lastDate='" + lastDate + '\'' +
                ", numOp='" + numOp + '\'' +
                ", reference='" + reference + '\'' +
                ", status='" + status + '\'' +
                ", pay=" + pay +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.contract);
        dest.writeString(this.debtor);
        dest.writeString(this.issuer);
        dest.writeString(this.initDate);
        dest.writeString(this.lastDate);
        dest.writeString(this.numOp);
        dest.writeString(this.reference);
        dest.writeString(this.status);
        dest.writeByte(pay ? (byte) 1 : (byte) 0);
    }

    private DirectDebitModel(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.contract = in.readString();
        this.debtor = in.readString();
        this.issuer = in.readString();
        this.initDate = in.readString();
        this.lastDate = in.readString();
        this.numOp = in.readString();
        this.reference = in.readString();
        this.status = in.readString();
        this.pay = in.readByte() != 0;
    }

    public static final Creator<DirectDebitModel> CREATOR = new Creator<DirectDebitModel>() {
        public DirectDebitModel createFromParcel(Parcel source) {
            return new DirectDebitModel(source);
        }

        public DirectDebitModel[] newArray(int size) {
            return new DirectDebitModel[size];
        }
    };
}
