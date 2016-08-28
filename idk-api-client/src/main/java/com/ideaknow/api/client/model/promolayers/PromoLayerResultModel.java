package com.ideaknow.api.client.model.promolayers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.PromoLayerModel;

public class PromoLayerResultModel implements Parcelable {

    private PromoLayerModel promoLayer;

    public PromoLayerResultModel() {
    }

    public PromoLayerModel getPromoLayer() {
        return promoLayer;
    }

    public void setPromoLayer(PromoLayerModel promoLayer) {
        this.promoLayer = promoLayer;
    }

    @Override
    public String toString() {
        return "PromoLayerResultModel{" +
                "promoLayer=" + promoLayer +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.promoLayer, 0);
    }

    private PromoLayerResultModel(Parcel in) {
        this.promoLayer = in.readParcelable(PromoLayerModel.class.getClassLoader());
    }

    public static final Creator<PromoLayerResultModel> CREATOR =
            new Creator<PromoLayerResultModel>() {
                public PromoLayerResultModel createFromParcel(Parcel source) {
                    return new PromoLayerResultModel(source);
                }

                public PromoLayerResultModel[] newArray(int size) {
                    return new PromoLayerResultModel[size];
                }
            };
}
