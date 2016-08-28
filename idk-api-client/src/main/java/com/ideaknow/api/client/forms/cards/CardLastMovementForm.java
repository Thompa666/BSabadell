package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.cards.CardMovementModel;

public class CardLastMovementForm implements Parcelable {

    private CardModel card;
    private CardMovementModel cardMovement;

    public CardLastMovementForm() {
    }

    public CardMovementModel getCardMovement() {
        return cardMovement;
    }

    public void setCardMovement(CardMovementModel cardMovement) {
        this.cardMovement = cardMovement;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "CardLastMovementForm{" +
                "card=" + card +
                ", cardMovement=" + cardMovement +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.cardMovement, 0);
    }

    private CardLastMovementForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.cardMovement = in.readParcelable(CardMovementModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<CardLastMovementForm> CREATOR =
            new Parcelable.Creator<CardLastMovementForm>() {
                public CardLastMovementForm createFromParcel(Parcel source) {
                    return new CardLastMovementForm(source);
                }

                public CardLastMovementForm[] newArray(int size) {
                    return new CardLastMovementForm[size];
                }
            };
}
