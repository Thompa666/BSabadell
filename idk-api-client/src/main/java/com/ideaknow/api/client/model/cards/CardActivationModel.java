package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;

public class CardActivationModel implements Parcelable {

    private CardModel card;
    private String pin;

    public CardActivationModel() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "CardActivationModel{" +
                "card=" + card +
                ", pin='" + pin + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeString(this.pin);
    }

    private CardActivationModel(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.pin = in.readString();
    }

    public static Parcelable.Creator<CardActivationModel> CREATOR = new Parcelable.Creator<CardActivationModel>() {
        public CardActivationModel createFromParcel(Parcel source) {
            return new CardActivationModel(source);
        }

        public CardActivationModel[] newArray(int size) {
            return new CardActivationModel[size];
        }
    };
}
