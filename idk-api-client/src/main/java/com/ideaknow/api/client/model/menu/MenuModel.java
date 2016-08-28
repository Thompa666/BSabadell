package com.ideaknow.api.client.model.menu;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class MenuModel implements Parcelable {

    private List<MenuOperationModel> operations;

    public MenuModel() {
    }

    public List<MenuOperationModel> getOperations() {
        return operations;
    }

    public void setOperations(List<MenuOperationModel> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "MenuModel{" +
                "operations=" + operations +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(operations);
    }

    private MenuModel(Parcel in) {
        if (operations == null) {
            operations = new ArrayList<MenuOperationModel>();
        }
        in.readTypedList(operations, MenuOperationModel.CREATOR);
    }

    public static final Creator<MenuModel> CREATOR = new Creator<MenuModel>() {
        public MenuModel createFromParcel(Parcel source) {
            return new MenuModel(source);
        }

        public MenuModel[] newArray(int size) {
            return new MenuModel[size];
        }
    };
}
