package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;

public class OwnTransferConditionsDocumentForm implements Parcelable {

    private AmountModel amount;
    private AccountModel originAccount;
    private String format = "";

    public OwnTransferConditionsDocumentForm() {

    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public AccountModel getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(AccountModel originAccount) {
        this.originAccount = originAccount;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "OwnTransferConditionsDocumentForm{" +
                "amount=" + amount +
                ", originAccount=" + originAccount +
                ", format='" + format + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.originAccount, 0);
        dest.writeString(this.format);
    }

    private OwnTransferConditionsDocumentForm(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.originAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.format = in.readString();
    }

    public static Parcelable.Creator<OwnTransferConditionsDocumentForm> CREATOR = new Parcelable.Creator<OwnTransferConditionsDocumentForm>() {
        public OwnTransferConditionsDocumentForm createFromParcel(Parcel source) {
            return new OwnTransferConditionsDocumentForm(source);
        }

        public OwnTransferConditionsDocumentForm[] newArray(int size) {
            return new OwnTransferConditionsDocumentForm[size];
        }
    };
}
