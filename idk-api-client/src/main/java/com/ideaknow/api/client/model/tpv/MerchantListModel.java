package com.ideaknow.api.client.model.tpv;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class MerchantListModel implements Parcelable {

    private List<MerchantModel> merchants;

    public MerchantListModel() {
    }

    public List<MerchantModel> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<MerchantModel> merchants) {
        this.merchants = merchants;
    }

    @Override
    public String toString() {
        return "MerchantListModel{" +
                "merchants=" + merchants +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(merchants);
    }

    private MerchantListModel(Parcel in) {
        in.readTypedList(merchants, MerchantModel.CREATOR);
    }

    public static final Parcelable.Creator<MerchantListModel> CREATOR =
            new Parcelable.Creator<MerchantListModel>() {
        public MerchantListModel createFromParcel(Parcel source) {
            return new MerchantListModel(source);
        }

        public MerchantListModel[] newArray(int size) {
            return new MerchantListModel[size];
        }
    };
}
