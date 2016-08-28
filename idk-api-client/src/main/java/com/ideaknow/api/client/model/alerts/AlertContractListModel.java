package com.ideaknow.api.client.model.alerts;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class AlertContractListModel implements Parcelable {

    private ArrayList<AlertContractModel> contracts;

    public AlertContractListModel() {
    }

    public ArrayList<AlertContractModel> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<AlertContractModel> contracts) {
        this.contracts = contracts;
    }

    @Override
    public String toString() {
        return "AlertContractListModel{" +
                "contracts=" + contracts +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.contracts);
    }

    private AlertContractListModel(Parcel in) {
        if (contracts == null) {
            contracts = new ArrayList<AlertContractModel>();
        }
        in.readList(contracts, AlertContractModel.class.getClassLoader());
    }

    public static final Creator<AlertContractListModel> CREATOR = new
            Creator<AlertContractListModel>() {
        public AlertContractListModel createFromParcel(Parcel source) {
            return new AlertContractListModel(source);
        }

        public AlertContractListModel[] newArray(int size) {
            return new AlertContractListModel[size];
        }
    };
}
