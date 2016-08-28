package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.accounts.AccountPayerModel;

public class PeriodicalTransferModel implements Parcelable {

    private AccountModel account;
    private AccountPayerModel accountPayer;
    private AmountModel amount;
    private BeneficiaryModel beneficiary;
    private String endDate;
    private String periodicity;
    private String periodicityCode;
    private String startDate;
    private String purpose;
    private String repetitions;

    public PeriodicalTransferModel() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public AccountPayerModel getAccountPayer() {
        return accountPayer;
    }

    public void setAccountPayer(AccountPayerModel accountPayer) {
        this.accountPayer = accountPayer;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public BeneficiaryModel getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(BeneficiaryModel beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getPeriodicityCode() {
        return periodicityCode;
    }

    public void setPeriodicityCode(String periodicityCode) {
        this.periodicityCode = periodicityCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(String repetitions) {
        this.repetitions = repetitions;
    }

    @Override
    public String toString() {
        return "PeriodicalTransferModel{" +
                "account=" + account +
                ", accountPayer=" + accountPayer +
                ", amount=" + amount +
                ", beneficiary=" + beneficiary +
                ", endDate='" + endDate + '\'' +
                ", periodicity='" + periodicity + '\'' +
                ", periodicityCode='" + periodicityCode + '\'' +
                ", startDate='" + startDate + '\'' +
                ", purpose='" + purpose + '\'' +
                ", repetitions='" + repetitions + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.accountPayer, 0);
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.beneficiary, 0);
        dest.writeString(this.endDate);
        dest.writeString(this.periodicity);
        dest.writeString(this.periodicityCode);
        dest.writeString(this.startDate);
        dest.writeString(this.purpose);
        dest.writeString(this.repetitions);
    }

    private PeriodicalTransferModel(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.accountPayer = in.readParcelable(AccountPayerModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.beneficiary = in.readParcelable(BeneficiaryModel.class.getClassLoader());
        this.endDate = in.readString();
        this.periodicity = in.readString();
        this.periodicityCode = in.readString();
        this.startDate = in.readString();
        this.purpose = in.readString();
        this.repetitions = in.readString();
    }

    public static final Creator<PeriodicalTransferModel> CREATOR =
            new Creator<PeriodicalTransferModel>() {
                public PeriodicalTransferModel createFromParcel(Parcel source) {
                    return new PeriodicalTransferModel(source);
                }
        
                public PeriodicalTransferModel[] newArray(int size) {
                    return new PeriodicalTransferModel[size];
                }
    };
}
