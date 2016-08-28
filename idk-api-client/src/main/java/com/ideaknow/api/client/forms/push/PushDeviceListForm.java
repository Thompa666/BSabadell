package com.ideaknow.api.client.forms.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.alerts.AlertContractModel;

public class PushDeviceListForm implements Parcelable {
    
    private AlertContractModel contract;
        
    public PushDeviceListForm() {
    }

    public AlertContractModel getContract() {
        return contract;
    }

    public void setContract(AlertContractModel contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "PushDeviceListForm{" +
                "contract=" + contract +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.contract, 0);
    }

    private PushDeviceListForm(Parcel in) {
        this.contract = in.readParcelable(AlertContractModel.class.getClassLoader());
    }

    public static Parcelable.Creator<PushDeviceListForm> CREATOR = new Parcelable.Creator<PushDeviceListForm>() {
        public PushDeviceListForm createFromParcel(Parcel source) {
            return new PushDeviceListForm(source);
        }

        public PushDeviceListForm[] newArray(int size) {
            return new PushDeviceListForm[size];
        }
    };
}
