package com.ideaknow.api.client.forms.promolayers;

import android.os.Parcel;
import android.os.Parcelable;

public class PromoLayerAvailableForm implements Parcelable {

    public static final String PROMOLAYER_CODE = "#PROMOLAYER_CODE#";
    public static final String PROMOLAYER_CODE_NO_SESSION_INBOX = "NO_SESSION_INBOX";

    private String brand;

    public PromoLayerAvailableForm() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "PromoLayerAvailableForm{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.brand);
    }

    private PromoLayerAvailableForm(Parcel in) {
        this.brand = in.readString();
    }

    public static final Creator<PromoLayerAvailableForm> CREATOR =
            new Creator<PromoLayerAvailableForm>() {
                public PromoLayerAvailableForm createFromParcel(Parcel source) {
                    return new PromoLayerAvailableForm(source);
                }

                public PromoLayerAvailableForm[] newArray(int size) {
                    return new PromoLayerAvailableForm[size];
                }
            };
}
