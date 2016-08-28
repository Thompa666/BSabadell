package com.ideaknow.api.client.forms.checks;

import android.os.Parcel;
import android.os.Parcelable;

public class CheckInstantForm implements Parcelable {

    private String frontImg;
    private String backImg;

    public CheckInstantForm() {

    }

    public String getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(String frontImg) {
        this.frontImg = frontImg;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    @Override
    public String toString() {
        return "CheckInstantForm{" +
                "frontImg='" + frontImg + '\'' +
                ", backImg='" + backImg + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.frontImg);
        dest.writeString(this.backImg);
    }

    private CheckInstantForm(Parcel in) {
        this.frontImg = in.readString();
        this.backImg = in.readString();
    }

    public static Parcelable.Creator<CheckInstantForm> CREATOR = new Parcelable.Creator<CheckInstantForm>() {
        public CheckInstantForm createFromParcel(Parcel source) {
            return new CheckInstantForm(source);
        }

        public CheckInstantForm[] newArray(int size) {
            return new CheckInstantForm[size];
        }
    };
}
