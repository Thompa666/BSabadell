package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

public class PeriodicalTransferResponseModel implements Parcelable {

    private PeriodicalTransferModel periodicalTransfer;

    public PeriodicalTransferResponseModel() {
    }

    public PeriodicalTransferModel getPeriodicalTransfer() {
        return periodicalTransfer;
    }

    public void setPeriodicalTransfer(PeriodicalTransferModel periodicalTransfer) {
        this.periodicalTransfer = periodicalTransfer;
    }

    @Override
    public String toString() {
        return "PeriodicalTransferResponseModel{" +
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

    private PeriodicalTransferResponseModel(Parcel in) {
        this.periodicalTransfer = in.readParcelable(PeriodicalTransferModel.class.getClassLoader());
    }

    public static final Creator<PeriodicalTransferResponseModel> CREATOR =
            new Parcelable.Creator<PeriodicalTransferResponseModel>() {
                public PeriodicalTransferResponseModel createFromParcel(Parcel source) {
                    return new PeriodicalTransferResponseModel(source);
                }

                public PeriodicalTransferResponseModel[] newArray(int size) {
                    return new PeriodicalTransferResponseModel[size];
                }
            };
}
