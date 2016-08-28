package com.ideaknow.api.client.model.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

import java.util.*;

public class AccountMovementsListModel implements Parcelable {

    private AccountModel account;
    private ArrayList<AccountMovementModel> accountMovements;
    private boolean moreElements;

    public AccountMovementsListModel() {

    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public ArrayList<AccountMovementModel> getMovements() {
        return accountMovements;
    }

    public void setMovements(ArrayList<AccountMovementModel> movements) {
        this.accountMovements = movements;
    }

    public boolean isMoreElements() {
        return moreElements;
    }

    public void setMoreElements(boolean moreElements) {
        this.moreElements = moreElements;
    }

    @Override
    public String toString() {
        return "AccountMovementsListModel{" +
                "account=" + account +
                ", accountMovements=" + accountMovements +
                ", moreElements=" + moreElements +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeList(this.accountMovements);
        dest.writeByte(moreElements ? (byte) 1 : (byte) 0);
    }

    private AccountMovementsListModel(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        if (this.accountMovements == null) {
            this.accountMovements = new ArrayList<AccountMovementModel>();
        }
        in.readList(this.accountMovements, AccountMovementModel.class.getClassLoader());
        this.moreElements = in.readByte() != 0;
    }

    public static final Creator<AccountMovementsListModel> CREATOR = new Creator<AccountMovementsListModel>() {
        public AccountMovementsListModel createFromParcel(Parcel source) {
            return new AccountMovementsListModel(source);
        }

        public AccountMovementsListModel[] newArray(int size) {
            return new AccountMovementsListModel[size];
        }
    };
}
