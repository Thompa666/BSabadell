package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

public class DollarDatesForm implements Parcelable {

    private AccountModel account;

    public DollarDatesForm() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "DollarDatesForm{" +
                "account=" + account +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
    }

    private DollarDatesForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
    }

    public static final Creator<DollarDatesForm> CREATOR = new Creator<DollarDatesForm>() {
        public DollarDatesForm createFromParcel(Parcel source) {
            return new DollarDatesForm(source);
        }

        public DollarDatesForm[] newArray(int size) {
            return new DollarDatesForm[size];
        }
    };
}
