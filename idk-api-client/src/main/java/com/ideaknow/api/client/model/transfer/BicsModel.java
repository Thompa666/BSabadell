package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class BicsModel implements Parcelable {

    private ArrayList<String> bics;

    public BicsModel() {
    }

    public ArrayList<String> getBics() {
        return bics;
    }

    public void setBics(ArrayList<String> bics) {
        this.bics = bics;
    }

    @Override
    public String toString() {
        return "BicsModel{" +
                "bics=" + bics +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.bics);
    }

    private BicsModel(Parcel in) {
        if (this.bics == null) {
            this.bics = new ArrayList<String>();
        }
        in.readList(this.bics, String.class.getClassLoader());
    }

    public static final Creator<BicsModel> CREATOR = new Creator<BicsModel>() {
        public BicsModel createFromParcel(Parcel source) {
            return new BicsModel(source);
        }

        public BicsModel[] newArray(int size) {
            return new BicsModel[size];
        }
    };
}
