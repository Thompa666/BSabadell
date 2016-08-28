package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;

public class AccountTransferToCardModel implements Parcelable {

    private CardModel card;
    private AccountModel account;
    private AmountModel amount;

    public AccountTransferToCardModel() {

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

    @Override
    public String toString() {
        return "AccountTransferToCardModel{" +
                "card=" + card +
                ", account=" + account +
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
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.amount, 0);
    }

    private AccountTransferToCardModel(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<AccountTransferToCardModel> CREATOR = new Parcelable.Creator<AccountTransferToCardModel>() {
        public AccountTransferToCardModel createFromParcel(Parcel source) {
            return new AccountTransferToCardModel(source);
        }

        public AccountTransferToCardModel[] newArray(int size) {
            return new AccountTransferToCardModel[size];
        }
    };
}
