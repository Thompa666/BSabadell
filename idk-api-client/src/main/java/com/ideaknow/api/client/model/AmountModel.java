package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.lib.StringUtils;

public class AmountModel extends BaseModel implements Parcelable {

    private String value;
    private String currency;

    public AmountModel() {
        super();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean isEmpty() {
        return StringUtils.isEmpty(value) && StringUtils.isEmpty(currency);
    }

    @Override
    public String toString() {
        return "AmountModel{" +
                "value='" + value + '\'' +
                ", currency='" + currency + '\'' +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.value);
        dest.writeString(this.currency);
    }

    private AmountModel(Parcel in) {
        this.value = in.readString();
        this.currency = in.readString();
    }

    public static Creator<AmountModel> CREATOR = new Creator<AmountModel>() {
        public AmountModel createFromParcel(Parcel source) {
            return new AmountModel(source);
        }

        public AmountModel[] newArray(int size) {
            return new AmountModel[size];
        }
    };
}
