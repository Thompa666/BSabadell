package com.ideaknow.api.client.model.status;

import android.os.Parcel;
import android.os.Parcelable;

public class VersionModel implements Parcelable {

    private String os;
    private String osVersion;
    private String minimal;
    private String recommended;
    private String url;

    public VersionModel() {
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getMinimal() {
        return minimal;
    }

    public void setMinimal(String minimal) {
        this.minimal = minimal;
    }

    public String getRecommended() {
        return recommended;
    }

    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "VersionModel{" +
                "os='" + os + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", minimal='" + minimal + '\'' +
                ", recommended='" + recommended + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.os);
        dest.writeString(this.osVersion);
        dest.writeString(this.minimal);
        dest.writeString(this.recommended);
        dest.writeString(this.url);
    }

    private VersionModel(Parcel in) {
        this.os = in.readString();
        this.osVersion = in.readString();
        this.minimal = in.readString();
        this.recommended = in.readString();
        this.url = in.readString();
    }

    public static final Parcelable.Creator<VersionModel> CREATOR =
            new Parcelable.Creator<VersionModel>() {
        public VersionModel createFromParcel(Parcel source) {
            return new VersionModel(source);
        }

        public VersionModel[] newArray(int size) {
            return new VersionModel[size];
        }
    };
}
