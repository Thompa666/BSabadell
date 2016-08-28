package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.BaseModel;
import com.ideaknow.api.client.model.IDKDisplayData;
import com.ideaknow.formatter.IDKAmountFormatter;

import java.util.*;

public class AccountProductModel extends BaseModel implements Parcelable, IDKDisplayData {

    public static final int MAX_ACCOUNTS_TO_SHOW = 3;

    private ArrayList<AccountModel> accounts;
    private ArrayList<AmountModel> amounts;

    public AccountProductModel() {
        accounts = new ArrayList<AccountModel>();
        amounts = new ArrayList<AmountModel>();
    }

    public ArrayList<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<AccountModel> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<AmountModel> getAmounts() {
        return amounts;
    }

    public void setAmounts(ArrayList<AmountModel> amounts) {
        this.amounts = amounts;
    }

    public boolean hasMultipleCurrencies() {
        return this.amounts.size() > 1;
    }

    public boolean hasMoreThanMaxMultipleCurrenciesToShow() {
        return this.amounts.size() > MAX_ACCOUNTS_TO_SHOW;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public boolean isClickable() {
        return true;
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        return accounts.toArray(new AccountModel[accounts.size()]);
    }

    @Override
    public boolean isEmpty() {
        return accounts == null || accounts.size() == 0;
    }

    @Override
    public String getValue() {
        if (amounts.size() > 0) {
            return IDKAmountFormatter.format(amounts.get(0));
        }

        return "";
    }

    public String[] getValues() {
        String[] values = new String[] {getValue()};
        boolean hasMultipleCurrencies = hasMultipleCurrencies();
        if (hasMultipleCurrencies) {
            int maxAccounts = MAX_ACCOUNTS_TO_SHOW;
            values = new String[Math.min(amounts.size(), maxAccounts)];

            for (int i = 0; i < values.length; i++) {
                values[i] = IDKAmountFormatter.format(amounts.get(i));
            }
        }

        return values;
    }

    @Override
    public String toString() {
        return "AccountProductModel{" +
                "accounts=" + accounts +
                ", amounts=" + amounts +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.accounts);
        dest.writeList(this.amounts);
    }

    public AccountProductModel(Parcel in) {
        if (accounts == null) {
            accounts = new ArrayList<AccountModel>();
        }
        in.readList(accounts, AccountModel.class.getClassLoader());
        if (amounts == null) {
            amounts = new ArrayList<AmountModel>();
        }
        in.readList(amounts, AmountModel.class.getClassLoader());
    }

    public static final Creator<AccountProductModel> CREATOR = new Creator<AccountProductModel>() {
        public AccountProductModel createFromParcel(Parcel source) {
            return new AccountProductModel(source);
        }

        public AccountProductModel[] newArray(int size) {
            return new AccountProductModel[size];
        }
    };
}
