package com.ideaknow.api.client.model.offices;

import android.os.Parcel;
import android.os.Parcelable;

public class OfficeModel implements Parcelable {

    private double distToPoint;
    private String num;
    private String name;
    private String address;
    private String location;
    private String postalCode;
    private String director;
    private String phone;
    private String fax;
    private int type;
    private GeoPointModel point;

    public OfficeModel() {

    }

    public double getDistToPoint() {
        return distToPoint;
    }

    public void setDistToPoint(double distToPoint) {
        this.distToPoint = distToPoint;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public GeoPointModel getPoint() {
        return point;
    }

    public void setPoint(GeoPointModel point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "OfficeModel{" +
                "distToPoint=" + distToPoint +
                ", num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", director='" + director + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", type=" + type +
                ", point=" + point +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.distToPoint);
        dest.writeString(this.num);
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.location);
        dest.writeString(this.postalCode);
        dest.writeString(this.director);
        dest.writeString(this.phone);
        dest.writeString(this.fax);
        dest.writeInt(this.type);
        dest.writeParcelable(this.point, 0);
    }

    private OfficeModel(Parcel in) {
        this.distToPoint = in.readDouble();
        this.num = in.readString();
        this.name = in.readString();
        this.address = in.readString();
        this.location = in.readString();
        this.postalCode = in.readString();
        this.director = in.readString();
        this.phone = in.readString();
        this.fax = in.readString();
        this.type = in.readInt();
        this.point = in.readParcelable(GeoPointModel.class.getClassLoader());
    }

    public static Parcelable.Creator<OfficeModel> CREATOR = new Parcelable.Creator<OfficeModel>() {
        public OfficeModel createFromParcel(Parcel source) {
            return new OfficeModel(source);
        }

        public OfficeModel[] newArray(int size) {
            return new OfficeModel[size];
        }
    };
}
