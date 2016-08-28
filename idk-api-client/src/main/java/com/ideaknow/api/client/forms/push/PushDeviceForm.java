package com.ideaknow.api.client.forms.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.push.PushDeviceModel;

public class PushDeviceForm implements Parcelable {

    private PushDeviceModel device;

    public PushDeviceForm() {
    }

    public PushDeviceModel getDevice() {
        return device;
    }

    public void setDevice(PushDeviceModel device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "PushDeviceForm{" +
                "device=" + device +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.device, 0);
    }

    private PushDeviceForm(Parcel in) {
        this.device = in.readParcelable(PushDeviceModel.class.getClassLoader());
    }

    public static Parcelable.Creator<PushDeviceForm> CREATOR = new Parcelable.Creator<PushDeviceForm>() {
        public PushDeviceForm createFromParcel(Parcel source) {
            return new PushDeviceForm(source);
        }

        public PushDeviceForm[] newArray(int size) {
            return new PushDeviceForm[size];
        }
    };
}
