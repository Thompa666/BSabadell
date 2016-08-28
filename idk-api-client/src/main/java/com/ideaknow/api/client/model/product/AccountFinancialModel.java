package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

import java.util.*;

public class AccountFinancialModel extends BaseProductModel implements Parcelable {

    public static final String TYPE_INVESTMENT = "investmentFund";
    public static final String TYPE_PENSION_PLAN = "pensionPlan";
    public static final String TYPE_SECURITIES = "securities";

    private ArrayList<AccountModel> accounts;
    private String type;

    public AccountFinancialModel() {
        accounts = new ArrayList<AccountModel>();
    }

    public ArrayList<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<AccountModel> accounts) {
        this.accounts = accounts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccountFinancialModel{" +
                "accounts=" + accounts +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.accounts);
        dest.writeString(this.type);
    }

    private AccountFinancialModel(Parcel in) {
        if (accounts == null) {
            accounts = new ArrayList<AccountModel>();
        }
        in.readList(accounts, AccountModel.class.getClassLoader());
        this.type = in.readString();
    }

    public static final Creator<AccountFinancialModel> CREATOR = new
            Creator<AccountFinancialModel>() {
                public AccountFinancialModel createFromParcel(Parcel source) {
                    return new AccountFinancialModel(source);
                }

                public AccountFinancialModel[] newArray(int size) {
                    return new AccountFinancialModel[size];
                }
            };
}
