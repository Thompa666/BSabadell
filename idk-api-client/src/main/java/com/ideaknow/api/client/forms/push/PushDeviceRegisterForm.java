package com.ideaknow.api.client.forms.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.alerts.AlertContractModel;
import com.ideaknow.api.client.model.push.PushDeviceModel;

public class PushDeviceRegisterForm implements Parcelable {
    
    private PushDeviceModel device;
    private AlertContractModel contract;
    
    public PushDeviceRegisterForm() {
    }

    public PushDeviceModel getDevice() {
        return device;
    }

    public void setDevice(PushDeviceModel device) {
        this.device = device;
    }

    public AlertContractModel getContract() {
        return contract;
    }

    public void setContract(AlertContractModel contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "PushDeviceRegisterForm{" +
                "device=" + device +
                ", contract=" + contract +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.device, 0);
        dest.writeParcelable(this.contract, 0);
    }

    private PushDeviceRegisterForm(Parcel in) {
        this.device = in.readParcelable(PushDeviceModel.class.getClassLoader());
        this.contract = in.readParcelable(AlertContractModel.class.getClassLoader());
    }

    public static Parcelable.Creator<PushDeviceRegisterForm> CREATOR = new Parcelable.Creator<PushDeviceRegisterForm>() {
        public PushDeviceRegisterForm createFromParcel(Parcel source) {
            return new PushDeviceRegisterForm(source);
        }

        public PushDeviceRegisterForm[] newArray(int size) {
            return new PushDeviceRegisterForm[size];
        }
    };
}
