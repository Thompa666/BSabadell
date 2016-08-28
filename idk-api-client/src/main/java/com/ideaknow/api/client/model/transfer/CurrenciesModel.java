package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;

import java.util.*;

public class CurrenciesModel implements Parcelable {

    private ArrayList<KeyValueModel> currencies;

    public CurrenciesModel() {
    }

    public ArrayList<KeyValueModel> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(ArrayList<KeyValueModel> currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return "CurrenciesListModel{" +
                "currencies=" + currencies +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.currencies);
    }

    private CurrenciesModel(Parcel in) {
        if (this.currencies == null) {
            this.currencies = new ArrayList<KeyValueModel>();
        }
        in.readList(this.currencies, KeyValueModel.class.getClassLoader());
    }

    public static final Creator<CurrenciesModel> CREATOR = new Creator<CurrenciesModel>() {
        public CurrenciesModel createFromParcel(Parcel source) {
            return new CurrenciesModel(source);
        }

        public CurrenciesModel[] newArray(int size) {
            return new CurrenciesModel[size];
        }
    };
}
