package com.ideaknow.api.client.forms.nfc;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcSignUpCardModel implements Parcelable {

    private String userId;

    public NfcSignUpCardModel() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "NfcSignUpCardModel{" +
                "userId='" + userId + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userId);
    }

    private NfcSignUpCardModel(Parcel in) {
        this.userId = in.readString();
    }

    public static final Parcelable.Creator<NfcSignUpCardModel> CREATOR =
            new Parcelable.Creator<NfcSignUpCardModel>() {
                public NfcSignUpCardModel createFromParcel(Parcel source) {
                    return new NfcSignUpCardModel(source);
                }

                public NfcSignUpCardModel[] newArray(int size) {
                    return new NfcSignUpCardModel[size];
                }
            };
}
