package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardActivationForm implements Parcelable {

    private CardModel card;
    private boolean activateAlerts;
    private KeyModel key;

    public CardActivationForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public void setCCV2(String cvv2) {
        this.card.setCvv2(cvv2);
    }

    public void expirationDate(String expirationDate) {
        this.card.setExpirationDate(expirationDate);
    }

    public boolean isActivateAlerts() {
        return activateAlerts;
    }

    public void setActivateAlerts(boolean activateAlerts) {
        this.activateAlerts = activateAlerts;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "CardActivationForm{" +
                "card=" + card +
                ", activateAlerts=" + activateAlerts +
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
        dest.writeByte(activateAlerts ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.key, 0);
    }

    private CardActivationForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.activateAlerts = in.readByte() != 0;
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<CardActivationForm> CREATOR = new Creator<CardActivationForm>() {
        public CardActivationForm createFromParcel(Parcel source) {
            return new CardActivationForm(source);
        }

        public CardActivationForm[] newArray(int size) {
            return new CardActivationForm[size];
        }
    };
}
