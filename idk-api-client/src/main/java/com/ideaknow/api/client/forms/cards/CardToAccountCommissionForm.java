package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;

public class CardToAccountCommissionForm implements Parcelable {

    private AmountModel amount;
    private CardModel card;

    public CardToAccountCommissionForm() {
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "InstantCashCommissionForm{" +
                "amount=" + amount +
                ", card=" + card +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.card, 0);
    }

    private CardToAccountCommissionForm(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.card = in.readParcelable(CardModel.class.getClassLoader());
    }

    public static Creator<CardToAccountCommissionForm> CREATOR = new Creator<CardToAccountCommissionForm>() {
        public CardToAccountCommissionForm createFromParcel(Parcel source) {
            return new CardToAccountCommissionForm(source);
        }

        public CardToAccountCommissionForm[] newArray(int size) {
            return new CardToAccountCommissionForm[size];
        }
    };
}
