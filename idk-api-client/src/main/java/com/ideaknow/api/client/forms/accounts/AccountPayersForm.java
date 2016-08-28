package com.ideaknow.api.client.forms.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

public class AccountPayersForm implements Parcelable {

    public static String TRANSFER_CODE_NATIONAL = "TRAF";
    public static String TRANSFER_CODE_INTERNATIONAL = "TRIX";

    private AccountModel account;
    private String transferCode;

    public AccountPayersForm() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public String getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(String transferCode) {
        this.transferCode = transferCode;
    }

    @Override
    public String toString() {
        return "AccountPayersForm{" +
                "account=" + account +
                ", transferCode='" + transferCode + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeString(this.transferCode);
    }

    private AccountPayersForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.transferCode = in.readString();
    }

    public static final Parcelable.Creator<AccountPayersForm> CREATOR =
            new Parcelable.Creator<AccountPayersForm>() {
                public AccountPayersForm createFromParcel(Parcel source) {
                    return new AccountPayersForm(source);
                }

                public AccountPayersForm[] newArray(int size) {
                    return new AccountPayersForm[size];
                }
            };
}
