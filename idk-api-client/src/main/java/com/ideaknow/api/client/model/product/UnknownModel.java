package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.IDKDisplayData;

import java.util.*;

public class UnknownModel extends BaseProductModel implements Parcelable {

    private String description;
    private ArrayList<AccountModel> accounts;

    public UnknownModel() {
        amount = new AmountModel();
        description = "";
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<AccountModel> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "UnknownModel{" +
                "description='" + description + '\'' +
                ", accounts=" + accounts +
                '}' + super.toString();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && accounts != null || accounts.size() > 0;
    }

    @Override
    public String getTitle() {
        return description;
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        return accounts.toArray(new IDKDisplayData[accounts.size()]);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.description);
        dest.writeList(accounts);
    }

    private UnknownModel(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.description = in.readString();
        if (this.accounts == null) {
            this.accounts = new ArrayList<AccountModel>();
        }
        in.readList(this.accounts, AccountModel.class.getClassLoader());
    }

    public static final Creator<UnknownModel> CREATOR = new Creator<UnknownModel>() {
        public UnknownModel createFromParcel(Parcel source) {
            return new UnknownModel(source);
        }

        public UnknownModel[] newArray(int size) {
            return new UnknownModel[size];
        }
    };
}
