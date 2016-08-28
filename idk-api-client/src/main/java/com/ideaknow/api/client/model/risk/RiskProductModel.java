package com.ideaknow.api.client.model.risk;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;

public class RiskProductModel implements Parcelable {

    private String code;
    private String description;
    private AmountModel amount;

    public RiskProductModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RiskProductModel{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.description);
        dest.writeParcelable(this.amount, 0);
    }

    private RiskProductModel(Parcel in) {
        this.code = in.readString();
        this.description = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<RiskProductModel> CREATOR = new Creator<RiskProductModel>() {
        public RiskProductModel createFromParcel(Parcel source) {
            return new RiskProductModel(source);
        }

        public RiskProductModel[] newArray(int size) {
            return new RiskProductModel[size];
        }
    };
}
