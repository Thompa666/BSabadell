package com.ideaknow.api.client.forms.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.accounts.AccountMovementModel;

public class AccountMovementDocumentForm implements Parcelable {

    private AccountModel account;
    private AccountMovementModel accountMovement;
    private String format = "";

    public AccountMovementDocumentForm() {
        account = new AccountModel();
        accountMovement = new AccountMovementModel();
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "AccountMovementDocumentForm{" +
                "account=" + account +
                ", accountMovement=" + accountMovement +
                ", format='" + format + '\'' +
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
        dest.writeString(this.format);
    }

    private AccountMovementDocumentForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.accountMovement = in.readParcelable(AccountMovementModel.class.getClassLoader());
        this.format = in.readString();
    }

    public static Parcelable.Creator<AccountMovementDocumentForm> CREATOR =
            new Parcelable.Creator<AccountMovementDocumentForm>() {
                public AccountMovementDocumentForm createFromParcel(Parcel source) {
                    return new AccountMovementDocumentForm(source);
                }

                public AccountMovementDocumentForm[] newArray(int size) {
                    return new AccountMovementDocumentForm[size];
                }
    };
}
