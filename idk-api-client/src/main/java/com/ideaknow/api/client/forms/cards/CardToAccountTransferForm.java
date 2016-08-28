package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.CommissionModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardToAccountTransferForm implements Parcelable {

    private AmountModel amount;
    private CardModel card;
    private AccountModel account;
    private CommissionModel commission;
    private KeyModel key;

    public CardToAccountTransferForm() {
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

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public CommissionModel getCommission() {
        return commission;
    }

    public void setCommission(CommissionModel commission) {
        this.commission = commission;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "CardToAccountTransferForm{" +
                "amount=" + amount +
                ", card=" + card +
                ", account=" + account +
                ", commission=" + commission +
                ", key=" + key +
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
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.commission, 0);
        dest.writeParcelable(this.key, 0);
    }

    private CardToAccountTransferForm(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.commission = in.readParcelable(CommissionModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static Creator<CardToAccountTransferForm> CREATOR = new Creator<CardToAccountTransferForm>() {
        public CardToAccountTransferForm createFromParcel(Parcel source) {
            return new CardToAccountTransferForm(source);
        }

        public CardToAccountTransferForm[] newArray(int size) {
            return new CardToAccountTransferForm[size];
        }
    };
}
