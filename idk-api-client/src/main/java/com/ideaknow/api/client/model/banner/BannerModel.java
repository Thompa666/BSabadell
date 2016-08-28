package com.ideaknow.api.client.model.banner;

import android.os.Parcel;
import android.os.Parcelable;

public class BannerModel implements Parcelable {

    private BannerOperationModel operation;

    public BannerModel() {
    }

    public BannerOperationModel getOperation() {
        return operation;
    }

    public void setOperation(BannerOperationModel operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "BannerModel{" +
                "operation=" + operation +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.operation, 0);
    }

    private BannerModel(Parcel in) {
        this.operation = in.readParcelable(BannerOperationModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<BannerModel> CREATOR =
            new Parcelable.Creator<BannerModel>() {
                public BannerModel createFromParcel(Parcel source) {
                    return new BannerModel(source);
                }

                public BannerModel[] newArray(int size) {
                    return new BannerModel[size];
                }
            };
}
