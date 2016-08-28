package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.accounts.AccountPayerModel;

public class TransferModel implements Parcelable {

    private AmountModel amount;
    private String purpose;
    private AccountModel account;
    private BeneficiaryModel beneficiary;
    private String date;
    private AccountPayerModel accountPayer;
    private boolean national;
    private boolean salary;
    private String sequenceNumber;
    private String reference;
    private String operationNumber;
    private AmountModel totalAmount;
    private AmountModel transferCommission;
    private String commissionCode;
    private AmountModel cancelCommission;
    private String cessionCode;
    private String cessionDesc;
    private String dollarDate;
    private String dollarDateRange;

    public TransferModel() {
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public BeneficiaryModel getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(BeneficiaryModel beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AccountPayerModel getAccountPayer() {
        return accountPayer;
    }

    public void setAccountPayer(AccountPayerModel accountPayer) {
        this.accountPayer = accountPayer;
    }

    public boolean isNational() {
        return national;
    }

    public void setNational(boolean national) {
        this.national = national;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    public AmountModel getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(AmountModel totalAmount) {
        this.totalAmount = totalAmount;
    }

    public AmountModel getTransferCommission() {
        return transferCommission;
    }

    public void setTransferCommission(AmountModel transferCommission) {
        this.transferCommission = transferCommission;
    }

    public String getCommissionCode() {
        return commissionCode;
    }

    public void setCommissionCode(String commissionCode) {
        this.commissionCode = commissionCode;
    }

    public AmountModel getCancelCommission() {
        return cancelCommission;
    }

    public void setCancelCommission(AmountModel cancelCommission) {
        this.cancelCommission = cancelCommission;
    }

    public String getCessionCode() {
        return cessionCode;
    }

    public void setCessionCode(String cessionCode) {
        this.cessionCode = cessionCode;
    }

    public String getCessionDesc() {
        return cessionDesc;
    }

    public void setCessionDesc(String cessionDesc) {
        this.cessionDesc = cessionDesc;
    }

    public String getDollarDate() {
        return dollarDate;
    }

    public void setDollarDate(String dollarDate) {
        this.dollarDate = dollarDate;
    }

    public String getDollarDateRange() {
        return dollarDateRange;
    }

    public void setDollarDateRange(String dollarDateRange) {
        this.dollarDateRange = dollarDateRange;
    }

    @Override
    public String toString() {
        return "TransferModel{" +
                "amount=" + amount +
                ", purpose='" + purpose + '\'' +
                ", account=" + account +
                ", beneficiary=" + beneficiary +
                ", date='" + date + '\'' +
                ", accountPayer=" + accountPayer +
                ", national=" + national +
                ", salary=" + salary +
                ", sequenceNumber='" + sequenceNumber + '\'' +
                ", reference='" + reference + '\'' +
                ", operationNumber='" + operationNumber + '\'' +
                ", totalAmount=" + totalAmount +
                ", transferCommission=" + transferCommission +
                ", commissionCode='" + commissionCode + '\'' +
                ", cancelCommission=" + cancelCommission +
                ", cessionCode='" + cessionCode + '\'' +
                ", cessionDesc='" + cessionDesc + '\'' +
                ", dollarDate='" + dollarDate + '\'' +
                ", dollarDateRange='" + dollarDateRange + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.purpose);
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.beneficiary, 0);
        dest.writeString(this.date);
        dest.writeParcelable(this.accountPayer, 0);
        dest.writeByte(national ? (byte) 1 : (byte) 0);
        dest.writeByte(salary ? (byte) 1 : (byte) 0);
        dest.writeString(this.sequenceNumber);
        dest.writeString(this.reference);
        dest.writeString(this.operationNumber);
        dest.writeParcelable(this.totalAmount, 0);
        dest.writeParcelable(this.transferCommission, 0);
        dest.writeString(this.commissionCode);
        dest.writeParcelable(this.cancelCommission, 0);
        dest.writeString(this.cessionCode);
        dest.writeString(this.cessionDesc);
        dest.writeString(this.dollarDate);
        dest.writeString(this.dollarDateRange);
    }

    private TransferModel(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.purpose = in.readString();
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.beneficiary = in.readParcelable(BeneficiaryModel.class.getClassLoader());
        this.date = in.readString();
        this.accountPayer = in.readParcelable(AccountPayerModel.class.getClassLoader());
        this.national = in.readByte() != 0;
        this.salary = in.readByte() != 0;
        this.sequenceNumber = in.readString();
        this.reference = in.readString();
        this.operationNumber = in.readString();
        this.totalAmount = in.readParcelable(AmountModel.class.getClassLoader());
        this.transferCommission = in.readParcelable(AmountModel.class.getClassLoader());
        this.commissionCode = in.readString();
        this.cancelCommission = in.readParcelable(AmountModel.class.getClassLoader());
        this.cessionCode = in.readString();
        this.cessionDesc = in.readString();
        this.dollarDate = in.readString();
        this.dollarDateRange = in.readString();
    }

    public static final Creator<TransferModel> CREATOR = new Creator<TransferModel>() {
        public TransferModel createFromParcel(Parcel source) {
            return new TransferModel(source);
        }

        public TransferModel[] newArray(int size) {
            return new TransferModel[size];
        }
    };
}
