package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;

public class CardPDFConditionForm implements Parcelable {

    private String dms;
    private String format;

    public CardPDFConditionForm() {
        format = "pdf";
    }

    public String getDms() {
        return dms;
    }

    public void setDms(String dms) {
        this.dms = dms;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "CardPDFConditionForm{" +
                "dms=" + dms +
                ", format=" + format +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.dms);
        dest.writeString(this.format);
    }

    public static Parcelable.Creator<CardPDFConditionForm> CREATOR = new Parcelable.Creator<CardPDFConditionForm>() {
        public CardPDFConditionForm createFromParcel(Parcel source) {
            return new CardPDFConditionForm();
        }

        public CardPDFConditionForm[] newArray(int size) {
            return new CardPDFConditionForm[size];
        }
    };
}
