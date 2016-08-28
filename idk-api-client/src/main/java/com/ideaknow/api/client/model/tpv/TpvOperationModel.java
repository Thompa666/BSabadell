package com.ideaknow.api.client.model.tpv;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.KeyValueModel;

public class TpvOperationModel implements Parcelable {

    public static final String STATUS_PROCESSED = "F";
    public static final String STATUS_PROCESSING = "P";
    public static final String STATUS_REQUESTED = "S";
    public static final String STATUS_NO_RESPONSE = "T";
    public static final String STATUS_ERROR = "E";
    public static final String STATUS_SPECIAL_ERROR = "I";
    public static final String STATUS_TEMPORAL = "W";

    private String merchantCode;
    private String merchantData;
    private String terminal;
    private String order;
    private boolean refund;
    private String date;
    private String hour;
    private AmountModel amount;
    private boolean securePayment;
    private KeyValueModel status;
    private String result;

    public TpvOperationModel() {
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantData() {
        return merchantData;
    }

    public void setMerchantData(String merchantData) {
        this.merchantData = merchantData;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isRefund() {
        return refund;
    }

    public void setRefund(boolean refund) {
        this.refund = refund;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public boolean isSecurePayment() {
        return securePayment;
    }

    public void setSecurePayment(boolean securePayment) {
        this.securePayment = securePayment;
    }

    public KeyValueModel getStatus() {
        return status;
    }

    public void setStatus(KeyValueModel status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TpvOperationModel{" +
                "merchantCode='" + merchantCode + '\'' +
                ", merchantData='" + merchantData + '\'' +
                ", terminal='" + terminal + '\'' +
                ", order='" + order + '\'' +
                ", refund=" + refund +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", amount=" + amount +
                ", securePayment=" + securePayment +
                ", status=" + status +
                ", result='" + result + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.merchantCode);
        dest.writeString(this.merchantData);
        dest.writeString(this.terminal);
        dest.writeString(this.order);
        dest.writeByte(refund ? (byte) 1 : (byte) 0);
        dest.writeString(this.date);
        dest.writeString(this.hour);
        dest.writeParcelable(this.amount, 0);
        dest.writeByte(securePayment ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.status, 0);
        dest.writeString(this.result);
    }

    private TpvOperationModel(Parcel in) {
        this.merchantCode = in.readString();
        this.merchantData = in.readString();
        this.terminal = in.readString();
        this.order = in.readString();
        this.refund = in.readByte() != 0;
        this.date = in.readString();
        this.hour = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.securePayment = in.readByte() != 0;
        this.status = in.readParcelable(KeyValueModel.class.getClassLoader());
        this.result = in.readString();
    }

    public static final Parcelable.Creator<TpvOperationModel> CREATOR =
            new Parcelable.Creator<TpvOperationModel>() {
        public TpvOperationModel createFromParcel(Parcel source) {
            return new TpvOperationModel(source);
        }

        public TpvOperationModel[] newArray(int size) {
            return new TpvOperationModel[size];
        }
    };
}
