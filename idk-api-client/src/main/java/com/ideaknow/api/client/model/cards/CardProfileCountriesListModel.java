package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.transfer.CountryModel;

import java.util.*;

public class CardProfileCountriesListModel implements Parcelable {

    private ArrayList<CountryModel> countries;

    public CardProfileCountriesListModel() {
    }

    public ArrayList<CountryModel> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<CountryModel> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CardProfileCountriesListModel{" +
                "countries=" + countries +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.countries);
    }

    private CardProfileCountriesListModel(Parcel in) {
        if (countries == null) {
            countries = new ArrayList<CountryModel>();
        }
        in.readList(countries, CountryModel.class.getClassLoader());
    }

    public static final Creator<CardProfileCountriesListModel> CREATOR = new Creator<CardProfileCountriesListModel>() {
        public CardProfileCountriesListModel createFromParcel(Parcel source) {
            return new CardProfileCountriesListModel(source);
        }

        public CardProfileCountriesListModel[] newArray(int size) {
            return new CardProfileCountriesListModel[size];
        }
    };
}
