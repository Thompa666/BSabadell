package com.ideaknow.api.client.model.atmmobile;

import android.os.Parcel;
import android.os.Parcelable;

public class AtmMobileOtpModel implements Parcelable {

    private String otp;

    public AtmMobileOtpModel() {
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "AtmMobileOtpModel{" +
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

    private AtmMobileOtpModel(Parcel in) {
        this.otp = in.readString();
    }

    public static final Creator<AtmMobileOtpModel> CREATOR = new Creator<AtmMobileOtpModel>() {
        public AtmMobileOtpModel createFromParcel(Parcel source) {
            return new AtmMobileOtpModel(source);
        }

        public AtmMobileOtpModel[] newArray(int size) {
            return new AtmMobileOtpModel[size];
        }
    };
}
