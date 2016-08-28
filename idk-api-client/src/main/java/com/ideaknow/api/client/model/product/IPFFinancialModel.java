package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.PolicyModel;

import java.util.*;

public class IPFFinancialModel extends BaseProductModel implements Parcelable {

    private ArrayList<PolicyModel> policies;

    public IPFFinancialModel() {
        policies = new ArrayList<PolicyModel>();
    }

    public ArrayList<PolicyModel> getPolicies() {
        return policies;
    }

    public void setPolicies(ArrayList<PolicyModel> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        return "IPFFinancialModel{" +
                "policies=" + policies +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.policies);
    }

    private IPFFinancialModel(Parcel in) {
        if (policies == null) {
            policies = new ArrayList<PolicyModel>();
        }
        in.readList(policies, PolicyModel.class.getClassLoader());
    }

    public static final Creator<IPFFinancialModel> CREATOR = new Creator<IPFFinancialModel>() {
        public IPFFinancialModel createFromParcel(Parcel source) {
            return new IPFFinancialModel(source);
        }

        public IPFFinancialModel[] newArray(int size) {
            return new IPFFinancialModel[size];
        }
    };
}
