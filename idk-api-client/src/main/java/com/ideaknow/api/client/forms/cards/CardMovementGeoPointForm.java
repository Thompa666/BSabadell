package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.cards.CardMovementModel;

import java.util.*;

public class CardMovementGeoPointForm implements Parcelable {

    private ArrayList<CardMovementModel> cardMovements;

    public CardMovementGeoPointForm() {
    }

    public ArrayList<CardMovementModel> getCardMovements() {
        return cardMovements;
    }

    public void setCardMovements(ArrayList<CardMovementModel> cardMovements) {
        this.cardMovements = cardMovements;
    }

    @Override
    public String toString() {
        return "CardMovementGeoPointForm{" +
                "cardMovements=" + cardMovements +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.cardMovements);
    }

    private CardMovementGeoPointForm(Parcel in) {
        if (this.cardMovements == null) {
            this.cardMovements = new ArrayList<CardMovementModel>();
        }
        in.readList(this.cardMovements, CardMovementModel.class.getClassLoader());
    }

    public static final Creator<CardMovementGeoPointForm> CREATOR =
            new Creator<CardMovementGeoPointForm>() {
                public CardMovementGeoPointForm createFromParcel(Parcel source) {
                    return new CardMovementGeoPointForm(source);
                }

                public CardMovementGeoPointForm[] newArray(int size) {
                    return new CardMovementGeoPointForm[size];
                }
            };
}
