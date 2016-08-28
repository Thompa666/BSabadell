package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;

public class CardPrepaidReloadAmountsModel implements Parcelable {

    private AmountModel maxAvailableAmount;
    private AmountModel maxReloadAmount;

    public CardPrepaidReloadAmountsModel() {
    }

    public AmountModel getMaxAvailableAmount() {
        return maxAvailableAmount;
    }

    public void setMaxAvailableAmount(AmountModel maxAvailableAmount) {
        this.maxAvailableAmount = maxAvailableAmount;
    }

    public AmountModel getMaxReloadAmount() {
        return maxReloadAmount;
    }

    public void setMaxReloadAmount(AmountModel maxReloadAmount) {
        this.maxReloadAmount = maxReloadAmount;
    }

    @Override
    public String toString() {
        return "CardPrepaidReloadAmountsModel{" +
                "maxAvailableAmount=" + maxAvailableAmount +
                ", maxReloadAmount=" + maxReloadAmount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.maxAvailableAmount, 0);
        dest.writeParcelable(this.maxReloadAmount, 0);
    }

    private CardPrepaidReloadAmountsModel(Parcel in) {
        this.maxAvailableAmount = in.readParcelable(AmountModel.class.getClassLoader());
        this.maxReloadAmount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static Creator<CardPrepaidReloadAmountsModel> CREATOR = new Creator<CardPrepaidReloadAmountsModel>() {
        public CardPrepaidReloadAmountsModel createFromParcel(Parcel source) {
            return new CardPrepaidReloadAmountsModel(source);
        }

        public CardPrepaidReloadAmountsModel[] newArray(int size) {
            return new CardPrepaidReloadAmountsModel[size];
        }
    };
}
