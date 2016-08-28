package com.ideaknow.api.client.forms.atmmobile;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class OtpGenerationForm implements Parcelable {

    public static final String DRAW_TYPE_DEBIT = "D";
    public static final String DRAW_TYPE_CREDIT = "C";

    private CardModel card;
    private AmountModel amount;
    private String withdrawType;
    private KeyModel key;

    public OtpGenerationForm() {
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "OtpGenerationForm{" +
                "card=" + card +
                ", amount=" + amount +
                ", withdrawType='" + withdrawType + '\'' +
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
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.withdrawType);
        dest.writeParcelable(this.key, 0);
    }

    private OtpGenerationForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.withdrawType = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<OtpGenerationForm> CREATOR = new Creator<OtpGenerationForm>() {
        public OtpGenerationForm createFromParcel(Parcel source) {
            return new OtpGenerationForm(source);
        }

        public OtpGenerationForm[] newArray(int size) {
            return new OtpGenerationForm[size];
        }
    };
}
