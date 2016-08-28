package com.ideaknow.api.client.model.banner;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.ActionOperation;
import com.ideaknow.api.client.model.ParamsModel;

public class BannerOperationModel implements ActionOperation, Parcelable {

    private String action;
    private String title;
    private String subtitle;
    private String icon;
    private ParamsModel params;
    private String linkUrl;

    public BannerOperationModel() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @Override
    public String toString() {
        return "BannerOperationModel{" +
                "action='" + action + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", icon='" + icon + '\'' +
                ", params=" + params+ '\'' +
                ", linkUrl=" + linkUrl +
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
        dest.writeString(this.linkUrl);
    }

    private BannerOperationModel(Parcel in) {
        this.action = in.readString();
        this.title = in.readString();
        this.subtitle = in.readString();
        this.icon = in.readString();
        this.params = in.readParcelable(ParamsModel.class.getClassLoader());
        this.linkUrl = in.readString();
    }

    public static final Parcelable.Creator<BannerOperationModel> CREATOR =
            new Parcelable.Creator<BannerOperationModel>() {
                public BannerOperationModel createFromParcel(Parcel source) {
                    return new BannerOperationModel(source);
                }

                public BannerOperationModel[] newArray(int size) {
                    return new BannerOperationModel[size];
                }
            };
}
