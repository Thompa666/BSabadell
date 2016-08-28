package com.ideaknow.api.client.model.blacklist;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class BlackListModel implements Parcelable {

    private List<BlackListOperationModel> operations;

    public BlackListModel() {
        operations = new ArrayList<BlackListOperationModel>();
    }

    public List<BlackListOperationModel> getOperations() {
        return operations;
    }

    public void setOperations(List<BlackListOperationModel> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "BlackListModel{" +
                "operations=" + operations +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(operations);
    }

    private BlackListModel(Parcel in) {
        if (operations == null) {
            operations = new ArrayList<BlackListOperationModel>();
        }
        in.readList(operations, BlackListOperationModel.class.getClassLoader());
    }

    public static final Creator<BlackListModel> CREATOR = new Creator<BlackListModel>() {
        public BlackListModel createFromParcel(Parcel source) {
            return new BlackListModel(source);
        }

        public BlackListModel[] newArray(int size) {
            return new BlackListModel[size];
        }
    };
}

