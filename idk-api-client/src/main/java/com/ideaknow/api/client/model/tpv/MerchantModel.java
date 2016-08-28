package com.ideaknow.api.client.model.tpv;

import android.os.Parcel;
import android.os.Parcelable;

public class MerchantModel implements Parcelable {

    private String id;
    private String name;

    public MerchantModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MerchantModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
    }

    private MerchantModel(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<MerchantModel> CREATOR =
            new Parcelable.Creator<MerchantModel>() {
        public MerchantModel createFromParcel(Parcel source) {
            return new MerchantModel(source);
        }

        public MerchantModel[] newArray(int size) {
            return new MerchantModel[size];
        }
    };
}
