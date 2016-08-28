package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class CardMovementsDebitSplitPeriodsModel implements Parcelable {

    private PeriodModel[] periods;

    public CardMovementsDebitSplitPeriodsModel() {
    }

    public PeriodModel[] getPeriods() {
        return periods;
    }

    public void setPeriods(PeriodModel[] periods) {
        this.periods = periods;
    }

    @Override
    public String toString() {
        return "CardMovementsDebitSplitPeriodsModel{" +
                "periods=" + Arrays.toString(periods) +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelableArray(this.periods, flags);
    }

    private CardMovementsDebitSplitPeriodsModel(Parcel in) {
        this.periods = (PeriodModel[]) in.readArray(PeriodModel[].class.getClassLoader());
    }

    public static Creator<CardMovementsDebitSplitPeriodsModel> CREATOR = new Creator<CardMovementsDebitSplitPeriodsModel>() {
        public CardMovementsDebitSplitPeriodsModel createFromParcel(Parcel source) {
            return new CardMovementsDebitSplitPeriodsModel(source);
        }

        public CardMovementsDebitSplitPeriodsModel[] newArray(int size) {
            return new CardMovementsDebitSplitPeriodsModel[size];
        }
    };
}
