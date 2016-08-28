package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CompanyModel implements Parcelable {

    private String id;
    private String nif;
    private String name;

    public CompanyModel() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CompanyModel{" +
                "id='" + id + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.nif);
        dest.writeString(this.name);
    }

    private CompanyModel(Parcel in) {
        this.id = in.readString();
        this.nif = in.readString();
        this.name = in.readString();
    }

    public static final Creator<CompanyModel> CREATOR = new Creator<CompanyModel>() {
        public CompanyModel createFromParcel(Parcel source) {
            return new CompanyModel(source);
        }

        public CompanyModel[] newArray(int size) {
            return new CompanyModel[size];
        }
    };
}
