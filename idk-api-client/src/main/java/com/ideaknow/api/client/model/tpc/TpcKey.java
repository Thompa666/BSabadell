package com.ideaknow.api.client.model.tpc;

import android.os.Parcel;
import android.os.Parcelable;

public class TpcKey implements Parcelable {

    private String code;
    private String expirationDate;

    public TpcKey() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "TpcKey{" +
                "code='" + code + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.expirationDate);
    }

    private TpcKey(Parcel in) {
        this.code = in.readString();
        this.expirationDate = in.readString();
    }

    public static final Parcelable.Creator<TpcKey> CREATOR = new Parcelable.Creator<TpcKey>() {
        public TpcKey createFromParcel(Parcel source) {
            return new TpcKey(source);
        }

        public TpcKey[] newArray(int size) {
            return new TpcKey[size];
        }
    };
}
