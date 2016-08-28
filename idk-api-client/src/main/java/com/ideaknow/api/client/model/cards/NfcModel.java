package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcModel implements Parcelable {

    private boolean isNfc;
    private boolean isActive;
    private String expirationDate;

    public NfcModel() {

    }

    public boolean isNfc() {
        return isNfc;
    }

    public void setNfc(boolean isNfc) {
        this.isNfc = isNfc;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "NfcModel{" +
                "isNfc=" + isNfc +
                ", isActive=" + isActive +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(isNfc ? (byte) 1 : (byte) 0);
        dest.writeByte(isActive ? (byte) 1 : (byte) 0);
        dest.writeString(this.expirationDate);
    }

    private NfcModel(Parcel in) {
        this.isNfc = in.readByte() != 0;
        this.isActive = in.readByte() != 0;
        this.expirationDate = in.readString();
    }

    public static final Creator<NfcModel> CREATOR = new Creator<NfcModel>() {
        public NfcModel createFromParcel(Parcel source) {
            return new NfcModel(source);
        }

        public NfcModel[] newArray(int size) {
            return new NfcModel[size];
        }
    };
}
