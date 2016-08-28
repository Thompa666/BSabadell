package com.ideaknow.api.client.forms.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

public class AccountForm implements Parcelable {

    private AccountModel account;

    public AccountForm() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
    }

    private AccountForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
    }

    public static final Creator<AccountForm> CREATOR = new Creator<AccountForm>() {
        public AccountForm createFromParcel(Parcel source) {
            return new AccountForm(source);
        }

        public AccountForm[] newArray(int size) {
            return new AccountForm[size];
        }
    };
}
