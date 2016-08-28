package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;

public class CardSettlementDocForm implements Parcelable {

    private String id;
    private String format;

    public CardSettlementDocForm() {
        format = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "DocumentForm{" +
                "id='" + id + '\'' +
                ", format='" + format + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.format);
    }

    private CardSettlementDocForm(Parcel in) {
        this.id = in.readString();
        this.format = in.readString();
    }

    public static Parcelable.Creator<CardSettlementDocForm> CREATOR = new Parcelable.Creator<CardSettlementDocForm>() {
        public CardSettlementDocForm createFromParcel(Parcel source) {
            return new CardSettlementDocForm(source);
        }

        public CardSettlementDocForm[] newArray(int size) {
            return new CardSettlementDocForm[size];
        }
    };
}
