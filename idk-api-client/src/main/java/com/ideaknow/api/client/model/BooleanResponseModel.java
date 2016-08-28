package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class BooleanResponseModel implements Parcelable {

    private boolean result;

    public BooleanResponseModel() {
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BooleanResponseModel{" +
                "result=" + result +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(result ? (byte) 1 : (byte) 0);
    }

    private BooleanResponseModel(Parcel in) {
        this.result = in.readByte() != 0;
    }

    public static Creator<BooleanResponseModel> CREATOR = new Creator<BooleanResponseModel>() {
        public BooleanResponseModel createFromParcel(Parcel source) {
            return new BooleanResponseModel(source);
        }

        public BooleanResponseModel[] newArray(int size) {
            return new BooleanResponseModel[size];
        }
    };
}
