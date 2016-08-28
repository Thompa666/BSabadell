package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;

public class CardPrepaidReloadCommissionsModel implements Parcelable {

    private AmountModel reloadCommission;
    private AmountModel balanceRecoveryCommission;

    public CardPrepaidReloadCommissionsModel() {
    }

    public AmountModel getReloadCommission() {
        return reloadCommission;
    }

    public void setReloadCommission(AmountModel reloadCommission) {
        this.reloadCommission = reloadCommission;
    }

    public AmountModel getBalanceRecoveryCommission() {
        return balanceRecoveryCommission;
    }

    public void setBalanceRecoveryCommission(AmountModel balanceRecoveryCommission) {
        this.balanceRecoveryCommission = balanceRecoveryCommission;
    }

    @Override
    public String toString() {
        return "CardPrepaidReloadCommissionsModel{" +
                "reloadCommission=" + reloadCommission +
                ", balanceRecoveryCommission=" + balanceRecoveryCommission +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.reloadCommission, 0);
        dest.writeParcelable(this.balanceRecoveryCommission, 0);
    }

    private CardPrepaidReloadCommissionsModel(Parcel in) {
        this.reloadCommission = in.readParcelable(AmountModel.class.getClassLoader());
        this.balanceRecoveryCommission = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static Creator<CardPrepaidReloadCommissionsModel> CREATOR = new Creator<CardPrepaidReloadCommissionsModel>() {
        public CardPrepaidReloadCommissionsModel createFromParcel(Parcel source) {
            return new CardPrepaidReloadCommissionsModel(source);
        }

        public CardPrepaidReloadCommissionsModel[] newArray(int size) {
            return new CardPrepaidReloadCommissionsModel[size];
        }
    };
}
