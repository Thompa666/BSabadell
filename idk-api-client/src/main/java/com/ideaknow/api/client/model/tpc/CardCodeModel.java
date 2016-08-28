package com.ideaknow.api.client.model.tpc;

import android.os.Parcel;
import android.os.Parcelable;

public class CardCodeModel implements Parcelable {

    private String code;
    private String value;

    public CardCodeModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardCodeModel{" +
                "code='" + code + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.value);
    }

    private CardCodeModel(Parcel in) {
        this.code = in.readString();
        this.value = in.readString();
    }

    public static final Parcelable.Creator<CardCodeModel> CREATOR = new Parcelable.Creator<CardCodeModel>() {
        public CardCodeModel createFromParcel(Parcel source) {
            return new CardCodeModel(source);
        }

        public CardCodeModel[] newArray(int size) {
            return new CardCodeModel[size];
        }
    };
}
