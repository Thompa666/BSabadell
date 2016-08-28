package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class OperationModel implements Parcelable {

    private String identifier;
    private String code;
    private String title;

    public OperationModel() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "OperationModel{" +
                "identifier='" + identifier + '\'' +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.identifier);
        dest.writeString(this.code);
        dest.writeString(this.title);
    }

    private OperationModel(Parcel in) {
        this.identifier = in.readString();
        this.code = in.readString();
        this.title = in.readString();
    }

    public static final Parcelable.Creator<OperationModel> CREATOR = new Parcelable.Creator<OperationModel>() {
        public OperationModel createFromParcel(Parcel source) {
            return new OperationModel(source);
        }

        public OperationModel[] newArray(int size) {
            return new OperationModel[size];
        }
    };
}
