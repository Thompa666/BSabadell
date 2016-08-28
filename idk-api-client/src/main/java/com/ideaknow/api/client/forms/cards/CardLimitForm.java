package com.ideaknow.api.client.forms.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;
import com.ideaknow.api.client.model.key.KeyModel;

import java.util.*;

public class CardLimitForm implements Parcelable {

    public static final String LIMIT_TYPE_PERMANENT = "permanente";
    public static final String LIMIT_TYPE_TEMPORARY = "temporal";

    private String email;
    private String phoneNumber;
    private String brand;
    private ArrayList<KeyValueModel> keyValues;
    private KeyModel key;

    public CardLimitForm() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArrayList<KeyValueModel> getKeyValues() {
        return keyValues;
    }

    public void setKeyValues(ArrayList<KeyValueModel> keyValues) {
        this.keyValues = keyValues;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "CardLimitForm{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", keyValues=" + keyValues +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.email);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.brand);
        dest.writeList(this.keyValues);
        dest.writeParcelable(this.key, 0);
    }

    private CardLimitForm(Parcel in) {
        this.email = in.readString();
        this.phoneNumber = in.readString();
        this.brand = in.readString();
        if (this.keyValues == null) {
            this.keyValues = new ArrayList<KeyValueModel>();
        }
        in.readList(this.keyValues, KeyValueModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<CardLimitForm> CREATOR = new Creator<CardLimitForm>() {
        public CardLimitForm createFromParcel(Parcel source) {
            return new CardLimitForm(source);
        }

        public CardLimitForm[] newArray(int size) {
            return new CardLimitForm[size];
        }
    };
}
