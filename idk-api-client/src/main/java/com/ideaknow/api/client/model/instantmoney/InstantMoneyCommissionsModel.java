package com.ideaknow.api.client.model.instantmoney;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CommissionModel;
import com.ideaknow.api.client.model.transfer.CommissionsModel;

import java.util.*;

public class InstantMoneyCommissionsModel implements Parcelable {

    public static final String SERVICE_COMMISSION_ID = "service_commission";
    public static final String CARD_COMMISSION_ID = "card_commission";

    ArrayList<CommissionModel> commissions;

    public InstantMoneyCommissionsModel() {

    }

    public ArrayList<CommissionModel> getCommissions() {
        return commissions;
    }

    public void setCommissions(ArrayList<CommissionModel> commissions) {
        this.commissions = commissions;
    }

    @Override
    public String toString() {
        return "InstantMoneyCommissionsModel{" +
                "commissions=" + commissions +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.commissions);
    }

    private InstantMoneyCommissionsModel(Parcel in) {
        if (this.commissions == null) {
            this.commissions = new ArrayList<CommissionModel>();
        }
        in.readList(this.commissions, CommissionsModel.class.getClassLoader());
    }

    public static final Creator<InstantMoneyCommissionsModel> CREATOR =
            new Creator<InstantMoneyCommissionsModel>() {
        public InstantMoneyCommissionsModel createFromParcel(Parcel source) {
            return new InstantMoneyCommissionsModel(source);
        }

        public InstantMoneyCommissionsModel[] newArray(int size) {
            return new InstantMoneyCommissionsModel[size];
        }
    };
}
