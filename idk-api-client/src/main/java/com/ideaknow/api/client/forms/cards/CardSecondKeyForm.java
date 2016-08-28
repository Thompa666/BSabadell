package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardSecondKeyForm implements Parcelable {

    private CardModel card;
    private KeyModel key;

    public CardSecondKeyForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "CardSecondKeyForm{" +
                "card=" + card +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.key, 0);
    }

    private CardSecondKeyForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static Creator<CardSecondKeyForm> CREATOR = new Creator<CardSecondKeyForm>() {
        public CardSecondKeyForm createFromParcel(Parcel source) {
            return new CardSecondKeyForm(source);
        }

        public CardSecondKeyForm[] newArray(int size) {
            return new CardSecondKeyForm[size];
        }
    };
}
