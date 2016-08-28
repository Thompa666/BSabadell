package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

import java.util.*;

public class AccountCreditModel extends BaseProductModel implements Parcelable {

    private ArrayList<AccountModel> accounts;

    public AccountCreditModel() {
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
        dest.writeSerializable(this.accounts);
    }

    private AccountCreditModel(Parcel in) {
        this.accounts = (ArrayList<AccountModel>) in.readSerializable();
    }

    public static final Creator<AccountCreditModel> CREATOR = new Creator<AccountCreditModel>() {
        public AccountCreditModel createFromParcel(Parcel source) {
            return new AccountCreditModel(source);
        }

        public AccountCreditModel[] newArray(int size) {
            return new AccountCreditModel[size];
        }
    };
}
