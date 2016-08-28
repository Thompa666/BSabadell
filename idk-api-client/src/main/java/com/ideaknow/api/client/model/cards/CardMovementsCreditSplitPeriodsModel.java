package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class CardMovementsCreditSplitPeriodsModel implements Parcelable {

    private PeriodModel[] periods;

    public CardMovementsCreditSplitPeriodsModel() {
    }

    public PeriodModel[] getPeriods() {
        return periods;
    }

    public void setPeriods(PeriodModel[] periods) {
        this.periods = periods;
    }

    @Override
    public String toString() {
        return "CardMovementsCreditSplitPeriodsModel{" +
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

    private CardMovementsCreditSplitPeriodsModel(Parcel in) {
        this.periods = (PeriodModel[]) in.readArray(PeriodModel[].class.getClassLoader());
    }

    public static final Parcelable.Creator<CardMovementsCreditSplitPeriodsModel> CREATOR =
            new Parcelable.Creator<CardMovementsCreditSplitPeriodsModel>() {
                public CardMovementsCreditSplitPeriodsModel createFromParcel(Parcel source) {
                    return new CardMovementsCreditSplitPeriodsModel(source);
                }

                public CardMovementsCreditSplitPeriodsModel[] newArray(int size) {
                    return new CardMovementsCreditSplitPeriodsModel[size];
                }
            };
}
