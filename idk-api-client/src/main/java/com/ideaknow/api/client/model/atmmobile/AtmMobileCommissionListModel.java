package com.ideaknow.api.client.model.atmmobile;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CommissionModel;

import java.util.*;

public class AtmMobileCommissionListModel implements Parcelable {

    private ArrayList<CommissionModel> commissions;

    public AtmMobileCommissionListModel() {
    }

    public ArrayList<CommissionModel> getCommissions() {
        return commissions;
    }

    public void setCommissions(ArrayList<CommissionModel> commissions) {
        this.commissions = commissions;
    }

    @Override
    public String toString() {
        return "AtmMobileCommissionListModel{" +
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

    private AtmMobileCommissionListModel(Parcel in) {
        if (commissions == null) {
            commissions = new ArrayList<CommissionModel>();
        }
        in.readList(commissions, CommissionModel.class.getClassLoader());
    }

    public static final Creator<AtmMobileCommissionListModel> CREATOR = new
            Creator<AtmMobileCommissionListModel>() {
                public AtmMobileCommissionListModel createFromParcel(Parcel source) {
                    return new AtmMobileCommissionListModel(source);
                }

                public AtmMobileCommissionListModel[] newArray(int size) {
                    return new AtmMobileCommissionListModel[size];
                }
            };
}
