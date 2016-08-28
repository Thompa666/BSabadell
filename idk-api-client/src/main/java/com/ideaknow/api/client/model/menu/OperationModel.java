package com.ideaknow.api.client.model.menu;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.ParamsModel;

public class OperationModel implements Parcelable {

    private String action;
    private String title;
    private String icon;
    private ParamsModel params;

    public OperationModel() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ParamsModel getParams() {
        return params;
    }

    public void setParams(ParamsModel params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "OperationModel{" +
                "action='" + action + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", params=" + params +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.action);
        dest.writeString(this.title);
        dest.writeString(this.icon);
        dest.writeParcelable(this.params, 0);
    }

    private OperationModel(Parcel in) {
        this.action = in.readString();
        this.title = in.readString();
        this.icon = in.readString();
        this.params = in.readParcelable(ParamsModel.class.getClassLoader());
    }

    public static final Creator<OperationModel> CREATOR = new Creator<OperationModel>() {
        public OperationModel createFromParcel(Parcel source) {
            return new OperationModel(source);
        }

        public OperationModel[] newArray(int size) {
            return new OperationModel[size];
        }
    };
}
