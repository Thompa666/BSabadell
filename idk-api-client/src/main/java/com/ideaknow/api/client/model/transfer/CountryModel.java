package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

public class CountryModel implements Parcelable {

    private String code;
    private String name;

    public CountryModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountryModel{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.name);
    }

    private CountryModel(Parcel in) {
        this.code = in.readString();
        this.name = in.readString();
    }

    public static final Creator<CountryModel> CREATOR = new Creator<CountryModel>() {
        public CountryModel createFromParcel(Parcel source) {
            return new CountryModel(source);
        }

        public CountryModel[] newArray(int size) {
            return new CountryModel[size];
        }
    };
}
