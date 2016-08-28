package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

public class CardLastMovementModel implements Parcelable {

    private CardMovementModel cardMovement;

    public CardLastMovementModel() {
    }

    public CardMovementModel getCardMovement() {
        return cardMovement;
    }

    public void setCardMovement(CardMovementModel cardMovement) {
        this.cardMovement = cardMovement;
    }

    @Override
    public String toString() {
        return "CardLastMovementModel{" +
                "cardMovement=" + cardMovement +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.cardMovement, 0);
    }

    private CardLastMovementModel(Parcel in) {
        this.cardMovement = in.readParcelable(CardMovementModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<CardLastMovementModel> CREATOR =
            new Parcelable.Creator<CardLastMovementModel>() {
                public CardLastMovementModel createFromParcel(Parcel source) {
                    return new CardLastMovementModel(source);
                }

                public CardLastMovementModel[] newArray(int size) {
                    return new CardLastMovementModel[size];
                }
            };
}
