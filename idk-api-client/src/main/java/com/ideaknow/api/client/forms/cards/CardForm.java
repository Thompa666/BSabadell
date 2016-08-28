package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.PaginatorModel;

public class CardForm implements Parcelable {

    public static final String CARD_SPLIT_DEBIT = "CTA_CARD_SPLIT_DEBIT";
    public static final String CARD_NORMAL = "CTA_CARD_0134567";
    public static final String CARD_PREPAID_RELOAD_SELECTOR = "CTA_CARD_NTCB_034";
    public static final String CARD_ALL = "CTA_CARD_ALL";
    public static final String CARD_SELECTOR = "CTA_CARD_0367B";
    public static final String CARD_IS_OWNER = "CTA_CARD_034B"; // For ATM also
    public static final String CARD_STICKER_REQUEST = "CTA_CARD_STICKER_REQUEST";

    protected CardModel card;
    private PaginatorModel paginator;

    public CardForm(){

    }

    public CardForm(CardModel card) {
        this.card = card;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "CardForm{" +
                "card=" + card +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.paginator, 0);
    }

    public CardForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Creator<CardForm> CREATOR = new Creator<CardForm>() {
        public CardForm createFromParcel(Parcel source) {
            return new CardForm(source);
        }

        public CardForm[] newArray(int size) {
            return new CardForm[size];
        }
    };
}
