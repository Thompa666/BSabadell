package com.ideaknow.api.client.forms.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;

public class ProductsCardsForm implements Parcelable {

    private CardModel card;
    private boolean isNfc;
    private boolean isSticker;

    public ProductsCardsForm() {

    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public boolean isNfc() {
        return isNfc;
    }

    public void setNfc(boolean isNfc) {
        this.isNfc = isNfc;
    }

    public boolean isSticker() {
        return isSticker;
    }

    public void setSticker(boolean isSticker) {
        this.isSticker = isSticker;
    }

    @Override
    public String toString() {
        return "ProductsCardsForm{" +
                "card=" + card +
                ", isNfc=" + isNfc +
                ", isSticker=" + isSticker +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, 0);
        dest.writeByte(isNfc ? (byte) 1 : (byte) 0);
        dest.writeByte(isSticker ? (byte) 1 : (byte) 0);
    }

    private ProductsCardsForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.isNfc = in.readByte() != 0;
        this.isSticker = in.readByte() != 0;
    }

    public static final Creator<ProductsCardsForm> CREATOR = new Creator<ProductsCardsForm>() {
        public ProductsCardsForm createFromParcel(Parcel source) {
            return new ProductsCardsForm(source);
        }

        public ProductsCardsForm[] newArray(int size) {
            return new ProductsCardsForm[size];
        }
    };
}
