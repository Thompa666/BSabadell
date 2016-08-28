package com.ideaknow.api.client.model.offices;

import android.os.Parcel;
import android.os.Parcelable;

public class GeoPointModel implements Parcelable {

    private double lat;
    private double lng;

    public GeoPointModel() {

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

    @Override
    public String toString() {
        return "GeoPointModel{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.lat);
        dest.writeDouble(this.lng);
    }

    private GeoPointModel(Parcel in) {
        this.lat = in.readDouble();
        this.lng = in.readDouble();
    }

    public static final Creator<GeoPointModel> CREATOR = new Creator<GeoPointModel>() {
        public GeoPointModel createFromParcel(Parcel source) {
            return new GeoPointModel(source);
        }

        public GeoPointModel[] newArray(int size) {
            return new GeoPointModel[size];
        }
    };
}
