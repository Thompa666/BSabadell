package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.transfer.PeriodicalTransferModel;

public class PeriodicalTransferForm implements Parcelable {

    private KeyModel key;
    private PeriodicalTransferModel periodicalTransfer;

    public PeriodicalTransferForm() {
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    public PeriodicalTransferModel getPeriodicalTransfer() {
        return periodicalTransfer;
    }

    public void setPeriodicalTransfer(PeriodicalTransferModel periodicalTransfer) {
        this.periodicalTransfer = periodicalTransfer;
    }

    @Override
    public String toString() {
        return "PeriodicalTransferForm{" +
                "key=" + key +
                ", periodicalTransfer=" + periodicalTransfer +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.key, 0);
        dest.writeParcelable(this.periodicalTransfer, 0);
    }

    private PeriodicalTransferForm(Parcel in) {
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
        this.periodicalTransfer = in.readParcelable(PeriodicalTransferModel.class.getClassLoader());
    }

    public static final Creator<PeriodicalTransferForm> CREATOR =
            new Parcelable.Creator<PeriodicalTransferForm>() {
                public PeriodicalTransferForm createFromParcel(Parcel source) {
                    return new PeriodicalTransferForm(source);
                }

                public PeriodicalTransferForm[] newArray(int size) {
                    return new PeriodicalTransferForm[size];
                }
            };
}
