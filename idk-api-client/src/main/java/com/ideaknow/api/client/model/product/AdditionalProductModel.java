package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.IDKDisplayData;

import java.util.*;


/**
 * Clase para modelar los productos adicionales que pueden aparecer en la posición global.
 * Mantiene el modelo de productos financieros: AccountLoan, AccountCredit, ExpansionLineGP, FundingBoundaries
 */
public class AdditionalProductModel extends BaseProductModel implements Parcelable {

    private AccountLoanModel loan;
    private AccountCreditModel credit;
    private ExpansionLineGPModel expansionLineGP;
    private FundingBoundariesModel fundingBoundaries;
    private ArrayList<UnknownModel> unknowns;

    public AdditionalProductModel() {
        super();
        loan = new AccountLoanModel();
        credit = new AccountCreditModel();
        expansionLineGP = new ExpansionLineGPModel();
        fundingBoundaries = new FundingBoundariesModel();
        unknowns = new ArrayList<UnknownModel>();
    }

    public AccountLoanModel getLoan() {
        return loan;
    }

    public void setLoan(AccountLoanModel loan) {
        this.loan = loan;
    }

    public AccountCreditModel getCredit() {
        return credit;
    }

    public void setCredit(AccountCreditModel credit) {
        this.credit = credit;
    }

    public ExpansionLineGPModel getExpansionLineGP() {
        return expansionLineGP;
    }

    public void setExpansionLineGP(ExpansionLineGPModel expansionLineGP) {
        this.expansionLineGP = expansionLineGP;
    }

    public FundingBoundariesModel getFundingBoundaries() {
        return fundingBoundaries;
    }

    public void setFundingBoundaries(FundingBoundariesModel fb) {
        this.fundingBoundaries = fb;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && (loan == null || loan.isEmpty()) &&
                (credit == null || credit.isEmpty()) &&
                (expansionLineGP == null || expansionLineGP.isEmpty()) &&
                (fundingBoundaries == null || fundingBoundaries.isEmpty()) &&
                (unknowns == null || unknowns.isEmpty());
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        int size = 4;

        boolean loanGP = true;
        boolean creditGP = true;
        boolean expansionLine = true;
        boolean fundingBoundariesB = true;
        boolean unknown = true;

        if (loan == null || loan.isEmpty()) {
            loanGP = false;
            size--;
        }
        if (credit == null || credit.isEmpty()) {
            creditGP = false;
            size--;
        }
        if (expansionLineGP == null || expansionLineGP.isEmpty()) {
            expansionLine = false;
            size--;
        }
        if (fundingBoundaries == null || fundingBoundaries.isEmpty()) {
            fundingBoundariesB = false;
            size--;
        }
        if (unknowns == null || unknowns.isEmpty()) {
            unknown = false;
        } else {
            size += unknowns.size();
        }
        IDKDisplayData[] data = new IDKDisplayData[size];
        size = 0;
        if (loanGP) {
            data[size++] = loan;
        }
        if (creditGP) {
            data[size++] = credit;
        }
        if (expansionLine) {
            data[size++] = expansionLineGP;
        }
        if (fundingBoundariesB) {
            data[size++] = fundingBoundaries;
        }
        if (unknown) {
            for (UnknownModel displayData : unknowns) {
                data[size++] = displayData;
            }
        }

        return data;
    }

    @Override
    public String toString() {
        return "AdditionalProductModel{" +
                "loan=" + loan +
                ", credit=" + credit +
                ", expansionLineGP=" + expansionLineGP +
                ", fundingBoundaries=" + fundingBoundaries +
                ", unknowns=" + unknowns +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.loan, flags);
        dest.writeParcelable(this.credit, flags);
        dest.writeParcelable(this.expansionLineGP, 0);
        dest.writeParcelable(this.fundingBoundaries, flags);
        dest.writeSerializable(this.unknowns);
        dest.writeParcelable(this.amount, 0);
    }

    private AdditionalProductModel(Parcel in) {
        this.loan = in.readParcelable(AccountLoanModel.class.getClassLoader());
        this.credit = in.readParcelable(AccountCreditModel.class.getClassLoader());
        this.expansionLineGP = in.readParcelable(ExpansionLineGPModel.class.getClassLoader());
        this.fundingBoundaries = in.readParcelable(FundingBoundariesModel.class.getClassLoader());
        if (unknowns == null) {
            unknowns = new ArrayList<UnknownModel>();
        }
        in.readList(unknowns, UnknownModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<AdditionalProductModel> CREATOR = new Creator<AdditionalProductModel>() {
        public AdditionalProductModel createFromParcel(Parcel source) {
            return new AdditionalProductModel(source);
        }

        public AdditionalProductModel[] newArray(int size) {
            return new AdditionalProductModel[size];
        }
    };
}
