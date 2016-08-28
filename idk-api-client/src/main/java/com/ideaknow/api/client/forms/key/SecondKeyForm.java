package com.ideaknow.api.client.forms.key;

import android.os.Parcel;
import android.os.Parcelable;

public class SecondKeyForm implements Parcelable {

    public static final String OP_CODE_ALERT_CREATION = "AADI";
    public static final String OP_CODE_CARD_ACTIVATION_PIN = "TJAT";
    public static final String OP_CODE_CHANGE_PIN = "CPAS";
    public static final String OP_CODE_INSTANT_CASH = "TJTC";
    public static final String OP_CODE_CREDIT_SPLIT = "FRAC";
    public static final String OP_CODE_DEBIT_SPLIT = "FRAD";
    public static final String OP_CODE_CARD_BLOCK = "BLTJ";
    public static final String OP_CODE_CARD_CONDITIONS = "ATCR";
    public static final String OP_CODE_CARD_PROFILE_ACTIVATION = "MTPJ";
    public static final String OP_CODE_CARD_RECOVERY_PIN = "RPIN";
    public static final String OP_CODE_CARD_PREPAID_RELOAD = "TPRC";
    public static final String OP_CODE_CARD_NFC_SIGNUP_UNSUBSCRIBE = "THCE";
    public static final String OP_CODE_PUSH_CREATION = OP_CODE_ALERT_CREATION;
    public static final String OP_CODE_TRANSACTION_MONITORING = "TRAF";
    public static final String OP_CODE_RETURNBILL = "SRDR";
    public static final String OP_CODE_OWN_TRANSFER = "TSAL";
    public static final String OP_CODE_TRANSFER_TO_CARD = "TJTR";
    public static final String OP_CODE_CANCEL_TRANSFER = "ANUT";
    public static final String OP_CODE_DIRECT_DEBIT_BLOCK = "BDOM";
    public static final String OP_CODE_DIRECT_DEBIT_ACTIVATE_UPDATE = "MDOM";
    public static final String OP_CODE_INSTANT_CHECK_LIMIT_ACTIVATION = "MLOC";
    public static final String OP_CODE_CARD_CREDIT_LIMIT = "TJCL";
    public static final String OP_MESSAGING_UNENROLLMENT = "MINS";
    public static final String OP_ATM_UNENROLLMENT = "MINS";

    private String operationCode;
    private boolean registeredDevice;

    public SecondKeyForm() {

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

    @Override
    public String toString() {
        return "SecondKeyForm{" +
                "registeredDevice=" + registeredDevice +
                ", operationCode='" + operationCode + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.operationCode);
        dest.writeByte(registeredDevice ? (byte) 1 : (byte) 0);
    }

    private SecondKeyForm(Parcel in) {
        this.operationCode = in.readString();
        this.registeredDevice = in.readByte() != 0;
    }

    public static final Creator<SecondKeyForm> CREATOR = new Creator<SecondKeyForm>() {
        public SecondKeyForm createFromParcel(Parcel source) {
            return new SecondKeyForm(source);
        }

        public SecondKeyForm[] newArray(int size) {
            return new SecondKeyForm[size];
        }
    };
}
