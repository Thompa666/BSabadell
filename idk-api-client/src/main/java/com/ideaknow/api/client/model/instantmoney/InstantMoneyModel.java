package com.ideaknow.api.client.model.instantmoney;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.CommissionModel;

import java.util.*;

public class InstantMoneyModel implements Parcelable {

    private AmountModel amount;
    private CardModel card;
    private ArrayList<CommissionModel> commissions;
    private String code;
    private String phoneNumber;
    private String purpose;
    private String date;
    private String time;

    public InstantMoneyModel() {
        amount = new AmountModel();
        card = new CardModel();
        commissions = new ArrayList<CommissionModel>();
        code = "";
        phoneNumber = "";
        purpose = "";
        date = "";
        time = "";
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "InstantMoneyModel{" +
                "amount=" + amount +
                ", card=" + card +
                ", commissions=" + commissions +
                ", code='" + code + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", purpose='" + purpose + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.card, 0);
        dest.writeList(this.commissions);
        dest.writeString(this.code);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.purpose);
        dest.writeString(this.date);
        dest.writeString(this.time);
    }

    private InstantMoneyModel(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        if (this.commissions == null) {
            this.commissions = new ArrayList<CommissionModel>();
        }
        in.readList(this.commissions, CommissionModel.class.getClassLoader());
        this.code = in.readString();
        this.phoneNumber = in.readString();
        this.purpose = in.readString();
        this.date = in.readString();
        this.time = in.readString();
    }

    public static final Creator<InstantMoneyModel> CREATOR = new Creator<InstantMoneyModel>() {
        public InstantMoneyModel createFromParcel(Parcel source) {
            return new InstantMoneyModel(source);
        }

        public InstantMoneyModel[] newArray(int size) {
            return new InstantMoneyModel[size];
        }
    };
}
