package com.ideaknow.api.client.forms.menu;

import android.os.Parcel;
import android.os.Parcelable;

public class MenuForm implements Parcelable {

    private String scaleFactor;
    private String brand;
    private boolean isWeb;
    private boolean isPilot;

    public MenuForm() {
        isWeb = false;
    }

    public String getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(String scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isWeb() {
        return isWeb;
    }

    public void setWeb(boolean isWeb) {
        this.isWeb = isWeb;
    }

    public boolean isPilot() {
        return isPilot;
    }

    public void setIsPilot(boolean isPilot) {
        this.isPilot = isPilot;
    }

    @Override
    public String toString() {
        return "MenuForm{" +
                "scaleFactor='" + scaleFactor + '\'' +
                ", brand='" + brand + '\'' +
                ", isWeb=" + isWeb +
                ", isPilot=" + isPilot +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scaleFactor);
        dest.writeString(this.brand);
        dest.writeByte(isWeb ? (byte) 1 : (byte) 0);
        dest.writeByte(isPilot ? (byte) 1 : (byte) 0);
    }

    private MenuForm(Parcel in) {
        this.scaleFactor = in.readString();
        this.brand = in.readString();
        this.isWeb = in.readByte() != 0;
        this.isPilot = in.readByte() != 0;
    }

    public static final Creator<MenuForm> CREATOR = new Creator<MenuForm>() {
        public MenuForm createFromParcel(Parcel source) {
            return new MenuForm(source);
        }

        public MenuForm[] newArray(int size) {
            return new MenuForm[size];
        }
    };
}
