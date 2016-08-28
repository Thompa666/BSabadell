package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;

import com.ideaknow.api.client.model.AccountModel;

import java.util.ArrayList;

public class FundingBoundariesModel extends BaseProductModel implements Parcelable {

    private ArrayList<AccountModel> accounts;

    public FundingBoundariesModel() {
        accounts = new ArrayList<AccountModel>();
    }

    public ArrayList<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<AccountModel> accounts) {
        this.accounts = accounts;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.accounts);
    }

    private FundingBoundariesModel(Parcel in) {
        if (accounts == null) {
            accounts = new ArrayList<AccountModel>();
        }
        in.readList(accounts, AccountModel.class.getClassLoader());
    }

    public static final Creator<FundingBoundariesModel> CREATOR =
            new Creator<FundingBoundariesModel>() {
                public FundingBoundariesModel createFromParcel(Parcel source) {
                    return new FundingBoundariesModel(source);
                }

                public FundingBoundariesModel[] newArray(int size) {
                    return new FundingBoundariesModel[size];
                }
            };
}
