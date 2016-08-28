package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;

public class OwnTransferModel implements Parcelable {

    private String operationNumber;
    private AmountModel amount;
    private AccountModel originAccount;
    private AccountModel targetAccount;

    public OwnTransferModel() {
    }

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public AccountModel getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(AccountModel originAccount) {
        this.originAccount = originAccount;
    }

    public AccountModel getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(AccountModel targetAccount) {
        this.targetAccount = targetAccount;
    }

    @Override
    public String toString() {
        return "OwnTransferModel{" +
                "operationNumber='" + operationNumber + '\'' +
                ", amount=" + amount +
                ", originAccount=" + originAccount +
                ", targetAccount=" + targetAccount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.operationNumber);
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.originAccount, 0);
        dest.writeParcelable(this.targetAccount, 0);
    }

    private OwnTransferModel(Parcel in) {
        this.operationNumber = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.originAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.targetAccount = in.readParcelable(AccountModel.class.getClassLoader());
    }

    public static final Creator<OwnTransferModel> CREATOR = new Creator<OwnTransferModel>() {
        public OwnTransferModel createFromParcel(Parcel source) {
            return new OwnTransferModel(source);
        }

        public OwnTransferModel[] newArray(int size) {
            return new OwnTransferModel[size];
        }
    };
}
