package com.ideaknow.api.client.forms.tpc;

import android.os.Parcel;
import android.os.Parcelable;

public class OtpForm implements Parcelable {

    public static final String VTPCWITHOUTRISC = "VTPCNOR";
    public static final String VTPCWITHRISC = "VTPCRSC";

    private String otpType = "";

    public OtpForm() {
        this.otpType = "";
    }

    public String getOtpType() {
        return otpType;
    }

    public void setOtpType(String otpType) {
        this.otpType = otpType;
    }

    @Override
    public String toString() {
        return "OtpForm{" +
                "otpType='" + otpType + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.otpType);
    }

    private OtpForm(Parcel in) {
        this.otpType = in.readString();
    }

    public static final Creator<OtpForm> CREATOR = new Creator<OtpForm>() {
        public OtpForm createFromParcel(Parcel source) {
            return new OtpForm(source);
        }

        public OtpForm[] newArray(int size) {
            return new OtpForm[size];
        }
    };
}
