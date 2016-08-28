package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

public class BeneficiaryResultModel implements Parcelable{

    BeneficiaryModel beneficiary;

    public BeneficiaryResultModel() {
    }

    public BeneficiaryModel getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(BeneficiaryModel beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Override
    public String toString() {
        return "BeneficiaryResultModel{" +
                "beneficiary=" + beneficiary +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.beneficiary, 0);
    }

    private BeneficiaryResultModel(Parcel in) {
        this.beneficiary = in.readParcelable(BeneficiaryModel.class.getClassLoader());
    }

    public static Creator<BeneficiaryResultModel> CREATOR = new Creator<BeneficiaryResultModel>() {
        public BeneficiaryResultModel createFromParcel(Parcel source) {
            return new BeneficiaryResultModel(source);
        }

        public BeneficiaryResultModel[] newArray(int size) {
            return new BeneficiaryResultModel[size];
        }
    };
}
