package com.ideaknow.api.client.model.push;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class PushDeviceListModel implements Parcelable {

    private ArrayList<PushDeviceModel> devices;

    public PushDeviceListModel() {
    }

    public ArrayList<PushDeviceModel> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<PushDeviceModel> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "PushDeviceListModel{" +
                "devices=" + devices +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.devices);
    }

    private PushDeviceListModel(Parcel in) {
        if (devices == null) {
            devices = new ArrayList<PushDeviceModel>();
        }
        in.readList(devices, PushDeviceModel.class.getClassLoader());
    }

    public static Parcelable.Creator<PushDeviceListModel> CREATOR = new Parcelable.Creator<PushDeviceListModel>() {
        public PushDeviceListModel createFromParcel(Parcel source) {
            return new PushDeviceListModel(source);
        }

        public PushDeviceListModel[] newArray(int size) {
            return new PushDeviceListModel[size];
        }
    };
}
