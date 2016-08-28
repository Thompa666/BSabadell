package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;

public class CardMovementsDebitSplitPeriodsForm implements Parcelable {

    private CardModel card;
    private AmountModel amount;

    public CardMovementsDebitSplitPeriodsForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CardMovementsDebitSplitPeriodsForm{" +
                "card=" + card +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.amount, 0);
    }

    private CardMovementsDebitSplitPeriodsForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static Creator<CardMovementsDebitSplitPeriodsForm> CREATOR = new Creator<CardMovementsDebitSplitPeriodsForm>() {
        public CardMovementsDebitSplitPeriodsForm createFromParcel(Parcel source) {
            return new CardMovementsDebitSplitPeriodsForm(source);
        }

        public CardMovementsDebitSplitPeriodsForm[] newArray(int size) {
            return new CardMovementsDebitSplitPeriodsForm[size];
        }
    };
}
