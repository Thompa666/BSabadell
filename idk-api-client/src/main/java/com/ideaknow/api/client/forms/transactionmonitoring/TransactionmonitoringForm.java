package com.ideaknow.api.client.forms.transactionmonitoring;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.alerts.AlertContractModel;
import com.ideaknow.api.client.model.transfer.BeneficiaryModel;

public class TransactionmonitoringForm implements Parcelable {

    public static final String OP_INTERNATIONAL_TRANSFER = "TRIX";
    public static final String OP_NATIONAL_TRANSFER = "TRAF";
    public static final String OP_OWN_TRANSFER = "TRPR";
    public static final String OP_ATM_ENROLLMENT = "GINS";
    public static final String OP_ATM_OTP = "AATM";
    public static final String OP_CODE_VTPC = "GTPC";
    public static final String OP_CODE_INSTANT_MONEY = "AEFM";
    public static final String OP_CODE_INSTANT_MONEY_ACTIVATION = "EEFM";
    public static final String OP_MESSAGING_ENROLLMENT = "ABSL";
    public static final String OP_CODE_VTPC2 = "AVTC";
    public static final String OP_CODE_VTPC2_UPDATE = "GEMV";

    private AmountModel amount;
    private AccountModel account;
    private BeneficiaryModel beneficiary;
    private AlertContractModel alertContract;
    private String operationCode;
    private boolean registeredDevice;
    private String phoneNumber;
    private String signatureType;
    private boolean softEnrollment;

    public TransactionmonitoringForm() {
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

    public BeneficiaryModel getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(BeneficiaryModel beneficiary) {
        this.beneficiary = beneficiary;
    }

    public AlertContractModel getAlertContract() {
        return alertContract;
    }

    public void setAlertContract(AlertContractModel alertContract) {
        this.alertContract = alertContract;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public boolean isRegisteredDevice() {
        return registeredDevice;
    }

    public void setRegisteredDevice(boolean registeredDevice) {
        this.registeredDevice = registeredDevice;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public boolean isSoftEnrollment() {
        return softEnrollment;
    }

    public void setSoftEnrollment(boolean softEnrollment) {
        this.softEnrollment = softEnrollment;
    }

    @Override
    public String toString() {
        return "TransactionmonitoringForm{" +
                "amount=" + amount +
                ", account=" + account +
                ", beneficiary=" + beneficiary +
                ", alertContract=" + alertContract +
                ", operationCode='" + operationCode + '\'' +
                ", registeredDevice=" + registeredDevice +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", signatureType='" + signatureType + '\'' +
                ", softEnrollment=" + softEnrollment +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.beneficiary, 0);
        dest.writeParcelable(this.alertContract, 0);
        dest.writeString(this.operationCode);
        dest.writeByte(registeredDevice ? (byte) 1 : (byte) 0);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.signatureType);
        dest.writeByte(softEnrollment ? (byte) 1 : (byte) 0);
    }

    private TransactionmonitoringForm(Parcel in) {
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.beneficiary = in.readParcelable(BeneficiaryModel.class.getClassLoader());
        this.alertContract = in.readParcelable(AlertContractModel.class.getClassLoader());
        this.operationCode = in.readString();
        this.registeredDevice = in.readByte() != 0;
        this.phoneNumber = in.readString();
        this.signatureType = in.readString();
        this.softEnrollment = in.readByte() != 0;
    }

    public static final Creator<TransactionmonitoringForm> CREATOR =
            new Creator<TransactionmonitoringForm>() {
                public TransactionmonitoringForm createFromParcel(Parcel source) {
                    return new TransactionmonitoringForm(source);
                }

                public TransactionmonitoringForm[] newArray(int size) {
                    return new TransactionmonitoringForm[size];
                }
            };
}
