package com.ideaknow.api.client.forms.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.accounts.AccountMovementModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class AccountMovementReturnBillForm implements Parcelable {

    private AccountModel account;
    private AccountMovementModel accountMovement;
    private String phoneNumber;
    private KeyModel key;

    public AccountMovementReturnBillForm() {

    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public AccountMovementModel getAccountMovement() {
        return accountMovement;
    }

    public void setAccountMovement(AccountMovementModel accountMovement) {
        this.accountMovement = accountMovement;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "AccountMovementReturnBillForm{" +
                "account=" + account +
                ", accountMovement=" + accountMovement +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.accountMovement, 0);
        dest.writeString(this.phoneNumber);
        dest.writeParcelable(this.key, 0);
    }

    private AccountMovementReturnBillForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.accountMovement = in.readParcelable(AccountMovementModel.class.getClassLoader());
        this.phoneNumber = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static Parcelable.Creator<AccountMovementReturnBillForm> CREATOR = new Parcelable.Creator<AccountMovementReturnBillForm>() {
        public AccountMovementReturnBillForm createFromParcel(Parcel source) {
            return new AccountMovementReturnBillForm(source);
        }

        public AccountMovementReturnBillForm[] newArray(int size) {
            return new AccountMovementReturnBillForm[size];
        }
    };
}
