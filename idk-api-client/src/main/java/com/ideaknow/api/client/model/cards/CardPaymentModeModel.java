package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;

public class CardPaymentModeModel implements Parcelable {

    private String id;
    private AmountModel amount;

    public CardPaymentModeModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CardPaymentModeModel{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeParcelable(this.amount, 0);
    }

    private CardPaymentModeModel(Parcel in) {
        this.id = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CardPaymentModeModel> CREATOR = new Parcelable.Creator<CardPaymentModeModel>() {
        public CardPaymentModeModel createFromParcel(Parcel source) {
            return new CardPaymentModeModel(source);
        }

        public CardPaymentModeModel[] newArray(int size) {
            return new CardPaymentModeModel[size];
        }
    };
}
