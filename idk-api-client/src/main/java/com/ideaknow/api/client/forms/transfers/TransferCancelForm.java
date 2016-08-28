package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.transfer.TransferModel;

public class TransferCancelForm implements Parcelable {

    private TransferModel transfer;
    private KeyModel key;

    public TransferCancelForm() {
    }

    public TransferModel getTransfer() {
        return transfer;
    }

    public void setTransfer(TransferModel transfer) {
        this.transfer = transfer;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "TransferForm{" +
                "transfer=" + transfer +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.transfer, 0);
        dest.writeParcelable(this.key, 0);
    }

    private TransferCancelForm(Parcel in) {
        this.transfer = in.readParcelable(TransferModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<TransferCancelForm> CREATOR =
            new Parcelable.Creator<TransferCancelForm>() {
        public TransferCancelForm createFromParcel(Parcel source) {
            return new TransferCancelForm(source);
        }

        public TransferCancelForm[] newArray(int size) {
            return new TransferCancelForm[size];
        }
    };
}
