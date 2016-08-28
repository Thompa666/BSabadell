package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.cards.CardMovementModel;

import java.util.*;

public class ProductsCardsModel extends BaseProductModel implements Parcelable {

    private ArrayList<CardModel> cards;
    private CardMovementModel cardMovement;

    public ProductsCardsModel() {

    }

    public ArrayList<CardModel> getCards() {
        return cards;
    }

    public void setCards(ArrayList<CardModel> cards) {
        this.cards = cards;
    }

    public CardMovementModel getCardMovement() {
        return cardMovement;
    }

    public void setCardMovement(CardMovementModel cardMovement) {
        this.cardMovement = cardMovement;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && (cards == null || cards.size() > 0);
    }

    @Override
    public String toString() {
        return "ProductsCardsModel{" +
                "cards=" + cards +
                ", cardMovement=" + cardMovement +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.cards);
        dest.writeParcelable(this.cardMovement, 0);
        dest.writeParcelable(this.amount, 0);
    }

    private ProductsCardsModel(Parcel in) {
        if (this.cards == null) {
            this.cards = new ArrayList<CardModel>();
        }
        in.readList(this.cards, CardModel.class.getClassLoader());
        this.cardMovement = in.readParcelable(CardMovementModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<ProductsCardsModel> CREATOR = new Creator<ProductsCardsModel>() {
        public ProductsCardsModel createFromParcel(Parcel source) {
            return new ProductsCardsModel(source);
        }

        public ProductsCardsModel[] newArray(int size) {
            return new ProductsCardsModel[size];
        }
    };
}
