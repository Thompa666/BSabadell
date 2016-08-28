package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import com.ideaknow.api.client.model.CardModel;

public class CardSettlementsForm extends CardForm implements android.os.Parcelable {

    private String dateFrom;
    private String dateTo;

    public CardSettlementsForm(CardModel card) {
        super(card);
        dateFrom = "";
        dateTo = "";
    }

    public CardSettlementsForm(CardModel card, String dateFrom, String dateTo) {
        super(card);
        this.dateFrom = dateFrom == null ? "" : dateFrom;
        this.dateTo = dateTo == null ? "" : dateFrom;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public String toString() {
        return "CardSettlementsForm{" +
                "dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                "," + super.toString() + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.dateFrom);
        dest.writeString(this.dateTo);
        dest.writeParcelable(this.card, 0);
    }

    private CardSettlementsForm(Parcel in) {
        super(in);
        this.dateFrom = in.readString();
        this.dateTo = in.readString();
        this.card = in.readParcelable(((Object) card).getClass().getClassLoader());
    }

    public static Creator<CardSettlementsForm> CREATOR = new Creator<CardSettlementsForm>() {
        public CardSettlementsForm createFromParcel(Parcel source) {
            return new CardSettlementsForm(source);
        }

        public CardSettlementsForm[] newArray(int size) {
            return new CardSettlementsForm[size];
        }
    };
}
