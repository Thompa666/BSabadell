package com.ideaknow.api.client.model.tpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.TelephoneModel;

public class TelephoneResponseModel implements Parcelable {

    private TelephoneModel telephone;

    public TelephoneResponseModel() {
    }

    public TelephoneModel getTelephone() {
        return telephone;
    }

    public void setTelephone(TelephoneModel telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "TelephoneResponseModel{" +
                "telephone=" + telephone +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.telephone, 0);
    }

    private TelephoneResponseModel(Parcel in) {
        this.telephone = in.readParcelable(TelephoneModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<TelephoneResponseModel> CREATOR =
            new Parcelable.Creator<TelephoneResponseModel>() {
                public TelephoneResponseModel createFromParcel(Parcel source) {
                    return new TelephoneResponseModel(source);
                }

                public TelephoneResponseModel[] newArray(int size) {
                    return new TelephoneResponseModel[size];
                }
            };
}
