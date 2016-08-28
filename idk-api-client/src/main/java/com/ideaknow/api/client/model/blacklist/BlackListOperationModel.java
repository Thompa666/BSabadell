package com.ideaknow.api.client.model.blacklist;

import android.os.Parcel;
import android.os.Parcelable;

public class BlackListOperationModel implements Parcelable {
    private String name;
    private String status;

    public BlackListOperationModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BlackListOperationModel{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.status);
    }

    private BlackListOperationModel(Parcel in) {
        this.name = in.readString();
        this.status = in.readString();
    }

    public static final Creator<BlackListOperationModel> CREATOR = new Creator<BlackListOperationModel>() {
        public BlackListOperationModel createFromParcel(Parcel source) {
            return new BlackListOperationModel(source);
        }

        public BlackListOperationModel[] newArray(int size) {
            return new BlackListOperationModel[size];
        }
    };
}
