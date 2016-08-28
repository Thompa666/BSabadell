package com.ideaknow.api.client.model.product;

import android.os.Parcel;

public class PensionPlanModel extends AccountProductModel {

    public PensionPlanModel() {
        super();
    }

    PensionPlanModel(Parcel in) {
        super(in);
    }

    public static final Creator<PensionPlanModel> CREATOR = new Creator<PensionPlanModel>() {
        public PensionPlanModel createFromParcel(Parcel source) {
            return new PensionPlanModel(source);
        }

        public PensionPlanModel[] newArray(int size) {
            return new PensionPlanModel[size];
        }
    };
}
