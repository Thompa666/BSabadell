package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.transfer.TransferModel;

public class TransferDuplicatedForm implements Parcelable {

    private TransferModel transfer;

    public TransferDuplicatedForm() {
    }

    public TransferModel getTransfer() {
        return transfer;
    }

    public void setTransfer(TransferModel transfer) {
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "TransferDuplicatedForm{" +
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

    private TransferDuplicatedForm(Parcel in) {
        this.transfer = in.readParcelable(TransferModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<TransferDuplicatedForm> CREATOR = new Parcelable
            .Creator<TransferDuplicatedForm>() {
        public TransferDuplicatedForm createFromParcel(Parcel source) {
            return new TransferDuplicatedForm(source);
        }

        public TransferDuplicatedForm[] newArray(int size) {
            return new TransferDuplicatedForm[size];
        }
    };
}
