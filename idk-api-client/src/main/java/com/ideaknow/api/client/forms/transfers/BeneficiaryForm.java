package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.transfer.BeneficiaryModel;

public class BeneficiaryForm implements Parcelable {

    BeneficiaryModel beneficiary;

    public BeneficiaryForm() {
    }

    public BeneficiaryModel getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(BeneficiaryModel beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Override
    public String toString() {
        return "BeneficiaryForm{" +
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

    private BeneficiaryForm(Parcel in) {
        this.beneficiary = in.readParcelable(BeneficiaryModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<BeneficiaryForm> CREATOR =
            new Parcelable.Creator<BeneficiaryForm>() {
                public BeneficiaryForm createFromParcel(Parcel source) {
                    return new BeneficiaryForm(source);
                }

                public BeneficiaryForm[] newArray(int size) {
                    return new BeneficiaryForm[size];
                }
            };
}
