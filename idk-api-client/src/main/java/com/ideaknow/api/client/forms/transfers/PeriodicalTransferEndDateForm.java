package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.transfer.PeriodicalTransferModel;

public class PeriodicalTransferEndDateForm implements Parcelable {

    private PeriodicalTransferModel periodicalTransfer;

    public PeriodicalTransferEndDateForm() {
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
                "periodicalTransfer=" + periodicalTransfer +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.periodicalTransfer, 0);
    }

    private PeriodicalTransferEndDateForm(Parcel in) {
        this.periodicalTransfer = in.readParcelable(PeriodicalTransferModel.class.getClassLoader());
    }

    public static final Creator<PeriodicalTransferEndDateForm> CREATOR =
            new Creator<PeriodicalTransferEndDateForm>() {
                public PeriodicalTransferEndDateForm createFromParcel(Parcel source) {
                    return new PeriodicalTransferEndDateForm(source);
                }

                public PeriodicalTransferEndDateForm[] newArray(int size) {
                    return new PeriodicalTransferEndDateForm[size];
                }
            };
}
