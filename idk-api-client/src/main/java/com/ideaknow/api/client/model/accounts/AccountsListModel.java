package com.ideaknow.api.client.model.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class AccountsListModel implements Parcelable {

    private ArrayList<AccountModel> accounts;
    private PaginatorModel paginator;

    public AccountsListModel() {
        accounts = new ArrayList<AccountModel>();
    }

    // Getters and Setters
    public ArrayList<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<AccountModel> accounts) {
        this.accounts = accounts;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "AccountsListModel{" +
                "accounts=" + accounts +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.accounts);
        dest.writeParcelable(this.paginator, 0);
    }

    private AccountsListModel(Parcel in) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<AccountModel>();
        }
        in.readList(this.accounts, AccountModel.class.getClassLoader());
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static Parcelable.Creator<AccountsListModel> CREATOR = new Parcelable.Creator<AccountsListModel>() {
        public AccountsListModel createFromParcel(Parcel source) {
            return new AccountsListModel(source);
        }

        public AccountsListModel[] newArray(int size) {
            return new AccountsListModel[size];
        }
    };
}
