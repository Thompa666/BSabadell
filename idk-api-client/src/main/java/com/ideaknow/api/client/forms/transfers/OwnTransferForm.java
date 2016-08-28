package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class OwnTransferForm implements Parcelable {

    private AmountModel amount;
    private AccountModel originAccount;
    private AccountModel destAccount;
    private KeyModel key;

    public OwnTransferForm() {
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

    public void setOriginAccount(AccountModel account) {
        this.originAccount = account;
    }

    public AccountModel getDestAccount() {
        return destAccount;
    }

    public void setDestAccount(AccountModel account) {
        this.destAccount = account;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "OwnTransferForm{" +
                "amount='" + amount + '\'' +
                ", originAccount='" + originAccount + '\'' +
                ", destAccount='" + destAccount + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.originAccount, 0);
        dest.writeParcelable(this.destAccount, 0);
        dest.writeParcelable(this.key, 0);
    }

    private OwnTransferForm(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.originAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.destAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static Parcelable.Creator<OwnTransferForm> CREATOR = new Parcelable.Creator<OwnTransferForm>() {
        public OwnTransferForm createFromParcel(Parcel source) {
            return new OwnTransferForm(source);
        }

        public OwnTransferForm[] newArray(int size) {
            return new OwnTransferForm[size];
        }
    };

}
