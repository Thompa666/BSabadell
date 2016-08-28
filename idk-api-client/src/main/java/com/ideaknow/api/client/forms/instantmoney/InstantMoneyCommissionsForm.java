package com.ideaknow.api.client.forms.instantmoney;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;

public class InstantMoneyCommissionsForm implements Parcelable {

    private CardModel card;
    private AmountModel amount;

    public InstantMoneyCommissionsForm() {

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
        return "InstantMoneyCommissionsForm{" +
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

    private InstantMoneyCommissionsForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<InstantMoneyCommissionsForm> CREATOR = new Parcelable.Creator<InstantMoneyCommissionsForm>() {
        public InstantMoneyCommissionsForm createFromParcel(Parcel source) {
            return new InstantMoneyCommissionsForm(source);
        }

        public InstantMoneyCommissionsForm[] newArray(int size) {
            return new InstantMoneyCommissionsForm[size];
        }
    };
}
