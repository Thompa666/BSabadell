package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class TelephoneModel implements Parcelable {

    private String number;
    private String prefix;

    public TelephoneModel() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "TelephoneModel{" +
                "number='" + number + '\'' +
                ", prefix='" + prefix + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.number);
        dest.writeString(this.prefix);
    }

    private TelephoneModel(Parcel in) {
        this.number = in.readString();
        this.prefix = in.readString();
    }

    public static final Parcelable.Creator<TelephoneModel> CREATOR =
            new Parcelable.Creator<TelephoneModel>() {
                public TelephoneModel createFromParcel(Parcel source) {
                    return new TelephoneModel(source);
                }

                public TelephoneModel[] newArray(int size) {
                    return new TelephoneModel[size];
                }
            };
}
