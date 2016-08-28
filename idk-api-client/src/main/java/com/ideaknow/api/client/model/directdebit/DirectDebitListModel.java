package com.ideaknow.api.client.model.directdebit;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class DirectDebitListModel implements Parcelable {

    private ArrayList<DirectDebitModel> directDebits;
    private PaginatorModel paginator;

    public DirectDebitListModel() {
    }

    public ArrayList<DirectDebitModel> getDirectDebits() {
        return directDebits;
    }

    public void setDirectDebits(ArrayList<DirectDebitModel> directDebits) {
        this.directDebits = directDebits;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "DirectDebitListModel{" +
                "directDebits=" + directDebits +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.directDebits);
        dest.writeParcelable(this.paginator, 0);
    }

    private DirectDebitListModel(Parcel in) {
        if (this.directDebits == null) {
            this.directDebits = new ArrayList<DirectDebitModel>();
        }
        in.readList(this.directDebits, DirectDebitModel.class.getClassLoader());
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Creator<DirectDebitListModel> CREATOR = new Creator<DirectDebitListModel>() {
        public DirectDebitListModel createFromParcel(Parcel source) {
            return new DirectDebitListModel(source);
        }

        public DirectDebitListModel[] newArray(int size) {
            return new DirectDebitListModel[size];
        }
    };
}
