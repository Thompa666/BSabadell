package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.cards.CardProfileRulesListModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardProfileForm implements Parcelable {

    private CardModel card;
    private CardProfileRulesListModel profile;
    private KeyModel key;

    public CardProfileForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public CardProfileRulesListModel getProfile() {
        return profile;
    }

    public void setProfile(CardProfileRulesListModel profile) {
        this.profile = profile;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "CardProfileForm{" +
                "card=" + card +
                ", profile=" + profile +
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
        dest.writeParcelable(this.profile, 0);
        dest.writeParcelable(this.key, 0);
    }

    private CardProfileForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.profile = in.readParcelable(CardProfileRulesListModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CardProfileForm> CREATOR = new Parcelable.Creator<CardProfileForm>() {
        public CardProfileForm createFromParcel(Parcel source) {
            return new CardProfileForm(source);
        }

        public CardProfileForm[] newArray(int size) {
            return new CardProfileForm[size];
        }
    };
}
