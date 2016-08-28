package com.ideaknow.api.client.model.tpv;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class TpvOperationListModel implements Parcelable {

    private List<TpvOperationModel> operations;
    private PaginatorModel paginator;

    public TpvOperationListModel() {
    }

    public List<TpvOperationModel> getOperations() {
        return operations;
    }

    public void setOperations(List<TpvOperationModel> operations) {
        this.operations = operations;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "TpvOperationListModel{" +
                "operations=" + operations +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(operations);
        dest.writeParcelable(this.paginator, 0);
    }

    private TpvOperationListModel(Parcel in) {
        if (operations == null) {
            operations = new ArrayList<TpvOperationModel>();
        }
        in.readTypedList(operations, TpvOperationModel.CREATOR);
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<TpvOperationListModel> CREATOR =
            new Parcelable.Creator<TpvOperationListModel>() {
        public TpvOperationListModel createFromParcel(Parcel source) {
            return new TpvOperationListModel(source);
        }

        public TpvOperationListModel[] newArray(int size) {
            return new TpvOperationListModel[size];
        }
    };
}
