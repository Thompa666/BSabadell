package com.ideaknow.api.client.model.accounts;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class AccountPayersModel implements Parcelable {

    private ArrayList<AccountPayerModel> accountPayers;

    public AccountPayersModel() {
    }

    public ArrayList<AccountPayerModel> getAccountPayers() {
        return accountPayers;
    }

    public void setAccountPayers(ArrayList<AccountPayerModel> accountPayers) {
        this.accountPayers = accountPayers;
    }

    @Override
    public String toString() {
        return "AccountPayersModel{" +
                "accountPayers=" + accountPayers +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.accountPayers);
    }

    private AccountPayersModel(Parcel in) {
        if (this.accountPayers == null) {
            this.accountPayers = new ArrayList<AccountPayerModel>();
        }
        in.readList(this.accountPayers, AccountPayersModel.class.getClassLoader());
    }

    public static Parcelable.Creator<AccountPayersModel> CREATOR = new Parcelable.Creator<AccountPayersModel>() {
        public AccountPayersModel createFromParcel(Parcel source) {
            return new AccountPayersModel(source);
        }

        public AccountPayersModel[] newArray(int size) {
            return new AccountPayersModel[size];
        }
    };
}
