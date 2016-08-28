package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;

public class CardBlockedForm implements Parcelable {

    public static final String PARAM_STRING_LOST = "lost";
    public static final String PARAM_STRING_STOLEN = "stolen";
    public static final String PARAM_STRING_DAMAGED = "damaged";
    public static final String PARAM_STRING_HOME = "home";
    public static final String PARAM_STRING_OFFICE = "office";

    private CardModel card;
    private String address;
    private String reason;
    private boolean cardActive;

    public CardBlockedForm(CardModel card) {
        this.card = card;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isCardActive() {
        return cardActive;
    }

    public void setCardActive(boolean cardActive) {
        this.cardActive = cardActive;
    }

    @Override
    public String toString() {
        return "CardBlockedForm{" +
                "card=" + card +
                ", address='" + address + '\'' +
                ", reason='" + reason + '\'' +
                ", cardActive=" + cardActive +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeString(this.address);
        dest.writeString(this.reason);
        dest.writeByte(cardActive ? (byte) 1 : (byte) 0);
    }

    private CardBlockedForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.address = in.readString();
        this.reason = in.readString();
        this.cardActive = in.readByte() != 0;
    }

    public static final Creator<CardBlockedForm> CREATOR = new Creator<CardBlockedForm>() {
        public CardBlockedForm createFromParcel(Parcel source) {
            return new CardBlockedForm(source);
        }

        public CardBlockedForm[] newArray(int size) {
            return new CardBlockedForm[size];
        }
    };
}
