package com.ideaknow.api.client.forms.promolayers;

import android.os.Parcel;
import android.os.Parcelable;

public class PromoLayerForm implements Parcelable {

    private String layerCode;
    private String status;

    public PromoLayerForm() {
    }

    public String getLayerCode() {
        return layerCode;
    }

    public void setLayerCode(String layerCode) {
        this.layerCode = layerCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PromoLayerForm{" +
                "layerCode='" + layerCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.layerCode);
        dest.writeString(this.status);
    }

    private PromoLayerForm(Parcel in) {
        this.layerCode = in.readString();
        this.status = in.readString();
    }

    public static final Creator<PromoLayerForm> CREATOR = new Creator<PromoLayerForm>() {
        public PromoLayerForm createFromParcel(Parcel source) {
            return new PromoLayerForm(source);
        }

        public PromoLayerForm[] newArray(int size) {
            return new PromoLayerForm[size];
        }
    };
}
