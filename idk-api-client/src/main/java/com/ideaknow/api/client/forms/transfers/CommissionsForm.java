package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.transfer.BeneficiaryModel;

public class CommissionsForm implements Parcelable {

    public static final String COMMISSION_CODE_SHARED = "SHA";
    public static final String COMMISSION_CODE_ORDERER = "ORD";
    public static final String COMMISSION_CODE_BENEFICIARY = "BEN";

    private BeneficiaryModel beneficiary;
    private AmountModel amount;
    private AccountModel account;
    private String commissionCode;

    public CommissionsForm() {
    }

    public BeneficiaryModel getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(BeneficiaryModel beneficiary) {
        this.beneficiary = beneficiary;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public String getCommissionCode() {
        return commissionCode;
    }

    public void setCommissionCode(String commissionCode) {
        this.commissionCode = commissionCode;
    }

    @Override
    public String toString() {
        return "CommissionsForm{" +
                "beneficiary=" + beneficiary +
                ", amount=" + amount +
                ", account=" + account +
                ", commissionCode='" + commissionCode + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.beneficiary, 0);
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.account, 0);
        dest.writeString(this.commissionCode);
    }

    private CommissionsForm(Parcel in) {
        this.beneficiary = in.readParcelable(BeneficiaryModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.commissionCode = in.readString();
    }

    public static final Creator<CommissionsForm> CREATOR = new Creator<CommissionsForm>() {
        public CommissionsForm createFromParcel(Parcel source) {
            return new CommissionsForm(source);
        }

        public CommissionsForm[] newArray(int size) {
            return new CommissionsForm[size];
        }
    };
}
