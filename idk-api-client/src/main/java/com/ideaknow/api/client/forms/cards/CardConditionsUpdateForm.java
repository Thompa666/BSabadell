package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardConditionsUpdateForm implements Parcelable {

    private CardModel card;
    private KeyModel key;
    private String value;
    private String mode;

    public CardConditionsUpdateForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "CardConditionsUpdateForm{" +
                "card=" + card +
                ", key=" + key +
                ", value='" + value + '\'' +
                ", mode='" + mode + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.key, 0);
        dest.writeString(this.value);
        dest.writeString(this.mode);
    }

    private CardConditionsUpdateForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
        this.value = in.readString();
        this.mode = in.readString();
    }

    public static Creator<CardConditionsUpdateForm> CREATOR = new Creator<CardConditionsUpdateForm>() {
        public CardConditionsUpdateForm createFromParcel(Parcel source) {
            return new CardConditionsUpdateForm(source);
        }

        public CardConditionsUpdateForm[] newArray(int size) {
            return new CardConditionsUpdateForm[size];
        }
    };
}
