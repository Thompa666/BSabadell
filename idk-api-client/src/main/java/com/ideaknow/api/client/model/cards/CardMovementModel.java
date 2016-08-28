package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.offices.GeoPointModel;

public class CardMovementModel implements Parcelable {

    private String movementNumber;
    private String concept;
    private String date;
    private String city;
    private boolean canSplit;
    private AmountModel amount;
    private boolean indFracEnabled;
    private String indMov;
    private boolean isTraspasable;
    private AmountModel commission;
    private AmountModel originAmount;
    private String address;
    private GeoPointModel point;
    private boolean isConfirmed;

    public CardMovementModel() {
        super();
    }

    public String getMovementNumber() {
        return movementNumber;
    }

    public void setMovementNumber(String movementNumber) {
        this.movementNumber = movementNumber;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isCanSplit() {
        return canSplit;
    }

    public void setCanSplit(boolean canSplit) {
        this.canSplit = canSplit;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public boolean isIndFracEnabled() {
        return indFracEnabled;
    }

    public void setIndFracEnabled(boolean indFracEnabled) {
        this.indFracEnabled = indFracEnabled;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public boolean getIsTraspasable() {
        return isTraspasable;
    }

    public void setIsTraspasable(boolean isTraspasable) {
        this.isTraspasable = isTraspasable;
    }

    public AmountModel getCommission() {
        return commission;
    }

    public void setCommission(AmountModel commission) {
        this.commission = commission;
    }

    public AmountModel getOriginAmount() {
        return originAmount;
    }

    public void setOriginAmount(AmountModel originAmount) {
        this.originAmount = originAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GeoPointModel getPoint() {
        return point;
    }

    public void setPoint(GeoPointModel point) {
        this.point = point;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    @Override
    public String toString() {
        return "CardMovementModel{" +
                "movementNumber='" + movementNumber + '\'' +
                ", concept='" + concept + '\'' +
                ", date='" + date + '\'' +
                ", city='" + city + '\'' +
                ", canSplit=" + canSplit +
                ", amount=" + amount +
                ", indFracEnabled=" + indFracEnabled +
                ", indMov='" + indMov + '\'' +
                ", isTraspasable=" + isTraspasable +
                ", commission=" + commission +
                ", originAmount=" + originAmount +
                ", address='" + address + '\'' +
                ", point=" + point +
                ", isConfirmed=" + isConfirmed +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.movementNumber);
        dest.writeString(this.concept);
        dest.writeString(this.date);
        dest.writeString(this.city);
        dest.writeByte(canSplit ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.amount, 0);
        dest.writeByte(indFracEnabled ? (byte) 1 : (byte) 0);
        dest.writeString(this.indMov);
        dest.writeByte(isTraspasable ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.commission, 0);
        dest.writeParcelable(this.originAmount, 0);
        dest.writeString(this.address);
        dest.writeParcelable(this.point, 0);
        dest.writeByte(isConfirmed ? (byte) 1 : (byte) 0);
    }

    private CardMovementModel(Parcel in) {
        this.movementNumber = in.readString();
        this.concept = in.readString();
        this.date = in.readString();
        this.city = in.readString();
        this.canSplit = in.readByte() != 0;
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.indFracEnabled = in.readByte() != 0;
        this.indMov = in.readString();
        this.isTraspasable = in.readByte() != 0;
        this.commission = in.readParcelable(AmountModel.class.getClassLoader());
        this.originAmount = in.readParcelable(AmountModel.class.getClassLoader());
        this.address = in.readString();
        this.point = in.readParcelable(GeoPointModel.class.getClassLoader());
        this.isConfirmed = in.readByte() != 0;
    }

    public static final Creator<CardMovementModel> CREATOR = new Creator<CardMovementModel>() {
        public CardMovementModel createFromParcel(Parcel source) {
            return new CardMovementModel(source);
        }

        public CardMovementModel[] newArray(int size) {
            return new CardMovementModel[size];
        }
    };
}
