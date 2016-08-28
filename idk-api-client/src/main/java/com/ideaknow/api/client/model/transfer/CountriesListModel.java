package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class CountriesListModel implements Parcelable {

    private ArrayList<CountryModel> countries;

    public CountriesListModel() {
    }

    public ArrayList<CountryModel> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<CountryModel> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CountriesListModel{" +
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

    private CountriesListModel(Parcel in) {
        if (this.countries == null) {
            this.countries = new ArrayList<CountryModel>();
        }
        in.readList(this.countries, CountryModel.class.getClassLoader());
    }

    public static final Creator<CountriesListModel> CREATOR = new Creator<CountriesListModel>() {
        public CountriesListModel createFromParcel(Parcel source) {
            return new CountriesListModel(source);
        }

        public CountriesListModel[] newArray(int size) {
            return new CountriesListModel[size];
        }
    };
}
