package com.ideaknow.api.client.model.nfc;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcSessionModel implements Parcelable {

    private String otp;

    public NfcSessionModel() {
    }

    public String getOTP() {
        return otp;
    }

    public void setOTP(String OTP) {
        this.otp = OTP;
    }

    @Override
    public String toString() {
        return "NfcSessionModel{" +
                "otp='" + otp + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.otp);
    }

    private NfcSessionModel(Parcel in) {
        this.otp = in.readString();
    }

    public static final Creator<NfcSessionModel> CREATOR = new Creator<NfcSessionModel>() {
        public NfcSessionModel createFromParcel(Parcel source) {
            return new NfcSessionModel(source);
        }

        public NfcSessionModel[] newArray(int size) {
            return new NfcSessionModel[size];
        }
    };
}
