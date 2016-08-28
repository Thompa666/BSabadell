package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.PolicyModel;

import java.util.*;

public class InsuredPlanForecastModel extends BaseProductModel implements Parcelable {

    private PolicyModel[] policies;

    public InsuredPlanForecastModel() {
        amount = new AmountModel();
    }

    public PolicyModel[] getPolicies() {
        return policies;
    }

    public void setPolicies(PolicyModel[] policies) {
        this.policies = policies;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InsuredPlanForecast{" +
                "policies=" + Arrays.toString(policies) +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeArray(this.policies);
        dest.writeParcelable(this.amount, 0);
    }

    private InsuredPlanForecastModel(Parcel in) {
        this.policies = (PolicyModel[]) in.readArray(PolicyModel[].class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<InsuredPlanForecastModel> CREATOR = new Parcelable
            .Creator<InsuredPlanForecastModel>() {
        public InsuredPlanForecastModel createFromParcel(Parcel source) {
            return new InsuredPlanForecastModel(source);
        }

        public InsuredPlanForecastModel[] newArray(int size) {
            return new InsuredPlanForecastModel[size];
        }
    };
}
