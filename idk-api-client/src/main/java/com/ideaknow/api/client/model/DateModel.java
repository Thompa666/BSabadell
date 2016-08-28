package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class DateModel implements Parcelable {

    private String date;
    private String day;
    private String month;
    private String year;

    public DateModel() {
        date = "";
        day = "";
        month = "";
        year = "";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateModel{" +
                "date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.date);
        dest.writeString(this.day);
        dest.writeString(this.month);
        dest.writeString(this.year);
    }

    private DateModel(Parcel in) {
        this.date = in.readString();
        this.day = in.readString();
        this.month = in.readString();
        this.year = in.readString();
    }

    public static final Parcelable.Creator<DateModel> CREATOR = new Parcelable.Creator<DateModel>() {
        public DateModel createFromParcel(Parcel source) {
            return new DateModel(source);
        }

        public DateModel[] newArray(int size) {
            return new DateModel[size];
        }
    };
}
