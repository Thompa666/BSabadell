package com.ideaknow.api.client.model.push;

import android.os.Parcel;
import android.os.Parcelable;

public class PushDeviceResponseModel implements Parcelable {

    private PushDeviceModel device;

    public PushDeviceResponseModel() {
    }

    @Override
    public String toString() {
        return "PushDeviceResponseModel{" +
                "device=" + device +
                '}';
    }

    public PushDeviceModel getDevice() {
        return device;
    }

    public void setDevice(PushDeviceModel device) {
        this.device = device;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.device, 0);
    }

    private PushDeviceResponseModel(Parcel in) {
        this.device = in.readParcelable(PushDeviceModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<PushDeviceResponseModel> CREATOR =
            new Parcelable.Creator<PushDeviceResponseModel>() {
                public PushDeviceResponseModel createFromParcel(Parcel source) {
                    return new PushDeviceResponseModel(source);
                }

                public PushDeviceResponseModel[] newArray(int size) {
                    return new PushDeviceResponseModel[size];
                }
            };
}
