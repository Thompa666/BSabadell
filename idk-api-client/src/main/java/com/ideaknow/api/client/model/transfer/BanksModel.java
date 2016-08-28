package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;

import java.util.*;

public class BanksModel implements Parcelable {

    private ArrayList<KeyValueModel> banks;

    public BanksModel() {
    }

    public ArrayList<KeyValueModel> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<KeyValueModel> banks) {
        this.banks = banks;
    }

    @Override
    public String toString() {
        return "BanksModel{" +
                "banks=" + banks +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.banks);
    }

    private BanksModel(Parcel in) {
        if (this.banks == null) {
            this.banks = new ArrayList<KeyValueModel>();
        }
        in.readList(this.banks, KeyValueModel.class.getClassLoader());
    }

    public static final Creator<BanksModel> CREATOR = new Creator<BanksModel>() {
        public BanksModel createFromParcel(Parcel source) {
            return new BanksModel(source);
        }

        public BanksModel[] newArray(int size) {
            return new BanksModel[size];
        }
    };
}
