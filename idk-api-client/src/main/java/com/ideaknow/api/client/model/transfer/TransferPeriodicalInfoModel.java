package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;

public class TransferPeriodicalInfoModel implements Parcelable {

    private String mStartDate;
    private String mEndDate;
    private String mPeriodicity;
    private String mPeriodicityCode;
    private String mPeriodicityText;
    private String mEndingText;
    private String mEndingCode;
    private String mRepetitions;

    public TransferPeriodicalInfoModel() {
    }

    public String getStartDate() {
        return mStartDate;
    }

    public void setStartDate(String startDate) {
        mStartDate = startDate;
    }

    public String getEndDate() {
        return mEndDate;
    }

    public void setEndDate(String endDate) {
        mEndDate = endDate;
    }

    public String getPeriodicity() {
        return mPeriodicity;
    }

    public void setPeriodicity(String periodicity) {
        mPeriodicity = periodicity;
    }

    public String getPeriodicityCode() {
        return mPeriodicityCode;
    }

    public void setPeriodicityCode(String periodicityCode) {
        mPeriodicityCode = periodicityCode;
    }

    public String getPeriodicityText() {
        return mPeriodicityText;
    }

    public void setPeriodicityText(String periodicityText) {
        mPeriodicityText = periodicityText;
    }

    public String getEndingText() {
        return mEndingText;
    }

    public void setEndingText(String endingText) {
        mEndingText = endingText;
    }

    public String getEndingCode() {
        return mEndingCode;
    }

    public void setEndingCode(String endingCode) {
        mEndingCode = endingCode;
    }

    public String getRepetitions() {
        return mRepetitions;
    }

    public void setRepetitions(String repetitions) {
        mRepetitions = repetitions;
    }

    @Override
    public String toString() {
        return "TransferPeriodicalInfoModel{" +
                "mStartDate='" + mStartDate + '\'' +
                ", mEndDate='" + mEndDate + '\'' +
                ", mPeriodicity='" + mPeriodicity + '\'' +
                ", mPeriodicityCode='" + mPeriodicityCode + '\'' +
                ", mPeriodicityText='" + mPeriodicityText + '\'' +
                ", mEndingText='" + mEndingText + '\'' +
                ", mEndingCode='" + mEndingCode + '\'' +
                ", mRepetitions='" + mRepetitions + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mStartDate);
        dest.writeString(this.mEndDate);
        dest.writeString(this.mPeriodicity);
        dest.writeString(this.mPeriodicityCode);
        dest.writeString(this.mPeriodicityText);
        dest.writeString(this.mEndingText);
        dest.writeString(this.mEndingCode);
        dest.writeString(this.mRepetitions);
    }

    private TransferPeriodicalInfoModel(Parcel in) {
        this.mStartDate = in.readString();
        this.mEndDate = in.readString();
        this.mPeriodicity = in.readString();
        this.mPeriodicityCode = in.readString();
        this.mPeriodicityText = in.readString();
        this.mEndingText = in.readString();
        this.mEndingCode = in.readString();
        this.mRepetitions = in.readString();
    }

    public static final Creator<TransferPeriodicalInfoModel> CREATOR =
            new Creator<TransferPeriodicalInfoModel>() {
                public TransferPeriodicalInfoModel createFromParcel(Parcel source) {
                    return new TransferPeriodicalInfoModel(source);
                }

                public TransferPeriodicalInfoModel[] newArray(int size) {
                    return new TransferPeriodicalInfoModel[size];
                }
            };
}
