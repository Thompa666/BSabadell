package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;

public class CardSettlementModel implements Parcelable {

    private String datePay;
    private String dateValue;
    private String settlementState;
    private AmountModel amount;
    private AmountModel pendingAmount;
    private String settlementId;
    private String documentId;
    private String settlement;

    public CardSettlementModel() {
        super();
    }

    public String getDatePay() {
        return datePay;
    }

    public void setDatePay(String datePay) {
        this.datePay = datePay;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public String getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(String settlementState) {
        this.settlementState = settlementState;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public AmountModel getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(AmountModel pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    @Override
    public String toString() {
        return "CardSettlementModel{" +
                "datePay='" + datePay + '\'' +
                ", dateValue='" + dateValue + '\'' +
                ", settlementState='" + settlementState + '\'' +
                ", amount=" + amount +
                ", pendingAmount=" + pendingAmount +
                ", settlementId='" + settlementId + '\'' +
                ", documentId='" + documentId + '\'' +
                ", settlement='" + settlement + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.datePay);
        dest.writeString(this.dateValue);
        dest.writeString(this.settlementState);
        dest.writeParcelable(this.amount, 0);
        dest.writeParcelable(this.pendingAmount, 0);
        dest.writeString(this.settlementId);
        dest.writeString(this.documentId);
        dest.writeString(this.settlement);
    }

    private CardSettlementModel(Parcel in) {
        this.datePay = in.readString();
        this.dateValue = in.readString();
        this.settlementState = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.pendingAmount = in.readParcelable(AmountModel.class.getClassLoader());
        this.settlementId = in.readString();
        this.documentId = in.readString();
        this.settlement = in.readString();
    }

    public static final Creator<CardSettlementModel> CREATOR = new Creator<CardSettlementModel>() {
        public CardSettlementModel createFromParcel(Parcel source) {
            return new CardSettlementModel(source);
        }

        public CardSettlementModel[] newArray(int size) {
            return new CardSettlementModel[size];
        }
    };
}
