package com.ideaknow.api.client.model.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ContractModel implements Parcelable {

    private String number;
    private String name;

    public ContractModel() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContractModel{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.number);
        dest.writeString(this.name);
    }

    private ContractModel(Parcel in) {
        this.number = in.readString();
        this.name = in.readString();
    }

    public static final Creator<ContractModel> CREATOR = new Creator<ContractModel>() {
        public ContractModel createFromParcel(Parcel source) {
            return new ContractModel(source);
        }

        public ContractModel[] newArray(int size) {
            return new ContractModel[size];
        }
    };
}
