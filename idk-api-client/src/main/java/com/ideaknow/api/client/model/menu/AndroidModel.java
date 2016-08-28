package com.ideaknow.api.client.model.menu;

import android.os.Parcel;
import android.os.Parcelable;

public class AndroidModel implements Parcelable {

    private String appPackage;
    private String appLaunchActivity;

    public AndroidModel() {
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public String getAppLaunchActivity() {
        return appLaunchActivity;
    }

    public void setAppLaunchActivity(String appLaunchActivity) {
        this.appLaunchActivity = appLaunchActivity;
    }

    @Override
    public String toString() {
        return "AndroidAppModel{" +
                "appPackage='" + appPackage + '\'' +
                ", appLaunchActivity='" + appLaunchActivity + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.appPackage);
        dest.writeString(this.appLaunchActivity);
    }

    private AndroidModel(Parcel in) {
        this.appPackage = in.readString();
        this.appLaunchActivity = in.readString();
    }

    public static final Parcelable.Creator<AndroidModel> CREATOR =
            new Parcelable.Creator<AndroidModel>() {
                public AndroidModel createFromParcel(Parcel source) {
                    return new AndroidModel(source);
                }

                public AndroidModel[] newArray(int size) {
                    return new AndroidModel[size];
                }
            };
}
