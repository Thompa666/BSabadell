package com.ideaknow.api.client.model.tpc;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class TpcKeyListModel implements Parcelable {

    private List<TpcKey> tpcKeys;

    public TpcKeyListModel() {
    }

    public List<TpcKey> getTpcKeys() {
        return tpcKeys;
    }

    public void setTpcKeys(List<TpcKey> tpcKeys) {
        this.tpcKeys = tpcKeys;
    }

    @Override
    public String toString() {
        return "TpcKeyListModel{" +
                "tpcKeys=" + tpcKeys +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(tpcKeys);
    }

    private TpcKeyListModel(Parcel in) {
        in.readTypedList(tpcKeys, TpcKey.CREATOR);
    }

    public static final Parcelable.Creator<TpcKeyListModel> CREATOR =
            new Parcelable.Creator<TpcKeyListModel>() {
        public TpcKeyListModel createFromParcel(Parcel source) {
            return new TpcKeyListModel(source);
        }

        public TpcKeyListModel[] newArray(int size) {
            return new TpcKeyListModel[size];
        }
    };
}
