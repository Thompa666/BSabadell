package com.ideaknow.api.client.model.expansionlines;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;

import java.util.*;

public class ExpansionLineModel implements Parcelable {

    private AmountModel availableBalance;
    private AmountModel claimFee;
    private String contractCCC;
    private ArrayList<String> disposeTerms;
    private String description;
    private AccountModel expansionAccount;
    private String interest;
    private AmountModel minDisposeAmount;
    private String numCard;
    private String number;
    private AmountModel openingFee;
    private String owner;
    private String reference;
    private AmountModel creditLimit;
    private AmountModel studyFee;
    private String tae;
    private boolean active;

    public ExpansionLineModel() {
    }

    public AmountModel getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(AmountModel availableBalance) {
        this.availableBalance = availableBalance;
    }

    public AmountModel getClaimFee() {
        return claimFee;
    }

    public void setClaimFee(AmountModel claimFee) {
        this.claimFee = claimFee;
    }

    public String getContractCCC() {
        return contractCCC;
    }

    public void setContractCCC(String contractCCC) {
        this.contractCCC = contractCCC;
    }

    public ArrayList<String> getDisposeTerms() {
        return disposeTerms;
    }

    public void setDisposeTerms(ArrayList<String> disposeTerms) {
        this.disposeTerms = disposeTerms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccountModel getExpansionAccount() {
        return expansionAccount;
    }

    public void setExpansionAccount(AccountModel expansionAccount) {
        this.expansionAccount = expansionAccount;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public AmountModel getMinDisposeAmount() {
        return minDisposeAmount;
    }

    public void setMinDisposeAmount(AmountModel minDisposeAmount) {
        this.minDisposeAmount = minDisposeAmount;
    }

    public String getNumCard() {
        return numCard;
    }

    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AmountModel getOpeningFee() {
        return openingFee;
    }

    public void setOpeningFee(AmountModel openingFee) {
        this.openingFee = openingFee;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public AmountModel getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(AmountModel creditLimit) {
        this.creditLimit = creditLimit;
    }

    public AmountModel getStudyFee() {
        return studyFee;
    }

    public void setStudyFee(AmountModel studyFee) {
        this.studyFee = studyFee;
    }

    public String getTae() {
        return tae;
    }

    public void setTae(String tae) {
        this.tae = tae;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "ExpansionLineModel{" +
                "availableBalance=" + availableBalance +
                ", claimFee=" + claimFee +
                ", contractCCC='" + contractCCC + '\'' +
                ", disposeTerms=" + disposeTerms +
                ", description='" + description + '\'' +
                ", expansionAccount=" + expansionAccount +
                ", interest='" + interest + '\'' +
                ", minDisposeAmount=" + minDisposeAmount +
                ", numCard='" + numCard + '\'' +
                ", number='" + number + '\'' +
                ", openingFee=" + openingFee +
                ", owner='" + owner + '\'' +
                ", reference='" + reference + '\'' +
                ", creditLimit=" + creditLimit +
                ", studyFee=" + studyFee +
                ", tae='" + tae + '\'' +
                ", active=" + active +
                '}' + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.availableBalance, 0);
        dest.writeParcelable(this.claimFee, 0);
        dest.writeString(this.contractCCC);
        dest.writeList(this.disposeTerms);
        dest.writeString(this.description);
        dest.writeParcelable(this.expansionAccount, 0);
        dest.writeString(this.interest);
        dest.writeParcelable(this.minDisposeAmount, 0);
        dest.writeString(this.numCard);
        dest.writeString(this.number);
        dest.writeParcelable(this.openingFee, 0);
        dest.writeString(this.owner);
        dest.writeString(this.reference);
        dest.writeParcelable(this.creditLimit, 0);
        dest.writeParcelable(this.studyFee, 0);
        dest.writeString(this.tae);
        dest.writeByte(active ? (byte) 1 : (byte) 0);
    }

    private ExpansionLineModel(Parcel in) {
        this.availableBalance = in.readParcelable(AmountModel.class.getClassLoader());
        this.claimFee = in.readParcelable(AmountModel.class.getClassLoader());
        this.contractCCC = in.readString();
        if (this.disposeTerms == null) {
            this.disposeTerms = new ArrayList<String>();
        }
        in.readList(this.disposeTerms, String.class.getClassLoader());
        this.description = in.readString();
        this.expansionAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.interest = in.readString();
        this.minDisposeAmount = in.readParcelable(AmountModel.class.getClassLoader());
        this.numCard = in.readString();
        this.number = in.readString();
        this.openingFee = in.readParcelable(AmountModel.class.getClassLoader());
        this.owner = in.readString();
        this.reference = in.readString();
        this.creditLimit = in.readParcelable(AmountModel.class.getClassLoader());
        this.studyFee = in.readParcelable(AmountModel.class.getClassLoader());
        this.tae = in.readString();
        this.active = in.readByte() != 0;
    }

    public static final Creator<ExpansionLineModel> CREATOR = new Creator<ExpansionLineModel>() {
        public ExpansionLineModel createFromParcel(Parcel source) {
            return new ExpansionLineModel(source);
        }

        public ExpansionLineModel[] newArray(int size) {
            return new ExpansionLineModel[size];
        }
    };
}
