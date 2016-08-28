package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.IDKDisplayData;

import java.util.*;

public class CardProductModel extends BaseProductModel implements Parcelable {

    private ArrayList<CardModel> cards;

    public CardProductModel() {
        super();
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public ArrayList<CardModel> getCards() {
        return cards;
    }

    public void setCards(ArrayList<CardModel> cards) {
        this.cards = cards;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && (cards == null || cards.size() == 0);
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        return cards.toArray(new CardModel[cards.size()]);
    }

    @Override
    public String toString() {
        return "CardProductModel{" +
                "cards=" + cards +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.cards);
        dest.writeParcelable(this.amount, 0);
    }

    private CardProductModel(Parcel in) {
        if (cards == null) {
            cards = new ArrayList<CardModel>();
        }
        in.readList(cards, CardModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<CardProductModel> CREATOR = new Creator<CardProductModel>() {
        public CardProductModel createFromParcel(Parcel source) {
            return new CardProductModel(source);
        }

        public CardProductModel[] newArray(int size) {
            return new CardProductModel[size];
        }
    };
}
