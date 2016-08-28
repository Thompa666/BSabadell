package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.CommissionModel;

public class CardToAccountCommissionModel implements Parcelable {

    private CommissionModel commission;
    private AccountModel account;

    public CardToAccountCommissionModel() {
    }

    public CommissionModel getCommission() {
        return commission;
    }

    public void setCommission(CommissionModel commission) {
        this.commission = commission;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "CardToAccountCommissionModel{" +
                "commission=" + commission +
                ", account=" + account +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.commission, 0);
        dest.writeParcelable(this.account, 0);
    }

    private CardToAccountCommissionModel(Parcel in) {
        this.commission = in.readParcelable(CommissionModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CardToAccountCommissionModel> CREATOR = new Parcelable.Creator<CardToAccountCommissionModel>() {
        public CardToAccountCommissionModel createFromParcel(Parcel source) {
            return new CardToAccountCommissionModel(source);
        }

        public CardToAccountCommissionModel[] newArray(int size) {
            return new CardToAccountCommissionModel[size];
        }
    };
}
