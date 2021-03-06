package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

import java.util.*;

public class AccountLoanModel extends BaseProductModel implements Parcelable {

    private ArrayList<AccountModel> accounts;

    public AccountLoanModel() {
        accounts = new ArrayList<AccountModel>();
    }

    public ArrayList<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<AccountModel> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.accounts);
    }

    private AccountLoanModel(Parcel in) {
        if (accounts == null) {
            accounts = new ArrayList<AccountModel>();
        }
        in.readList(accounts, AccountModel.class.getClassLoader());
    }

    public static final Creator<AccountLoanModel> CREATOR = new Creator<AccountLoanModel>() {
        public AccountLoanModel createFromParcel(Parcel source) {
            return new AccountLoanModel(source);
        }

        public AccountLoanModel[] newArray(int size) {
            return new AccountLoanModel[size];
        }
    };
}
