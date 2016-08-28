package com.ideaknow.api.client.model.menu;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.ActionOperation;
import com.ideaknow.api.client.model.ParamsModel;

public class MenuOperationModel implements ActionOperation, Parcelable {

    private String action;
    private String title;
    private String subtitle;
    private String icon;
    private ParamsModel params;

    public MenuOperationModel() {
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subTitle) {
        this.subtitle = subTitle;
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
        return "MenuOperationModel{" +
                "action='" + action + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subtitle + '\'' +
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
        dest.writeString(this.subtitle);
        dest.writeString(this.icon);
        dest.writeParcelable(this.params, 0);
    }

    private MenuOperationModel(Parcel in) {
        this.action = in.readString();
        this.title = in.readString();
        this.subtitle = in.readString();
        this.icon = in.readString();
        this.params = in.readParcelable(ParamsModel.class.getClassLoader());
    }

    public static final Creator<MenuOperationModel> CREATOR = new Creator<MenuOperationModel>() {
        public MenuOperationModel createFromParcel(Parcel source) {
            return new MenuOperationModel(source);
        }

        public MenuOperationModel[] newArray(int size) {
            return new MenuOperationModel[size];
        }
    };
}
