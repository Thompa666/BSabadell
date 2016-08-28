package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.accounts.AccountMovementModel;
import com.ideaknow.api.client.model.cards.CardMovementModel;
import com.ideaknow.api.client.model.cards.PeriodModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardMovementsDebitSplitForm implements Parcelable {

    private CardModel creditCard;
    private CardModel debitCard;
    private PeriodModel period;
    private CardMovementModel cardMovement;
    private AccountMovementModel accountMovement;
    private String phoneNumber;
    private KeyModel secondKey;
    private String TAE;

    public CardMovementsDebitSplitForm() {
    }

    public CardModel getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CardModel creditCard) {
        this.creditCard = creditCard;
    }

    public CardModel getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(CardModel debitCard) {
        this.debitCard = debitCard;
    }

    public PeriodModel getPeriod() {
        return period;
    }

    public void setPeriod(PeriodModel period) {
        this.period = period;
    }

    public CardMovementModel getCardMovement() {
        return cardMovement;
    }

    public void setCardMovement(CardMovementModel cardMovement) {
        this.cardMovement = cardMovement;
    }

    public AccountMovementModel getAccountMovement() {
        return accountMovement;
    }

    public void setAccountMovement(AccountMovementModel accountMovement) {
        this.accountMovement = accountMovement;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public KeyModel getSecondKey() {
        return secondKey;
    }

    public void setSecondKey(KeyModel secondKey) {
        this.secondKey = secondKey;
    }

    public String getTAE() {
        return TAE;
    }

    public void setTAE(String TAE) {
        this.TAE = TAE;
    }

    @Override
    public String toString() {
        return "CardMovementsDebitSplitForm{" +
                "creditCard=" + creditCard +
                ", debitCard=" + debitCard +
                ", period=" + period +
                ", cardMovement=" + cardMovement +
                ", accountMovement=" + accountMovement +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", secondKey=" + secondKey +
                ", TAE='" + TAE + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.creditCard, 0);
        dest.writeParcelable(this.debitCard, 0);
        dest.writeParcelable(this.period, 0);
        dest.writeParcelable(this.cardMovement, 0);
        dest.writeParcelable(this.accountMovement, 0);
        dest.writeString(this.phoneNumber);
        dest.writeParcelable(this.secondKey, 0);
        dest.writeString(this.TAE);
    }

    private CardMovementsDebitSplitForm(Parcel in) {
        this.creditCard = in.readParcelable(CardModel.class.getClassLoader());
        this.debitCard = in.readParcelable(CardModel.class.getClassLoader());
        this.period = in.readParcelable(PeriodModel.class.getClassLoader());
        this.cardMovement = in.readParcelable(CardMovementModel.class.getClassLoader());
        this.accountMovement = in.readParcelable(AccountMovementModel.class.getClassLoader());
        this.phoneNumber = in.readString();
        this.secondKey = in.readParcelable(KeyModel.class.getClassLoader());
        this.TAE = in.readString();
    }

    public static Creator<CardMovementsDebitSplitForm> CREATOR = new Creator<CardMovementsDebitSplitForm>() {
        public CardMovementsDebitSplitForm createFromParcel(Parcel source) {
            return new CardMovementsDebitSplitForm(source);
        }

        public CardMovementsDebitSplitForm[] newArray(int size) {
            return new CardMovementsDebitSplitForm[size];
        }
    };
}
