package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class CardMovementsListModel implements Parcelable {

    private String contractNumber;
    private String contractOwner;
    private String paymentType;
    private String ptorete;
    private AmountModel previousBalance;
    private AmountModel currentMonthBalance;
    private AmountModel totalAmount;
    private AmountModel pendingLiquidationBalance;
    private AmountModel availableBalance;
    private AmountModel willingBalance;
    private AccountModel chargeAccount;
    private CardModel card;
    private ArrayList<CardMovementModel> cardConfirmedMovements;
    private ArrayList<CardMovementModel> cardUnconfirmedMovements;
    private PaginatorModel paginator;

    public CardMovementsListModel() {
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractOwner() {
        return contractOwner;
    }

    public void setContractOwner(String contractOwner) {
        this.contractOwner = contractOwner;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPtorete() {
        return ptorete;
    }

    public void setPtorete(String ptorete) {
        this.ptorete = ptorete;
    }

    public AmountModel getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(AmountModel previousBalance) {
        this.previousBalance = previousBalance;
    }

    public AmountModel getCurrentMonthBalance() {
        return currentMonthBalance;
    }

    public void setCurrentMonthBalance(AmountModel currentMonthBalance) {
        this.currentMonthBalance = currentMonthBalance;
    }

    public AmountModel getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(AmountModel totalAmount) {
        this.totalAmount = totalAmount;
    }

    public AmountModel getPendingLiquidationBalance() {
        return pendingLiquidationBalance;
    }

    public void setPendingLiquidationBalance(AmountModel pendingLiquidationBalance) {
        this.pendingLiquidationBalance = pendingLiquidationBalance;
    }

    public AmountModel getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(AmountModel availableBalance) {
        this.availableBalance = availableBalance;
    }

    public AmountModel getWillingBalance() {
        return willingBalance;
    }

    public void setWillingBalance(AmountModel willingBalance) {
        this.willingBalance = willingBalance;
    }

    public AccountModel getChargeAccount() {
        return chargeAccount;
    }

    public void setChargeAccount(AccountModel chargeAccount) {
        this.chargeAccount = chargeAccount;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public ArrayList<CardMovementModel> getCardConfirmedMovements() {
        return cardConfirmedMovements;
    }

    public void setCardConfirmedMovements(ArrayList<CardMovementModel> cardConfirmedMovements) {
        this.cardConfirmedMovements = cardConfirmedMovements;
    }

    public ArrayList<CardMovementModel> getCardUnconfirmedMovements() {
        return cardUnconfirmedMovements;
    }

    public void setCardUnconfirmedMovements(ArrayList<CardMovementModel> cardUnconfirmedMovements) {
        this.cardUnconfirmedMovements = cardUnconfirmedMovements;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "CardMovementsListModel{" +
                "contractNumber='" + contractNumber + '\'' +
                ", contractOwner='" + contractOwner + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", ptorete='" + ptorete + '\'' +
                ", previousBalance=" + previousBalance +
                ", currentMonthBalance=" + currentMonthBalance +
                ", totalAmount=" + totalAmount +
                ", pendingLiquidationBalance=" + pendingLiquidationBalance +
                ", availableBalance=" + availableBalance +
                ", willingBalance=" + willingBalance +
                ", chargeAccount=" + chargeAccount +
                ", card=" + card +
                ", cardConfirmedMovements=" + cardConfirmedMovements +
                ", cardUnconfirmedMovements=" + cardUnconfirmedMovements +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.contractNumber);
        dest.writeString(this.contractOwner);
        dest.writeString(this.paymentType);
        dest.writeString(this.ptorete);
        dest.writeParcelable(this.previousBalance, 0);
        dest.writeParcelable(this.currentMonthBalance, 0);
        dest.writeParcelable(this.totalAmount, 0);
        dest.writeParcelable(this.pendingLiquidationBalance, 0);
        dest.writeParcelable(this.availableBalance, 0);
        dest.writeParcelable(this.willingBalance, 0);
        dest.writeParcelable(this.chargeAccount, 0);
        dest.writeParcelable(this.card, 0);
        dest.writeList(this.cardConfirmedMovements);
        dest.writeList(this.cardUnconfirmedMovements);
        dest.writeParcelable(this.paginator, 0);
    }

    private CardMovementsListModel(Parcel in) {
        this.contractNumber = in.readString();
        this.contractOwner = in.readString();
        this.paymentType = in.readString();
        this.ptorete = in.readString();
        this.previousBalance = in.readParcelable(AmountModel.class.getClassLoader());
        this.currentMonthBalance = in.readParcelable(AmountModel.class.getClassLoader());
        this.totalAmount = in.readParcelable(AmountModel.class.getClassLoader());
        this.pendingLiquidationBalance = in.readParcelable(AmountModel.class.getClassLoader());
        this.availableBalance = in.readParcelable(AmountModel.class.getClassLoader());
        this.willingBalance = in.readParcelable(AmountModel.class.getClassLoader());
        this.chargeAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.card = in.readParcelable(CardModel.class.getClassLoader());

        if (cardConfirmedMovements == null) {
            cardConfirmedMovements = new ArrayList<CardMovementModel>();
        }
        in.readList(cardConfirmedMovements, CardMovementModel.class.getClassLoader());

        if (cardUnconfirmedMovements == null) {
            cardUnconfirmedMovements = new ArrayList<CardMovementModel>();
        }
        in.readList(cardUnconfirmedMovements, CardMovementModel.class.getClassLoader());

        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Creator<CardMovementsListModel> CREATOR = new Creator<CardMovementsListModel>() {
        public CardMovementsListModel createFromParcel(Parcel source) {
            return new CardMovementsListModel(source);
        }

        public CardMovementsListModel[] newArray(int size) {
            return new CardMovementsListModel[size];
        }
    };
}
