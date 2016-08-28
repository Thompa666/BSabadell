package com.ideaknow.api.client.forms.nfc;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcSessionForm implements Parcelable {

    private String userId;
    private String deviceId;

    public NfcSessionForm() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "NfcSessionForm{" +
                "userId='" + userId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userId);
        dest.writeString(this.deviceId);
    }

    private NfcSessionForm(Parcel in) {
        this.userId = in.readString();
        this.deviceId = in.readString();
    }

    public static final Creator<NfcSessionForm> CREATOR = new Creator<NfcSessionForm>() {
        public NfcSessionForm createFromParcel(Parcel source) {
            return new NfcSessionForm(source);
        }

        public NfcSessionForm[] newArray(int size) {
            return new NfcSessionForm[size];
        }
    };
}
