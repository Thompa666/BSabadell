package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class CardListModel implements Parcelable {

    private ArrayList<CardModel> cards;
    private PaginatorModel paginator;

    public CardListModel(){
        paginator = new PaginatorModel();
    }

    public ArrayList<CardModel> getCards() {
        return cards;
    }

    public void setCards(ArrayList<CardModel> cards) {
        this.cards = cards;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "CardListModel{" +
                "cards=" + cards +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.cards);
        dest.writeParcelable(this.paginator, 0);
    }

    private CardListModel(Parcel in) {
        if (cards == null) {
            cards = new ArrayList<CardModel>();
        }
        in.readList(cards, CardModel.class.getClassLoader());

        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CardListModel> CREATOR = new Parcelable.Creator<CardListModel>() {
        public CardListModel createFromParcel(Parcel source) {
            return new CardListModel(source);
        }

        public CardListModel[] newArray(int size) {
            return new CardListModel[size];
        }
    };
}
