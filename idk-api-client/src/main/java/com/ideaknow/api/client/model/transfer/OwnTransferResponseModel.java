package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

public class OwnTransferResponseModel implements Parcelable {

    private OwnTransferModel transfer;

    public OwnTransferResponseModel() {
    }

    public OwnTransferModel getTransfer() {
        return transfer;
    }

    public void setTransfer(OwnTransferModel transfer) {
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "OwnTransferResponseModel{" +
                "transfer=" + transfer +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.transfer, 0);
    }

    private OwnTransferResponseModel(Parcel in) {
        this.transfer = in.readParcelable(OwnTransferModel.class.getClassLoader());
    }

    public static final Creator<OwnTransferResponseModel> CREATOR = new Creator<OwnTransferResponseModel>() {
        public OwnTransferResponseModel createFromParcel(Parcel source) {
            return new OwnTransferResponseModel(source);
        }

        public OwnTransferResponseModel[] newArray(int size) {
            return new OwnTransferResponseModel[size];
        }
    };
}
