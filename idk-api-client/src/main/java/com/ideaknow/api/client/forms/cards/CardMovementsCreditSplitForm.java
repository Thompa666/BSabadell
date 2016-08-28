package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.cards.CardMovementModel;
import com.ideaknow.api.client.model.cards.PeriodModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardMovementsCreditSplitForm implements Parcelable {

    private AccountModel account;
    private CardModel card;
    private CardMovementModel cardMovement;
    private PeriodModel period;
    private String ptorete;
    private String contractNumber;
    private String paymentType;
    private KeyModel secondKey;

    public CardMovementsCreditSplitForm() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public CardMovementModel getCardMovement() {
        return cardMovement;
    }

    public void setCardMovement(CardMovementModel cardMovement) {
        this.cardMovement = cardMovement;
    }

    public PeriodModel getPeriod() {
        return period;
    }

    public void setPeriod(PeriodModel period) {
        this.period = period;
    }

    public String getPtorete() {
        return ptorete;
    }

    public void setPtorete(String ptorete) {
        this.ptorete = ptorete;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public KeyModel getSecondKey() {
        return secondKey;
    }

    public void setSecondKey(KeyModel secondKey) {
        this.secondKey = secondKey;
    }

    @Override
    public String toString() {
        return "CardMovementsCreditSplitForm{" +
                "account=" + account +
                ", card=" + card +
                ", cardMovement=" + cardMovement +
                ", period=" + period +
                ", ptorete='" + ptorete + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", secondKey=" + secondKey +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.cardMovement, 0);
        dest.writeParcelable(this.period, 0);
        dest.writeString(this.ptorete);
        dest.writeString(this.contractNumber);
        dest.writeString(this.paymentType);
        dest.writeParcelable(this.secondKey, 0);
    }

    private CardMovementsCreditSplitForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.cardMovement = in.readParcelable(CardMovementModel.class.getClassLoader());
        this.period = in.readParcelable(PeriodModel.class.getClassLoader());
        this.ptorete = in.readString();
        this.contractNumber = in.readString();
        this.paymentType = in.readString();
        this.secondKey = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<CardMovementsCreditSplitForm> CREATOR = new Parcelable.Creator<CardMovementsCreditSplitForm>() {
        public CardMovementsCreditSplitForm createFromParcel(Parcel source) {
            return new CardMovementsCreditSplitForm(source);
        }

        public CardMovementsCreditSplitForm[] newArray(int size) {
            return new CardMovementsCreditSplitForm[size];
        }
    };
}
