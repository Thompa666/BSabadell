package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class CardMovementGeoPointModel implements Parcelable {

    private ArrayList<CardMovementModel> cardMovements;

    public CardMovementGeoPointModel() {
    }

    public ArrayList<CardMovementModel> getCardMovements() {
        return cardMovements;
    }

    public void setCardMovements(ArrayList<CardMovementModel> cardMovements) {
        this.cardMovements = cardMovements;
    }

    @Override
    public String toString() {
        return "CardMovementGeoPointModel{" +
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

    private CardMovementGeoPointModel(Parcel in) {
        if (this.cardMovements == null) {
            this.cardMovements = new ArrayList<CardMovementModel>();
        }
        in.readList(this.cardMovements, CardMovementModel.class.getClassLoader());
    }

    public static final Creator<CardMovementGeoPointModel> CREATOR =
            new Creator<CardMovementGeoPointModel>() {
                public CardMovementGeoPointModel createFromParcel(Parcel source) {
                    return new CardMovementGeoPointModel(source);
                }

                public CardMovementGeoPointModel[] newArray(int size) {
                    return new CardMovementGeoPointModel[size];
                }
            };
}
