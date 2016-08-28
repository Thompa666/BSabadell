package com.ideaknow.api.client.forms.accounts.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class TransferToCardForm implements Parcelable {

    public CardModel card;
    public AccountModel account;
    public AmountModel amount;
    public KeyModel key;

    public TransferToCardForm() {
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

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "TransferToCardForm{" +
                "card=" + card +
                ", account=" + account +
                ", amount=" + amount +
                ", key=" + key +
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
        dest.writeParcelable(this.key, 0);
    }

    private TransferToCardForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<TransferToCardForm> CREATOR = new Parcelable.Creator<TransferToCardForm>() {
        public TransferToCardForm createFromParcel(Parcel source) {
            return new TransferToCardForm(source);
        }

        public TransferToCardForm[] newArray(int size) {
            return new TransferToCardForm[size];
        }
    };
}
