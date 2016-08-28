package com.ideaknow.api.client.model.offices;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class OfficeListModel implements Parcelable {

    private List<OfficeModel> offices;
    private GeoPointModel point;

    public OfficeListModel() {

    }

    public List<OfficeModel> getOffices() {
        return offices;
    }

    public void setOffices(List<OfficeModel> offices) {
        this.offices = offices;
    }

    public GeoPointModel getPoint() {
        return point;
    }

    public void setPoint(GeoPointModel point) {
        this.point = point;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(offices);
        dest.writeParcelable(this.point, 0);
    }

    private OfficeListModel(Parcel in) {
        if (offices == null) {
            offices = new ArrayList<OfficeModel>();
        }
        in.readList(offices, OfficeModel.class.getClassLoader());

        this.point = in.readParcelable(GeoPointModel.class.getClassLoader());
    }

    public static Parcelable.Creator<OfficeListModel> CREATOR = new Parcelable.Creator<OfficeListModel>() {
        public OfficeListModel createFromParcel(Parcel source) {
            return new OfficeListModel(source);
        }

        public OfficeListModel[] newArray(int size) {
            return new OfficeListModel[size];
        }
    };
}
