package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class TransfersListModel implements Parcelable {

    private ArrayList<TransferModel> transfers;
    private PaginatorModel paginator;

    public TransfersListModel() {
    }

    public ArrayList<TransferModel> getTransfers() {
        return transfers;
    }

    public void setTransfers(ArrayList<TransferModel> transfers) {
        this.transfers = transfers;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "TransfersListModel{" +
                "transfers=" + transfers +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.transfers);
        dest.writeParcelable(this.paginator, 0);
    }

    private TransfersListModel(Parcel in) {
        if (this.transfers == null) {
            this.transfers = new ArrayList<TransferModel>();
        }
        in.readList(this.transfers, TransferModel.class.getClassLoader());
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static Parcelable.Creator<TransfersListModel> CREATOR = new Parcelable.Creator<TransfersListModel>() {
        public TransfersListModel createFromParcel(Parcel source) {
            return new TransfersListModel(source);
        }

        public TransfersListModel[] newArray(int size) {
            return new TransfersListModel[size];
        }
    };
}
