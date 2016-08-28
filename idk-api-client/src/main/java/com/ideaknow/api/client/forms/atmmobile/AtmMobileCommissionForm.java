package com.ideaknow.api.client.forms.atmmobile;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;

public class AtmMobileCommissionForm implements Parcelable {

    private CardModel card;
    private AmountModel amount;

    public AtmMobileCommissionForm() {
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
        return "AtmMobileCommissionForm{" +
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

    private AtmMobileCommissionForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<AtmMobileCommissionForm> CREATOR = new
            Creator<AtmMobileCommissionForm>() {
                public AtmMobileCommissionForm createFromParcel(Parcel source) {
                    return new AtmMobileCommissionForm(source);
                }

                public AtmMobileCommissionForm[] newArray(int size) {
                    return new AtmMobileCommissionForm[size];
                }
            };
}
