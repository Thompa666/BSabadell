package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.KeyValueModel;

import java.util.*;

public class CardStickerForm implements Parcelable {

    private CardModel card;
    private ArrayList<KeyValueModel> keyValues;

    public CardStickerForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }


    public ArrayList<KeyValueModel> getKeyValues() {
        return keyValues;
    }

    public void setKeyValues(ArrayList<KeyValueModel> keyValues) {
        this.keyValues = keyValues;
    }

    @Override
    public String toString() {
        return "CardStickerForm{" +
                "card=" + card +
                ", keyValues=" + keyValues +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeList(this.keyValues);
    }

    private CardStickerForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        if (keyValues == null) {
            keyValues = new ArrayList<KeyValueModel>();
        }
        in.readList(keyValues, KeyValueModel.class.getClassLoader());
    }

    public static final Creator<CardStickerForm> CREATOR = new Creator<CardStickerForm>() {
        public CardStickerForm createFromParcel(Parcel source) {
            return new CardStickerForm(source);
        }

        public CardStickerForm[] newArray(int size) {
            return new CardStickerForm[size];
        }
    };
}
