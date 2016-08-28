package com.ideaknow.api.client.model.cards;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

import java.util.*;

public class CardSettlementsModel implements Parcelable {

    private AccountModel account;
    private String contractNumber;
    private ArrayList<CardSettlementModel> cardSettlements;

    public CardSettlementsModel() {
        super();
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ArrayList<CardSettlementModel> getCardSettlements() {
        return cardSettlements;
    }

    public void setCardSettlements(ArrayList<CardSettlementModel> cardSettlements) {
        this.cardSettlements = cardSettlements;
    }

    @Override
    public String toString() {
        return "CardSettlementsModel{" +
                "account=" + account +
                ", contractNumber='" + contractNumber + '\'' +
                ", cardSettlements=" + cardSettlements +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeString(this.contractNumber);
        dest.writeList(this.cardSettlements);
    }

    private CardSettlementsModel(Parcel in) {
        this.account = in.readParcelable(Account.class.getClassLoader());
        this.contractNumber = in.readString();
        in.readList(cardSettlements, CardSettlementModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CardSettlementsModel> CREATOR = new Parcelable.Creator<CardSettlementsModel>() {
        public CardSettlementsModel createFromParcel(Parcel source) {
            return new CardSettlementsModel(source);
        }

        public CardSettlementsModel[] newArray(int size) {
            return new CardSettlementsModel[size];
        }
    };
}
