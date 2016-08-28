package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.CommissionModel;

public class CardToAccountTransferModel implements Parcelable {

    private CardModel card;
    private AccountModel  account;
    private AmountModel amount;
    private CommissionModel commission;

    public CardToAccountTransferModel() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public CommissionModel getCommission() {
        return commission;
    }

    public void setCommission(CommissionModel commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "CardToAccountTransferModel{" +
                "card=" + card +
                ", account=" + account +
                ", amount=" + amount +
                ", commission=" + commission +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.commission, 0);
    }

    private CardToAccountTransferModel(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.commission = in.readParcelable(CommissionModel.class.getClassLoader());
    }

    public static Creator<CardToAccountTransferModel> CREATOR = new Creator<CardToAccountTransferModel>() {
        public CardToAccountTransferModel createFromParcel(Parcel source) {
            return new CardToAccountTransferModel(source);
        }

        public CardToAccountTransferModel[] newArray(int size) {
            return new CardToAccountTransferModel[size];
        }
    };
}
