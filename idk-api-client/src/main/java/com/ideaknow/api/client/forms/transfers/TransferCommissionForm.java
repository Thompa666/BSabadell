package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CommissionModel;
import com.ideaknow.api.client.model.transfer.TransferModel;

import java.util.*;

public class TransferCommissionForm implements Parcelable {

    private TransferModel transfer;
    private ArrayList<CommissionModel> commissions;
    private String format;

    public TransferCommissionForm() {
    }

    public TransferModel getTransfer() {
        return transfer;
    }

    public void setTransfer(TransferModel transfer) {
        this.transfer = transfer;
    }

    public ArrayList<CommissionModel> getCommissions() {
        return commissions;
    }

    public void setCommissions(ArrayList<CommissionModel> commissions) {
        this.commissions = commissions;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "TransferCommissionForm{" +
                "transfer=" + transfer +
                ", commissions=" + commissions +
                ", format='" + format + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.transfer, 0);
        dest.writeList(this.commissions);
        dest.writeString(this.format);
    }

    private TransferCommissionForm(Parcel in) {
        this.transfer = in.readParcelable(TransferModel.class.getClassLoader());
        if (this.commissions == null) {
            this.commissions = new ArrayList<CommissionModel>();
        }
        in.readList(this.commissions, CommissionModel.class.getClassLoader());
        this.format = in.readString();
    }

    public static Parcelable.Creator<TransferCommissionForm> CREATOR = new Parcelable
            .Creator<TransferCommissionForm>() {
        public TransferCommissionForm createFromParcel(Parcel source) {
            return new TransferCommissionForm(source);
        }

        public TransferCommissionForm[] newArray(int size) {
            return new TransferCommissionForm[size];
        }
    };
}
