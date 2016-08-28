package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class CardPrepaidReloadForm implements Parcelable {

    private CardPrepaidReloadModel cardPrepaidReload;
    private KeyModel key;
    private String contractNumber;

    public CardPrepaidReloadForm() {
    }

    public CardPrepaidReloadModel getCardPrepaidReload() {
        return cardPrepaidReload;
    }

    public void setCardPrepaidReload(CardPrepaidReloadModel cardPrepaidReload) {
        this.cardPrepaidReload = cardPrepaidReload;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return "CardPrepaidReloadForm{" +
                "cardPrepaidReload=" + cardPrepaidReload +
                ", key=" + key +
                ", contractNumber='" + contractNumber + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.cardPrepaidReload, 0);
        dest.writeParcelable(this.key, 0);
        dest.writeString(this.contractNumber);
    }

    private CardPrepaidReloadForm(Parcel in) {
        this.cardPrepaidReload = in.readParcelable(CardPrepaidReloadModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
        this.contractNumber = in.readString();
    }

    public static final Creator<CardPrepaidReloadForm> CREATOR =
            new Creator<CardPrepaidReloadForm>() {
                public CardPrepaidReloadForm createFromParcel(Parcel source) {
                    return new CardPrepaidReloadForm(source);
                }

                public CardPrepaidReloadForm[] newArray(int size) {
                    return new CardPrepaidReloadForm[size];
                }
            };
}
