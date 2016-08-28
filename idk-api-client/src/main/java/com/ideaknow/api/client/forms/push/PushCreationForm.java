package com.ideaknow.api.client.forms.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.alerts.AlertContractModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class PushCreationForm implements Parcelable {
    
    private String brand;
    private AlertContractModel contract;
    /**
     * Always true when registering for push
     */
    private boolean masivePns;
    private KeyModel key;
    
    public PushCreationForm() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public AlertContractModel getContract() {
        return contract;
    }

    public void setContract(AlertContractModel contract) {
        this.contract = contract;
    }

    public boolean isMasivePns() {
        return masivePns;
    }

    public void setMasivePns(boolean masivePns) {
        this.masivePns = masivePns;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "PushCreationForm{" +
                "brand='" + brand + '\'' +
                ", contract=" + contract +
                ", masivePns=" + masivePns +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.brand);
        dest.writeParcelable(this.contract, 0);
        dest.writeByte(masivePns ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.key, 0);
    }

    private PushCreationForm(Parcel in) {
        this.brand = in.readString();
        this.contract = in.readParcelable(AlertContractModel.class.getClassLoader());
        this.masivePns = in.readByte() != 0;
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static Parcelable.Creator<PushCreationForm> CREATOR = new Parcelable.Creator<PushCreationForm>() {
        public PushCreationForm createFromParcel(Parcel source) {
            return new PushCreationForm(source);
        }

        public PushCreationForm[] newArray(int size) {
            return new PushCreationForm[size];
        }
    };
}
