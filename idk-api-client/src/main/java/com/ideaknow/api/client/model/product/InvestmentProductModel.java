package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.IDKDisplayData;

import java.util.*;

public class InvestmentProductModel extends BaseProductModel implements Parcelable {

    private AccountFinancialModel securities;
    private AccountFinancialModel pensionPlan;
    private IPFFinancialModel insuredPlanForecast;
    private AccountFinancialModel investmentFund;
    private DepositProductModel depositProduct;
    private ArrayList<UnknownModel> unknowns;

    public InvestmentProductModel() {
        super();
        securities = new AccountFinancialModel();
        pensionPlan = new AccountFinancialModel();
        insuredPlanForecast = new IPFFinancialModel();
        investmentFund = new AccountFinancialModel();
        depositProduct = new DepositProductModel();
        unknowns = new ArrayList<UnknownModel>();
    }

    public AccountFinancialModel getSecurities() {
        return securities;
    }

    public void setSecurities(AccountFinancialModel securities) {
        this.securities = securities;
    }

    public AccountFinancialModel getPensionPlan() {
        return pensionPlan;
    }

    public void setPensionPlan(AccountFinancialModel pensionPlan) {
        this.pensionPlan = pensionPlan;
    }

    public IPFFinancialModel getInsuredPlanForecast() {
        return insuredPlanForecast;
    }

    public void setInsuredPlanForecast(IPFFinancialModel insuredPlanForecast) {
        this.insuredPlanForecast = insuredPlanForecast;
    }

    public AccountFinancialModel getInvestmentFund() {
        return investmentFund;
    }

    public void setInvestmentFund(AccountFinancialModel investmentFund) {
        this.investmentFund = investmentFund;
    }

    public DepositProductModel getDepositProduct() {
        return depositProduct;
    }

    public void setDepositProduct(DepositProductModel depositProduct) {
        this.depositProduct = depositProduct;
    }

    public ArrayList<UnknownModel> getUnknowns() {
        return unknowns;
    }

    public void setUnknowns(ArrayList<UnknownModel> unknowns) {
        this.unknowns = unknowns;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty() && (securities == null || securities.isEmpty())
                && (pensionPlan == null || pensionPlan.isEmpty()) &&
                (insuredPlanForecast == null || insuredPlanForecast.isEmpty()) &&
                (depositProduct == null || depositProduct.isEmpty()) &&
                (unknowns == null || unknowns.isEmpty()) &&
                (investmentFund == null || investmentFund.isEmpty());
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        int size = 5;

        boolean securitiesIt = true;
        boolean pension = true;
        boolean insured = true;
        boolean deposit = true;
        boolean investment = true;
        boolean unknown = true;

        if (securities == null || securities.isEmpty()) {
            securitiesIt = false;
            size--;
        }

        if (pensionPlan == null || pensionPlan.isEmpty()) {
            pension = false;
            size--;
        }
        if (insuredPlanForecast == null || insuredPlanForecast.isEmpty()) {
            insured = false;
            size--;
        }
        if (depositProduct == null || depositProduct.isEmpty()) {
            deposit = false;
            size--;
        }
        if (investmentFund == null || investmentFund.isEmpty()) {
            investment = false;
            size--;
        }
        if (unknowns == null || unknowns.isEmpty()) {
            unknown = false;
        } else {
            size += unknowns.size();
        }
        IDKDisplayData[] data = new IDKDisplayData[size];
        size = 0;
        if (securitiesIt) {
            data[size++] = securities;
        }
        if (pension) {
            data[size++] = pensionPlan;
        }
        if (insured) {
            data[size++] = insuredPlanForecast;
        }
        if (deposit) {
            data[size++] = depositProduct;
        }
        if (investment) {
            data[size++] = investmentFund;
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
        return "InvestmentProductModel{" +
                "securities=" + securities +
                ", pensionPlan=" + pensionPlan +
                ", insuredPlanForecast=" + insuredPlanForecast +
                ", investmentFund=" + investmentFund +
                ", depositProduct=" + depositProduct +
                ", unknowns=" + unknowns +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.securities, 0);
        dest.writeParcelable(this.pensionPlan, 0);
        dest.writeParcelable(this.insuredPlanForecast, 0);
        dest.writeParcelable(this.investmentFund, 0);
        dest.writeParcelable(this.depositProduct, 0);
        dest.writeList(this.unknowns);
        dest.writeParcelable(this.amount, 0);
    }

    private InvestmentProductModel(Parcel in) {
        this.securities = in.readParcelable(AccountFinancialModel.class.getClassLoader());
        this.pensionPlan = in.readParcelable(AccountFinancialModel.class.getClassLoader());
        this.insuredPlanForecast = in.readParcelable(IPFFinancialModel.class.getClassLoader());
        this.investmentFund = in.readParcelable(AccountFinancialModel.class.getClassLoader());
        this.depositProduct = in.readParcelable(AccountProductModel.class.getClassLoader());
        if (unknowns == null) {
            unknowns = new ArrayList<UnknownModel>();
        }
        in.readList(unknowns, UnknownModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<InvestmentProductModel> CREATOR = new
            Creator<InvestmentProductModel>() {
                public InvestmentProductModel createFromParcel(Parcel source) {
                    return new InvestmentProductModel(source);
                }

                public InvestmentProductModel[] newArray(int size) {
                    return new InvestmentProductModel[size];
                }
            };
}
