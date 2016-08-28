package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;

import java.util.*;

public class DollarDatesModel implements Parcelable {

    private ArrayList<KeyValueModel> keyValues;
    private boolean canSelectDate;

    public DollarDatesModel() {
    }

    public ArrayList<KeyValueModel> getKeyValues() {
        return keyValues;
    }

    public void setKeyValues(ArrayList<KeyValueModel> keyValues) {
        this.keyValues = keyValues;
    }

    public boolean isCanSelectDate() {
        return canSelectDate;
    }

    public void setCanSelectDate(boolean canSelectDate) {
        this.canSelectDate = canSelectDate;
    }

    @Override
    public String toString() {
        return "DollarDatesModel{" +
                "keyValues=" + keyValues +
                ", canSelectDate=" + canSelectDate +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.keyValues);
        dest.writeByte(canSelectDate ? (byte) 1 : (byte) 0);
    }

    private DollarDatesModel(Parcel in) {
        if (this.keyValues == null) {
            this.keyValues = new ArrayList<KeyValueModel>();
        }
        in.readList(this.keyValues, KeyValueModel.class.getClassLoader());
        this.canSelectDate = in.readByte() != 0;
    }

    public static final Creator<DollarDatesModel> CREATOR = new Creator<DollarDatesModel>() {
        public DollarDatesModel createFromParcel(Parcel source) {
            return new DollarDatesModel(source);
        }

        public DollarDatesModel[] newArray(int size) {
            return new DollarDatesModel[size];
        }
    };
}
