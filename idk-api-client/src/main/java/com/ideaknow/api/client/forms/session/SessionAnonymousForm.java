package com.ideaknow.api.client.forms.session;

import android.os.Parcel;
import android.os.Parcelable;

public class SessionAnonymousForm implements Parcelable {

    public static final String LOGIN_TYPE_VTPC = "LOGINVTPC";
    public static final String LOGIN_TYPE_BUZON = "BUZON";

    private int loginType;
    private String brand;
    private String anonymousType;

    public SessionAnonymousForm() {
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAnonymousType() {
        return anonymousType;
    }

    public void setAnonymousType(String anonymousType) {
        this.anonymousType = anonymousType;
    }

    @Override
    public String toString() {
        return "SessionAnonymousForm{" +
                "loginType=" + loginType +
                ", brand='" + brand + '\'' +
                ", anonymousType='" + anonymousType + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.loginType);
        dest.writeString(this.brand);
        dest.writeString(this.anonymousType);
    }

    private SessionAnonymousForm(Parcel in) {
        this.loginType = in.readInt();
        this.brand = in.readString();
        this.anonymousType = in.readString();
    }

    public static final Creator<SessionAnonymousForm> CREATOR = new Creator<SessionAnonymousForm>() {
        public SessionAnonymousForm createFromParcel(Parcel source) {
            return new SessionAnonymousForm(source);
        }

        public SessionAnonymousForm[] newArray(int size) {
            return new SessionAnonymousForm[size];
        }
    };
}
