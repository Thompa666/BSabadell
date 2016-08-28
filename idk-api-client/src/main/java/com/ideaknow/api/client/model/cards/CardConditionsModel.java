package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;

public class CardConditionsModel implements Parcelable {

    // Payment modes
    public static final String PAYMENT_MODE_TOTAL_AMOUNT = "01";
    public static final String PAYMENT_MODE_MAX_AMOUNT = "02";
    public static final String PAYMENT_MODE_PENDING_BALANCE = "03";

    private String contract;
    private AccountModel chargeAccount;
    private AmountModel creditLimit;
    private AmountModel authorizationLimit;
    private CardPaymentModeModel paymentMode;
    private String interestPercentage;
    private boolean canModify;

    public CardConditionsModel() {
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public AccountModel getChargeAccount() {
        return chargeAccount;
    }

    public void setChargeAccount(AccountModel chargeAccount) {
        this.chargeAccount = chargeAccount;
    }

    public AmountModel getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(AmountModel creditLimit) {
        this.creditLimit = creditLimit;
    }

    public AmountModel getAuthorizationLimit() {
        return authorizationLimit;
    }

    public void setAuthorizationLimit(AmountModel authorizationLimit) {
        this.authorizationLimit = authorizationLimit;
    }

    public CardPaymentModeModel getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(CardPaymentModeModel paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getInterestPercentage() {
        return interestPercentage;
    }

    public void setInterestPercentage(String interestPercentage) {
        this.interestPercentage = interestPercentage;
    }

    public boolean isCanModify() {
        return canModify;
    }

    public void setCanModify(boolean canModify) {
        this.canModify = canModify;
    }

    @Override
    public String toString() {
        return "CardConditionsModel{" +
                "contract='" + contract + '\'' +
                ", chargeAccount=" + chargeAccount +
                ", creditLimit=" + creditLimit +
                ", authorizationLimit=" + authorizationLimit +
                ", paymentMode=" + paymentMode +
                ", interestPercentage='" + interestPercentage + '\'' +
                ", canModify=" + canModify +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.contract);
        dest.writeParcelable(this.chargeAccount, 0);
        dest.writeParcelable(this.creditLimit, 0);
        dest.writeParcelable(this.authorizationLimit, 0);
        dest.writeParcelable(this.paymentMode, 0);
        dest.writeString(this.interestPercentage);
        dest.writeByte(canModify ? (byte) 1 : (byte) 0);
    }

    private CardConditionsModel(Parcel in) {
        this.contract = in.readString();
        this.chargeAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.creditLimit = in.readParcelable(AccountModel.class.getClassLoader());
        this.authorizationLimit = in.readParcelable(AccountModel.class.getClassLoader());
        this.paymentMode = in.readParcelable(CardPaymentModeModel.class.getClassLoader());
        this.interestPercentage = in.readString();
        this.canModify = in.readByte() != 0;
    }

    public static Creator<CardConditionsModel> CREATOR = new Creator<CardConditionsModel>() {
        public CardConditionsModel createFromParcel(Parcel source) {
            return new CardConditionsModel(source);
        }

        public CardConditionsModel[] newArray(int size) {
            return new CardConditionsModel[size];
        }
    };
}
