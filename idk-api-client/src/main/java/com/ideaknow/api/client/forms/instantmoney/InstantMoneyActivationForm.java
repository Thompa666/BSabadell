package com.ideaknow.api.client.forms.instantmoney;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.alerts.AlertContractModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class InstantMoneyActivationForm implements Parcelable {

    private AlertContractModel alertContract;
    private KeyModel key;

    public InstantMoneyActivationForm() {

    }

    public AlertContractModel getAlertContract() {
        return alertContract;
    }

    public void setAlertContract(AlertContractModel alertContract) {
        this.alertContract = alertContract;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "InstantMoneyActivationForm{" +
                "alertContract=" + alertContract +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.alertContract, 0);
        dest.writeParcelable(this.key, 0);
    }

    private InstantMoneyActivationForm(Parcel in) {
        this.alertContract = in.readParcelable(AlertContractModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<InstantMoneyActivationForm> CREATOR =
            new Creator<InstantMoneyActivationForm>() {
        public InstantMoneyActivationForm createFromParcel(Parcel source) {
            return new InstantMoneyActivationForm(source);
        }

        public InstantMoneyActivationForm[] newArray(int size) {
            return new InstantMoneyActivationForm[size];
        }
    };
}
