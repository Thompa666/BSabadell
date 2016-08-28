package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;

public class CardConditionsForm implements Parcelable {

    private CardModel card;

    public CardConditionsForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "CardConditionsForm{" +
                "card=" + card +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
    }

    private CardConditionsForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CardConditionsForm> CREATOR = new Parcelable.Creator<CardConditionsForm>() {
        public CardConditionsForm createFromParcel(Parcel source) {
            return new CardConditionsForm(source);
        }

        public CardConditionsForm[] newArray(int size) {
            return new CardConditionsForm[size];
        }
    };
}
