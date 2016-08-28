package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

public class TransferResponseModel implements Parcelable {

    private TransferModel transfer;

    public TransferResponseModel() {
        transfer = new TransferModel();
    }

    public TransferModel getTransfer() {
        return transfer;
    }

    public void setTransfer(TransferModel transfer) {
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "TransferResponseModel{" +
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

    private TransferResponseModel(Parcel in) {
        this.transfer = in.readParcelable(TransferModel.class.getClassLoader());
    }

    public static final Creator<TransferResponseModel> CREATOR =
            new Creator<TransferResponseModel>() {
                public TransferResponseModel createFromParcel(Parcel source) {
                    return new TransferResponseModel(source);
                }

                public TransferResponseModel[] newArray(int size) {
                    return new TransferResponseModel[size];
                }
            };
}
