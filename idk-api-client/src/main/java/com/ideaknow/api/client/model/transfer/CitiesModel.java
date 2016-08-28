package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;

import java.util.*;

public class CitiesModel implements Parcelable {

    private ArrayList<KeyValueModel> cities;

    public CitiesModel() {
    }

    public ArrayList<KeyValueModel> getCities() {
        return cities;
    }

    public void setCities(ArrayList<KeyValueModel> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "CitiesModel{" +
                "cities=" + cities +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.cities);
    }

    private CitiesModel(Parcel in) {
        if (this.cities == null) {
            this.cities = new ArrayList<KeyValueModel>();
        }
        in.readList(this.cities, KeyValueModel.class.getClassLoader());
    }

    public static final Creator<CitiesModel> CREATOR = new Creator<CitiesModel>() {
        public CitiesModel createFromParcel(Parcel source) {
            return new CitiesModel(source);
        }

        public CitiesModel[] newArray(int size) {
            return new CitiesModel[size];
        }
    };
}
