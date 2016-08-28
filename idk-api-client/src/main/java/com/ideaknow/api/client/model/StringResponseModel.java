package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class StringResponseModel implements Parcelable {

    private String result;

    public StringResponseModel() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "StringResponseModel{" +
                "result='" + result + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.result);
    }

    private StringResponseModel(Parcel in) {
        this.result = in.readString();
    }

    public static Creator<StringResponseModel> CREATOR = new Creator<StringResponseModel>() {
        public StringResponseModel createFromParcel(Parcel source) {
            return new StringResponseModel(source);
        }

        public StringResponseModel[] newArray(int size) {
            return new StringResponseModel[size];
        }
    };
}
