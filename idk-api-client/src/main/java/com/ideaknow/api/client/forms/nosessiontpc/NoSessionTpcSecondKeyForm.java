package com.ideaknow.api.client.forms.nosessiontpc;

import android.os.Parcel;
import android.os.Parcelable;

public class NoSessionTpcSecondKeyForm implements Parcelable {

    private int loginType;
    private String brand;
    private String personNumber;
    private String hashOTP;
    private boolean risk;

    public NoSessionTpcSecondKeyForm() {
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

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getHashOTP() {
        return hashOTP;
    }

    public void setHashOTP(String hashOTP) {
        this.hashOTP = hashOTP;
    }

    public boolean isRisk() {
        return risk;
    }

    public void setRisk(boolean risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        return "NoSessionTpcSecondKeyForm{" +
                "loginType=" + loginType +
                ", brand='" + brand + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", hashOTP='" + hashOTP + '\'' +
                ", risk=" + risk +
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
        dest.writeString(this.personNumber);
        dest.writeString(this.hashOTP);
        dest.writeByte(risk ? (byte) 1 : (byte) 0);
    }

    private NoSessionTpcSecondKeyForm(Parcel in) {
        this.loginType = in.readInt();
        this.brand = in.readString();
        this.personNumber = in.readString();
        this.hashOTP = in.readString();
        this.risk = in.readByte() != 0;
    }

    public static final Creator<NoSessionTpcSecondKeyForm> CREATOR =
            new Creator<NoSessionTpcSecondKeyForm>() {
                public NoSessionTpcSecondKeyForm createFromParcel(Parcel source) {
                    return new NoSessionTpcSecondKeyForm(source);
                }

                public NoSessionTpcSecondKeyForm[] newArray(int size) {
                    return new NoSessionTpcSecondKeyForm[size];
                }
            };
}
