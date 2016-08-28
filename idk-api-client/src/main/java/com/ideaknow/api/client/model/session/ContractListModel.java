package com.ideaknow.api.client.model.session;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class ContractListModel implements Parcelable {

    private List<ContractModel> contracts;

    public ContractListModel() {
    }

    public List<ContractModel> getContracts() {
        return contracts;
    }

    public void setContracts(List<ContractModel> contracts) {
        this.contracts = contracts;
    }

    @Override
    public String toString() {
        return "ContractListModel{" +
                "contracts=" + contracts +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(contracts);
    }

    private ContractListModel(Parcel in) {
        if (contracts == null) {
            contracts = new ArrayList<ContractModel>();
        }
        in.readList(contracts, ContractModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<ContractListModel> CREATOR =
            new Parcelable.Creator<ContractListModel>() {
        public ContractListModel createFromParcel(Parcel source) {
            return new ContractListModel(source);
        }

        public ContractListModel[] newArray(int size) {
            return new ContractListModel[size];
        }
    };
}
