package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class BeneficiariesModel implements Parcelable {

    private ArrayList<BeneficiaryModel> beneficiaries;

    public BeneficiariesModel() {
    }

    public ArrayList<BeneficiaryModel> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(ArrayList<BeneficiaryModel> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    @Override
    public String toString() {
        return "BeneficiariesModel{" +
                "beneficiaries=" + beneficiaries +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.beneficiaries);
    }

    private BeneficiariesModel(Parcel in) {
        if (beneficiaries == null) {
            beneficiaries = new ArrayList<BeneficiaryModel>();
        }
        in.readList(beneficiaries, BeneficiaryModel.class.getClassLoader());
    }

    public static final Creator<BeneficiariesModel> CREATOR =
            new Creator<BeneficiariesModel>() {
                public BeneficiariesModel createFromParcel(Parcel source) {
                    return new BeneficiariesModel(source);
                }

                public BeneficiariesModel[] newArray(int size) {
                    return new BeneficiariesModel[size];
                }
            };
}
