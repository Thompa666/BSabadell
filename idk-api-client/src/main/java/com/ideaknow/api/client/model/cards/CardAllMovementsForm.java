package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.PaginatorModel;

public class CardAllMovementsForm implements Parcelable {

    private CardModel card;
    private String movementType;
    private PaginatorModel paginator;

    public CardAllMovementsForm() {
    }

    public CardAllMovementsForm(CardModel card) {
        this.card = card;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "CardAllMovementsForm{" +
                "card=" + card +
                ", movementType='" + movementType + '\'' +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeString(this.movementType);
        dest.writeParcelable(this.paginator, 0);
    }

    private CardAllMovementsForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.movementType = in.readString();
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Creator<CardAllMovementsForm> CREATOR =
            new Creator<CardAllMovementsForm>() {
                public CardAllMovementsForm createFromParcel(Parcel source) {
                    return new CardAllMovementsForm(source);
                }

                public CardAllMovementsForm[] newArray(int size) {
                    return new CardAllMovementsForm[size];
                }
            };
}
