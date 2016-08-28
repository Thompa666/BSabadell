package com.ideaknow.api.client.model.risk;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class RiskRecordListModel implements Parcelable {

    private List<RiskRecordModel> records;
    private String tsTo;
    private boolean moreElements;

    public RiskRecordListModel() {
    }

    public List<RiskRecordModel> getRecords() {
        return records;
    }

    public void setRecords(List<RiskRecordModel> records) {
        this.records = records;
    }

    public String getTsTo() {
        return tsTo;
    }

    public void setTsTo(String tsTo) {
        this.tsTo = tsTo;
    }

    public boolean isMoreElements() {
        return moreElements;
    }

    public void setMoreElements(boolean moreElements) {
        this.moreElements = moreElements;
    }

    @Override
    public String toString() {
        return "RiskRecordListModel{" +
                "records=" + records +
                ", tsTo='" + tsTo + '\'' +
                ", moreElements=" + moreElements +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(records);
        dest.writeString(this.tsTo);
        dest.writeByte(moreElements ? (byte) 1 : (byte) 0);
    }

    private RiskRecordListModel(Parcel in) {
        if (this.records == null) {
            this.records = new ArrayList<RiskRecordModel>();
        }
        in.readList(records, RiskRecordModel.class.getClassLoader());
        this.tsTo = in.readString();
        this.moreElements = in.readByte() != 0;
    }

    public static final Creator<RiskRecordListModel> CREATOR = new Creator<RiskRecordListModel>() {
        public RiskRecordListModel createFromParcel(Parcel source) {
            return new RiskRecordListModel(source);
        }

        public RiskRecordListModel[] newArray(int size) {
            return new RiskRecordListModel[size];
        }
    };
}
