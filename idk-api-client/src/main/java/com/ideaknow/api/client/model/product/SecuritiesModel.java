package com.ideaknow.api.client.model.product;

import android.os.Parcel;

public class SecuritiesModel extends AccountProductModel {

    public SecuritiesModel() {
        super();
    }

    SecuritiesModel(Parcel in) {
        super(in);
    }

    public static final Creator<SecuritiesModel> CREATOR = new Creator<SecuritiesModel>() {
        public SecuritiesModel createFromParcel(Parcel source) {
            return new SecuritiesModel(source);
        }

        public SecuritiesModel[] newArray(int size) {
            return new SecuritiesModel[size];
        }
    };
}
