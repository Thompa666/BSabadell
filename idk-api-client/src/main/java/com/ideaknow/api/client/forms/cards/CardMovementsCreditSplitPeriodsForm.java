package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.cards.CardMovementModel;

public class CardMovementsCreditSplitPeriodsForm implements Parcelable {

    private CardModel card;
    private AccountModel account;
    private CardMovementModel cardMovement;
    private String contractNumber;

    public CardMovementsCreditSplitPeriodsForm() {
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

    public CardMovementModel getCardMovement() {
        return cardMovement;
    }

    public void setCardMovement(CardMovementModel cardMovement) {
        this.cardMovement = cardMovement;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return "CardMovementsCreditSplitPeriodsForm{" +
                "card=" + card +
                ", account=" + account +
                ", cardMovement=" + cardMovement +
                ", contractNumber='" + contractNumber + '\'' +
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
        dest.writeParcelable(this.cardMovement, 0);
        dest.writeString(this.contractNumber);
    }

    private CardMovementsCreditSplitPeriodsForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.cardMovement = in.readParcelable(CardMovementModel.class.getClassLoader());
        this.contractNumber = in.readString();
    }

    public static final Creator<CardMovementsCreditSplitPeriodsForm> CREATOR =
            new Creator<CardMovementsCreditSplitPeriodsForm>() {
                public CardMovementsCreditSplitPeriodsForm createFromParcel(Parcel source) {
                    return new CardMovementsCreditSplitPeriodsForm(source);
                }

                public CardMovementsCreditSplitPeriodsForm[] newArray(int size) {
                    return new CardMovementsCreditSplitPeriodsForm[size];
                }
            };
}
