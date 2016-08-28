package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;

public class PeriodModel implements Parcelable {

    private String code;
    private AmountModel amount;
    private String interest;
    private String months;
    private String tae;

    public PeriodModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getTae() {
        return tae;
    }

    public void setTae(String tae) {
        this.tae = tae;
    }

    @Override
    public String toString() {
        return "PeriodModel{" +
                "code='" + code + '\'' +
                ", amount=" + amount +
                ", interest='" + interest + '\'' +
                ", months='" + months + '\'' +
                ", tae='" + tae + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeParcelable(this.amount, 0);
        dest.writeString(this.interest);
        dest.writeString(this.months);
        dest.writeString(this.tae);
    }

    private PeriodModel(Parcel in) {
        this.code = in.readString();
        this.amount = in.readParcelable(PeriodModel.class.getClassLoader());
        this.interest = in.readString();
        this.months = in.readString();
        this.tae = in.readString();
    }

    public static Creator<PeriodModel> CREATOR = new Creator<PeriodModel>() {
        public PeriodModel createFromParcel(Parcel source) {
            return new PeriodModel(source);
        }

        public PeriodModel[] newArray(int size) {
            return new PeriodModel[size];
        }
    };
}
