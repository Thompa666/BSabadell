package com.ideaknow.api.client.forms.nosessioninbox;

import android.os.Parcel;
import android.os.Parcelable;

public class NoSessionInboxListForm implements Parcelable {

    private String inscriptionKey;
    private String personNumber;
    private int loginType;
    private String brand;
    private String tsFrom;

    public NoSessionInboxListForm() {
    }

    public String getInscriptionKey() {
        return inscriptionKey;
    }

    public void setInscriptionKey(String inscriptionKey) {
        this.inscriptionKey = inscriptionKey;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
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

    public String getTsFrom() {
        return tsFrom;
    }

    public void setTsFrom(String tsFrom) {
        this.tsFrom = tsFrom;
    }

    @Override
    public String toString() {
        return "NoSessionInboxListForm{" +
                "inscriptionKey='" + inscriptionKey + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", loginType=" + loginType +
                ", brand='" + brand + '\'' +
                ", tsFrom='" + tsFrom + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.inscriptionKey);
        dest.writeString(this.personNumber);
        dest.writeInt(this.loginType);
        dest.writeString(this.brand);
        dest.writeString(this.tsFrom);
    }

    private NoSessionInboxListForm(Parcel in) {
        this.inscriptionKey = in.readString();
        this.personNumber = in.readString();
        this.loginType = in.readInt();
        this.brand = in.readString();
        this.tsFrom = in.readString();
    }

    public static final Creator<NoSessionInboxListForm> CREATOR = new Creator<NoSessionInboxListForm>() {
        public NoSessionInboxListForm createFromParcel(Parcel source) {
            return new NoSessionInboxListForm(source);
        }

        public NoSessionInboxListForm[] newArray(int size) {
            return new NoSessionInboxListForm[size];
        }
    };
}
