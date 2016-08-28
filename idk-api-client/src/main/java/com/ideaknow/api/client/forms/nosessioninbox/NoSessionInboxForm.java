package com.ideaknow.api.client.forms.nosessioninbox;

import android.os.Parcel;
import android.os.Parcelable;

public class NoSessionInboxForm implements Parcelable {

    private String inscriptionKey;
    private String personNumber;
    private int loginType;
    private String brand;
    private String messageID;

    public NoSessionInboxForm() {
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

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    @Override
    public String toString() {
        return "NoSessionInboxForm{" +
                "inscriptionKey='" + inscriptionKey + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", loginType=" + loginType +
                ", brand='" + brand + '\'' +
                ", messageID='" + messageID + '\'' +
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
        dest.writeString(this.messageID);
    }

    private NoSessionInboxForm(Parcel in) {
        this.inscriptionKey = in.readString();
        this.personNumber = in.readString();
        this.loginType = in.readInt();
        this.brand = in.readString();
        this.messageID = in.readString();
    }

    public static final Creator<NoSessionInboxForm> CREATOR = new Creator<NoSessionInboxForm>() {
        public NoSessionInboxForm createFromParcel(Parcel source) {
            return new NoSessionInboxForm(source);
        }

        public NoSessionInboxForm[] newArray(int size) {
            return new NoSessionInboxForm[size];
        }
    };
}
