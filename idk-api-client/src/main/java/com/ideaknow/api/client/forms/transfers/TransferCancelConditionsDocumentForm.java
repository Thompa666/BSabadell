package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.transfer.TransferModel;

public class TransferCancelConditionsDocumentForm implements Parcelable {

    public static final String PDF = "pdf";

    private TransferModel transfer;
    private String format = "";

    public TransferCancelConditionsDocumentForm() {

    }

    public TransferModel getTransfer() {
        return transfer;
    }

    public void setTransfer(TransferModel transfer) {
        this.transfer = transfer;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "CancelTransferConditionsDocumentForm{" +
                "transfer=" + transfer +
                ", format='" + format + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.transfer, 0);
        dest.writeString(this.format);
    }

    private TransferCancelConditionsDocumentForm(Parcel in) {
        this.transfer = in.readParcelable(TransferModel.class.getClassLoader());
        this.format = in.readString();
    }

    public static final Parcelable.Creator<TransferCancelConditionsDocumentForm> CREATOR =
            new Parcelable.Creator<TransferCancelConditionsDocumentForm>() {
                public TransferCancelConditionsDocumentForm createFromParcel(Parcel source) {
                    return new TransferCancelConditionsDocumentForm(source);
                }

                public TransferCancelConditionsDocumentForm[] newArray(int size) {
                    return new TransferCancelConditionsDocumentForm[size];
                }
            };
}
