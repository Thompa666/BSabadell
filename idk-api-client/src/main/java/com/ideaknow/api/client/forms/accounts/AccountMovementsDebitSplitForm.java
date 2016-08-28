package com.ideaknow.api.client.forms.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.accounts.AccountMovementModel;
import com.ideaknow.api.client.model.cards.PeriodModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class AccountMovementsDebitSplitForm implements Parcelable {

    private CardModel creditCard;
    private PeriodModel period;
    private AccountMovementModel accountMovement;
    private String phoneNumber;
    private KeyModel secondKey;

    public AccountMovementsDebitSplitForm() {
    }

    public CardModel getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CardModel creditCard) {
        this.creditCard = creditCard;
    }

    public PeriodModel getPeriod() {
        return period;
    }

    public void setPeriod(PeriodModel period) {
        this.period = period;
    }

    public AccountMovementModel getAccountMovement() {
        return accountMovement;
    }

    public void setAccountMovement(AccountMovementModel accountMovement) {
        this.accountMovement = accountMovement;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public KeyModel getSecondKey() {
        return secondKey;
    }

    public void setSecondKey(KeyModel secondKey) {
        this.secondKey = secondKey;
    }

    @Override
    public String toString() {
        return "AccountMovementsDebitSplitForm{" +
                "creditCard=" + creditCard +
                ", period=" + period +
                ", accountMovement=" + accountMovement +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", secondKey=" + secondKey +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.creditCard, 0);
        dest.writeParcelable(this.period, 0);
        dest.writeParcelable(this.accountMovement, 0);
        dest.writeString(this.phoneNumber);
        dest.writeParcelable(this.secondKey, 0);
    }

    private AccountMovementsDebitSplitForm(Parcel in) {
        this.creditCard = in.readParcelable(CardModel.class.getClassLoader());
        this.period = in.readParcelable(PeriodModel.class.getClassLoader());
        this.accountMovement = in.readParcelable(AccountMovementModel.class.getClassLoader());
        this.phoneNumber = in.readString();
        this.secondKey = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<AccountMovementsDebitSplitForm> CREATOR =
            new Creator<AccountMovementsDebitSplitForm>() {
                public AccountMovementsDebitSplitForm createFromParcel(Parcel source) {
                    return new AccountMovementsDebitSplitForm(source);
                }

                public AccountMovementsDebitSplitForm[] newArray(int size) {
                    return new AccountMovementsDebitSplitForm[size];
                }
            };
}
