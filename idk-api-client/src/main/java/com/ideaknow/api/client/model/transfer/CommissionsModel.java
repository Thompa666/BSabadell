package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CommissionModel;

import java.util.*;

public class CommissionsModel implements Parcelable {

    private ArrayList<CommissionModel> commissions;
    private String bicBeneficiario;
    private String indBicOblig;
    private String maxCutDate;
    private String maxCutTime;
    private String nextCutDate;


    public CommissionsModel() {
    }

    public ArrayList<CommissionModel> getCommissions() {
        return commissions;
    }

    public void setCommissions(ArrayList<CommissionModel> commissions) {
        this.commissions = commissions;
    }

    public String getIndBicOblig() {
        return indBicOblig;
    }

    public void setIndBicOblig(String indBicOblig) {
        this.indBicOblig = indBicOblig;
    }

    public String getBicBeneficiario() {
        return bicBeneficiario;
    }

    public void setBicBeneficiario(String bicBeneficiario) {
        this.bicBeneficiario = bicBeneficiario;
    }

    public String getMaxCutDate() {
        return maxCutDate;
    }

    public void setMaxCutDate(String maxCutDate) {
        this.maxCutDate = maxCutDate;
    }

    public String getMaxCutTime() {
        return maxCutTime;
    }

    public void setMaxCutTime(String maxCutTime) {
        this.maxCutTime = maxCutTime;
    }

    public String getNextCutDate() {
        return nextCutDate;
    }

    public void setNextCutDate(String nextCutDate) {
        this.nextCutDate = nextCutDate;
    }


    @Override
    public String toString() {
        return "CommissionsModel{" +
                "commissions=" + commissions +
                ", bicBeneficiario='" + bicBeneficiario + '\'' +
                ", indBicOblig='" + indBicOblig + '\'' +
                ", maxCutDate='" + maxCutDate + '\'' +
                ", maxCutTime='" + maxCutTime + '\'' +
                ", nextCutDate='" + nextCutDate + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.commissions);
        dest.writeString(this.bicBeneficiario);
        dest.writeString(this.indBicOblig);
        dest.writeString(this.maxCutDate);
        dest.writeString(this.maxCutTime);
        dest.writeString(this.nextCutDate);
    }

    private CommissionsModel(Parcel in) {
        if (this.commissions == null) {
            this.commissions = new ArrayList<CommissionModel>();
        }
        in.readList(this.commissions, CommissionModel.class.getClassLoader());
        this.bicBeneficiario = in.readString();
        this.indBicOblig = in.readString();
        this.maxCutDate = in.readString();
        this.maxCutTime = in.readString();
        this.nextCutDate = in.readString();
    }

    public static Parcelable.Creator<CommissionsModel> CREATOR = new Parcelable.Creator<CommissionsModel>() {
        public CommissionsModel createFromParcel(Parcel source) {
            return new CommissionsModel(source);
        }

        public CommissionsModel[] newArray(int size) {
            return new CommissionsModel[size];
        }
    };
}
