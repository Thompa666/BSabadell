package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

public class TransferCancelModel implements Parcelable {

    private boolean pendingOffice;

    public TransferCancelModel() {
    }

    public boolean isPendingOffice() {
        return pendingOffice;
    }

    public void setPendingOffice(boolean pendingOffice) {
        this.pendingOffice = pendingOffice;
    }

    @Override
    public String toString() {
        return "CancelTransferModel{" +
                "pendingOffice=" + pendingOffice +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(pendingOffice ? (byte) 1 : (byte) 0);
    }

    private TransferCancelModel(Parcel in) {
        this.pendingOffice = in.readByte() != 0;
    }

    public static final Parcelable.Creator<TransferCancelModel> CREATOR = new Parcelable.Creator<TransferCancelModel>() {
        public TransferCancelModel createFromParcel(Parcel source) {
            return new TransferCancelModel(source);
        }

        public TransferCancelModel[] newArray(int size) {
            return new TransferCancelModel[size];
        }
    };
}
