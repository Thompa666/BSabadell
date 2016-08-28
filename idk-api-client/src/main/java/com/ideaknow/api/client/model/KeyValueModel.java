package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class KeyValueModel implements Parcelable {

    private String key;
    private String value;

    public KeyValueModel() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValueModel{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.value);
    }

    private KeyValueModel(Parcel in) {
        this.key = in.readString();
        this.value = in.readString();
    }

    public static Parcelable.Creator<KeyValueModel> CREATOR = new Parcelable.Creator<KeyValueModel>() {
        public KeyValueModel createFromParcel(Parcel source) {
            return new KeyValueModel(source);
        }

        public KeyValueModel[] newArray(int size) {
            return new KeyValueModel[size];
        }
    };
}
