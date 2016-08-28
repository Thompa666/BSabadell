package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;

public class TransferInternationalBicForm implements Parcelable {

    private String countryKey;
    private String bankKey;
    private String cityKey;

    public TransferInternationalBicForm() {
    }

    public String getCountryKey() {
        return countryKey;
    }

    public void setCountryKey(String countryKey) {
        this.countryKey = countryKey;
    }

    public String getBankKey() {
        return bankKey;
    }

    public void setBankKey(String bankKey) {
        this.bankKey = bankKey;
    }

    public String getCityKey() {
        return cityKey;
    }

    public void setCityKey(String cityKey) {
        this.cityKey = cityKey;
    }

    @Override
    public String toString() {
        return "TransferInternationalBicForm{" +
                "countryKey='" + countryKey + '\'' +
                ", bankKey='" + bankKey + '\'' +
                ", cityKey='" + cityKey + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.countryKey);
        dest.writeString(this.bankKey);
        dest.writeString(this.cityKey);
    }

    private TransferInternationalBicForm(Parcel in) {
        this.countryKey = in.readString();
        this.bankKey = in.readString();
        this.cityKey = in.readString();
    }

    public static final Creator<TransferInternationalBicForm> CREATOR = new Creator<TransferInternationalBicForm>() {
        public TransferInternationalBicForm createFromParcel(Parcel source) {
            return new TransferInternationalBicForm(source);
        }

        public TransferInternationalBicForm[] newArray(int size) {
            return new TransferInternationalBicForm[size];
        }
    };
}
