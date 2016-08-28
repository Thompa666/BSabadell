package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ErrorResponse implements Parcelable {

    public static String ERROR_CODE_ACTIVATE_INSTANT_MONEY = "100";
    public static String ERROR_CODE_ALERTS_CONTRACTS_EMPTY_LIST = "101";
    public static String ERROR_CODE_PENDING_SIGN_OPERATIONS = "102";
    public static String ERROR_CODE_INSTANT_SELLING_ALERT_CONTRACTS_ERROR = "103"; // Everis code
    public static String ERROR_CODE_NFC_SIGN_UP_CARD = "104";

    private String errorMessage = "";
    private boolean isSessionExpired = false;
    private boolean mIsInstantMoneyDisabled = false;
    private boolean mNoAlertsContract = false;
    private boolean mDecodeError = false;
    private boolean mNfcAlreadyCardActivated = false;
    private boolean isHtml;
    private String html;
    private String data;
    private String charset;
    private String code;

    public ErrorResponse() {
    }

    public ErrorResponse(String html) {
        this.html = html;
        this.isHtml = true;
    }

    public ErrorResponse(String data, String charset) {
        this.data = data;
        this.charset = charset;
        this.mDecodeError = true;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSessionExpired() {
        return isSessionExpired;
    }

    public void setSessionExpired(boolean isSessionExpired) {
        this.isSessionExpired = isSessionExpired;
    }

    public boolean isInstantMoneyDisabled() {
        return mIsInstantMoneyDisabled;
    }

    public void setInstantMoneyDisabled(boolean instantMoneyDisabled) {
        mIsInstantMoneyDisabled = instantMoneyDisabled;
    }

    public boolean doesNotHaveAlertsContract() {
        return mNoAlertsContract;
    }

    public void setNoAlertsContract(boolean noAlertsContract) {
        mNoAlertsContract = noAlertsContract;
    }

    public boolean isHtml() {
        return isHtml;
    }

    public void setHtml(boolean isHtml) {
        this.isHtml = isHtml;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public boolean isDecodeError() {
        return mDecodeError;
    }

    public void setDecodeError(boolean decodeError) {
        mDecodeError = decodeError;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public boolean isNfcAlreadyCardActivated() {
        return mNfcAlreadyCardActivated;
    }

    public void setNfcCardAlreadyActivated(boolean nfcCardActivated) {
        mNfcAlreadyCardActivated = nfcCardActivated;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "errorMessage='" + errorMessage + '\'' +
                ", isSessionExpired=" + isSessionExpired +
                ", mIsInstantMoneyDisabled=" + mIsInstantMoneyDisabled +
                ", mNoAlertsContract=" + mNoAlertsContract +
                ", mDecodeError=" + mDecodeError +
                ", mNfcAlreadyCardActivated=" + mNfcAlreadyCardActivated +
                ", isHtml=" + isHtml +
                ", html='" + html + '\'' +
                ", data='" + data + '\'' +
                ", charset='" + charset + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.errorMessage);
        dest.writeByte(isSessionExpired ? (byte) 1 : (byte) 0);
        dest.writeByte(mIsInstantMoneyDisabled ? (byte) 1 : (byte) 0);
        dest.writeByte(mNoAlertsContract ? (byte) 1 : (byte) 0);
        dest.writeByte(mDecodeError ? (byte) 1 : (byte) 0);
        dest.writeByte(mNfcAlreadyCardActivated ? (byte) 1 : (byte) 0);
        dest.writeByte(isHtml ? (byte) 1 : (byte) 0);
        dest.writeString(this.html);
        dest.writeString(this.data);
        dest.writeString(this.charset);
        dest.writeString(this.code);
    }

    private ErrorResponse(Parcel in) {
        this.errorMessage = in.readString();
        this.isSessionExpired = in.readByte() != 0;
        this.mIsInstantMoneyDisabled = in.readByte() != 0;
        this.mNoAlertsContract = in.readByte() != 0;
        this.mDecodeError = in.readByte() != 0;
        this.mNfcAlreadyCardActivated = in.readByte() != 0;
        this.isHtml = in.readByte() != 0;
        this.html = in.readString();
        this.data = in.readString();
        this.charset = in.readString();
        this.code = in.readString();
    }

    public static final Creator<ErrorResponse> CREATOR = new Creator<ErrorResponse>() {
        public ErrorResponse createFromParcel(Parcel source) {
            return new ErrorResponse(source);
        }

        public ErrorResponse[] newArray(int size) {
            return new ErrorResponse[size];
        }
    };
}
