package com.ideaknow.api.client.forms.agent;

import android.os.Parcel;
import android.os.Parcelable;

public class MyAvailabilityForm implements Parcelable {

    public static final String METHOD_EMAIL = "email";
    public static final String METHOD_PHONE = "phone";

    private String method;
    private String from;
    private String to;

    public MyAvailabilityForm() {
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "MyAvailabilityForm{" +
                "method='" + method + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.method);
        dest.writeString(this.from);
        dest.writeString(this.to);
    }

    private MyAvailabilityForm(Parcel in) {
        this.method = in.readString();
        this.from = in.readString();
        this.to = in.readString();
    }

    public static final Creator<MyAvailabilityForm> CREATOR = new Creator<MyAvailabilityForm>() {
        public MyAvailabilityForm createFromParcel(Parcel source) {
            return new MyAvailabilityForm(source);
        }

        public MyAvailabilityForm[] newArray(int size) {
            return new MyAvailabilityForm[size];
        }
    };
}
