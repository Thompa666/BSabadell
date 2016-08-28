package com.ideaknow.api.client.forms.instantmoney;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.CommissionModel;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.transfer.CommissionsModel;

import java.util.*;

public class InstantMoneyForm implements Parcelable {

    private CardModel card;
    private ArrayList<CommissionModel> commissions;
    private AmountModel amount;
    private String phoneNumber;
    private String purpose;
    private KeyModel key;

    public InstantMoneyForm() {
        amount = new AmountModel();
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public ArrayList<CommissionModel> getCommissions() {
        return commissions;
    }

    public void setCommissions(ArrayList<CommissionModel> commissions) {
        this.commissions = commissions;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "InstantMoneyForm{" +
                "card=" + card +
                ", commissions=" + commissions +
                ", amount=" + amount +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", purpose='" + purpose + '\'' +
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
        dest.writeList(this.commissions);
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.purpose);
        dest.writeParcelable(this.key, 0);
    }

    private InstantMoneyForm(Parcel in) {
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        if (this.commissions == null) {
            this.commissions = new ArrayList<CommissionModel>();
        }
        in.readList(this.commissions, CommissionsModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.phoneNumber = in.readString();
        this.purpose = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<InstantMoneyForm> CREATOR = new Creator<InstantMoneyForm>() {
        public InstantMoneyForm createFromParcel(Parcel source) {
            return new InstantMoneyForm(source);
        }

        public InstantMoneyForm[] newArray(int size) {
            return new InstantMoneyForm[size];
        }
    };
}
