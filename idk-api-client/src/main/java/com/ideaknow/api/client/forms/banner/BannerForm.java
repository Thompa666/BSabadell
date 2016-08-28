package com.ideaknow.api.client.forms.banner;

import android.os.Parcel;
import android.os.Parcelable;

public class BannerForm implements Parcelable {

    public static String PLATFORM_MOBILE = "mobile";
    public static String PLATFORM_TABLET = "tablet";

    private String scaleFactor;
    private String brand;
    private boolean isWeb;
    private String platform;
    private boolean appInstalled;

    // Attributes added. These aren't in API model.
    private String personalization;
    private String signatureType;

    public BannerForm() {
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

    public void setIsWeb(boolean isWeb) {
        this.isWeb = isWeb;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPersonalization() {
        return personalization;
    }

    public void setPersonalization(String personalization) {
        this.personalization = personalization;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public boolean isAppInstalled() {
        return appInstalled;
    }

    public void setAppInstalled(boolean appInstalled) {
        this.appInstalled = appInstalled;
    }

    @Override
    public String toString() {
        return "BannerForm{" +
                "scaleFactor='" + scaleFactor + '\'' +
                ", brand='" + brand + '\'' +
                ", isWeb=" + isWeb +
                ", platform='" + platform + '\'' +
                ", personalization='" + personalization + '\'' +
                ", signatureType='" + signatureType + '\'' +
                ", appInstalled=" + appInstalled +
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
        dest.writeString(this.platform);
        dest.writeString(this.personalization);
        dest.writeString(this.signatureType);
        dest.writeByte(appInstalled ? (byte) 1 : (byte) 0);
    }

    private BannerForm(Parcel in) {
        this.scaleFactor = in.readString();
        this.brand = in.readString();
        this.isWeb = in.readByte() != 0;
        this.platform = in.readString();
        this.personalization = in.readString();
        this.signatureType = in.readString();
        this.appInstalled = in.readByte() != 0;
    }

    public static final Creator<BannerForm> CREATOR = new Creator<BannerForm>() {
        public BannerForm createFromParcel(Parcel source) {
            return new BannerForm(source);
        }

        public BannerForm[] newArray(int size) {
            return new BannerForm[size];
        }
    };
}
