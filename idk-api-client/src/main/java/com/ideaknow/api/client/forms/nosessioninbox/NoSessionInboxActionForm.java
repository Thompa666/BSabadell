package com.ideaknow.api.client.forms.nosessioninbox;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class NoSessionInboxActionForm implements Parcelable {

    private String inscriptionKey;
    private String personNumber;
    private int loginType;
    private String brand;
    private ArrayList<String> messageIDs;

    public NoSessionInboxActionForm() {
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

    public ArrayList<String> getMessageIDs() {
        return messageIDs;
    }

    public void setMessageIDs(ArrayList<String> messageIDs) {
        this.messageIDs = messageIDs;
    }

    @Override
    public String toString() {
        return "NoSessionInboxActionForm{" +
                "inscriptionKey='" + inscriptionKey + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", loginType=" + loginType +
                ", brand='" + brand + '\'' +
                ", messageIDs=" + messageIDs +
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
        dest.writeList(this.messageIDs);
    }

    private NoSessionInboxActionForm(Parcel in) {
        this.inscriptionKey = in.readString();
        this.personNumber = in.readString();
        this.loginType = in.readInt();
        this.brand = in.readString();
        if (messageIDs == null) {
            messageIDs = new ArrayList<String>();
        }
        in.readList(messageIDs, String.class.getClassLoader());
    }

    public static final Creator<NoSessionInboxActionForm> CREATOR = new
            Creator<NoSessionInboxActionForm>() {
                public NoSessionInboxActionForm createFromParcel(Parcel source) {
                    return new NoSessionInboxActionForm(source);
                }

                public NoSessionInboxActionForm[] newArray(int size) {
                    return new NoSessionInboxActionForm[size];
                }
            };
}
