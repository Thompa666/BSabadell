package com.ideaknow.api.client.model.product;

import android.os.Parcel;

public class InvestmentFundModel extends AccountProductModel {

    public InvestmentFundModel() {
        super();
    }

    InvestmentFundModel(Parcel in) {
        super(in);
    }

    public static final Creator<InvestmentFundModel> CREATOR = new Creator<InvestmentFundModel>() {
        public InvestmentFundModel createFromParcel(Parcel source) {
            return new InvestmentFundModel(source);
        }

        public InvestmentFundModel[] newArray(int size) {
            return new InvestmentFundModel[size];
        }
    };
}
