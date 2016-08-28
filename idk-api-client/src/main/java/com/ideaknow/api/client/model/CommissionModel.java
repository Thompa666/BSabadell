package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CommissionModel implements Parcelable {

    private String id;
    private String rate;
    private AmountModel amount;

    public CommissionModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CommissionModel{" +
                "id='" + id + '\'' +
                ", rate='" + rate + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.rate);
        dest.writeParcelable(this.amount, 0);
    }

    private CommissionModel(Parcel in) {
        this.id = in.readString();
        this.rate = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<CommissionModel> CREATOR = new Creator<CommissionModel>() {
        public CommissionModel createFromParcel(Parcel source) {
            return new CommissionModel(source);
        }

        public CommissionModel[] newArray(int size) {
            return new CommissionModel[size];
        }
    };
}

