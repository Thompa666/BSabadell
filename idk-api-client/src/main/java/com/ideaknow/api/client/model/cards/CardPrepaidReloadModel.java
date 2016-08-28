package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;

public class CardPrepaidReloadModel implements Parcelable {

    private AmountModel amount;
    private CardModel prepaidCard;
    private String contractCCC;

    public CardPrepaidReloadModel() {
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public CardModel getPrepaidCard() {
        return prepaidCard;
    }

    public void setPrepaidCard(CardModel prepaidCard) {
        this.prepaidCard = prepaidCard;
    }

    public String getContractCCC() {
        return contractCCC;
    }

    public void setContractCCC(String contractCCC) {
        this.contractCCC = contractCCC;
    }

    @Override
    public String toString() {
        return "CardPrepaidReloadModel{" +
                "amount=" + amount +
                ", prepaidCard=" + prepaidCard +
                ", contractCCC='" + contractCCC + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.prepaidCard, 0);
        dest.writeString(this.contractCCC);
    }

    private CardPrepaidReloadModel(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.prepaidCard = in.readParcelable(CardModel.class.getClassLoader());
        this.contractCCC = in.readString();
    }

    public static Creator<CardPrepaidReloadModel> CREATOR = new Creator<CardPrepaidReloadModel>() {
        public CardPrepaidReloadModel createFromParcel(Parcel source) {
            return new CardPrepaidReloadModel(source);
        }

        public CardPrepaidReloadModel[] newArray(int size) {
            return new CardPrepaidReloadModel[size];
        }
    };
}
