package com.ideaknow.api.client.forms.offices;

import android.os.Parcel;
import android.os.Parcelable;

public class OfficesSearchForm implements Parcelable {

    private int numOffices;
    private double lat;
    private double lng;
    private String address;
    private String brand;

    public OfficesSearchForm() {

    }

    public int getNumOffices() {
        return numOffices;
    }

    public void setNumOffices(int numOffices) {
        this.numOffices = numOffices;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "OfficesSearchForm{" +
                "numOffices=" + numOffices +
                ", lat=" + lat +
                ", lng=" + lng +
                ", address='" + address + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.numOffices);
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lng);
        dest.writeString(this.address);
        dest.writeString(this.brand);
    }

    private OfficesSearchForm(Parcel in) {
        this.numOffices = in.readInt();
        this.lat = in.readDouble();
        this.lng = in.readDouble();
        this.address = in.readString();
        this.brand = in.readString();
    }

    public static final Creator<OfficesSearchForm> CREATOR = new Creator<OfficesSearchForm>() {
        public OfficesSearchForm createFromParcel(Parcel source) {
            return new OfficesSearchForm(source);
        }

        public OfficesSearchForm[] newArray(int size) {
            return new OfficesSearchForm[size];
        }
    };
}
