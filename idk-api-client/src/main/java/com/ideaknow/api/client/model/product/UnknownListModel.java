package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class UnknownListModel implements Parcelable {

    private ArrayList<UnknownModel> unknowns;

    public UnknownListModel() {
        unknowns = new ArrayList<UnknownModel>();
    }

    public ArrayList<UnknownModel> getUnknowns() {
        return unknowns;
    }

    public void setUnknowns(ArrayList<UnknownModel> unknowns) {
        this.unknowns = unknowns;
    }

    @Override
    public String toString() {
        return "UnknownListModel{" +
                "unknowns=" + unknowns +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.unknowns);
    }

    private UnknownListModel(Parcel in) {
        if (unknowns == null) {
            unknowns = new ArrayList<UnknownModel>();
        }
        in.readList(unknowns, UnknownModel.class.getClassLoader());
    }

    public static final Creator<UnknownListModel> CREATOR = new Creator<UnknownListModel>() {
        public UnknownListModel createFromParcel(Parcel source) {
            return new UnknownListModel(source);
        }

        public UnknownListModel[] newArray(int size) {
            return new UnknownListModel[size];
        }
    };
}
