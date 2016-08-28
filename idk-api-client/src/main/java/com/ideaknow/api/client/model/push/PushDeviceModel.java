package com.ideaknow.api.client.model.push;

import android.os.Parcel;
import android.os.Parcelable;

public class PushDeviceModel implements Parcelable {

    private String appVersion;
    private String application;
    private String channelProvider;
    private String devModel;
    private String devVendor;
    /**
     * We send it blank, API will assign a timestamp
     */
    private String idDevice;
    /**
     * Corresponds to *personNum* which is obtained at login
     */
    private String idUser;
    private String osVendor;
    private String osVersion;
    /**
     * It's the registrationId returned by Google once registered for Push
     */
    private String token;
    private String tsCreate;
    private String uuidDevice;

    public PushDeviceModel() {
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getChannelProvider() {
        return channelProvider;
    }

    public void setChannelProvider(String channelProvider) {
        this.channelProvider = channelProvider;
    }

    public String getDevModel() {
        return devModel;
    }

    public void setDevModel(String devModel) {
        this.devModel = devModel;
    }

    public String getDevVendor() {
        return devVendor;
    }

    public void setDevVendor(String devVendor) {
        this.devVendor = devVendor;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getOsVendor() {
        return osVendor;
    }

    public void setOsVendor(String osVendor) {
        this.osVendor = osVendor;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTsCreate() {
        return tsCreate;
    }

    public void setTsCreate(String tsCreate) {
        this.tsCreate = tsCreate;
    }

    public String getUuidDevice() {
        return uuidDevice;
    }

    public void setUuidDevice(String uuidDevice) {
        this.uuidDevice = uuidDevice;
    }

    public static Creator<PushDeviceModel> getCREATOR() {
        return CREATOR;
    }

    public static void setCREATOR(Creator<PushDeviceModel> CREATOR) {
        PushDeviceModel.CREATOR = CREATOR;
    }

    @Override
    public String toString() {
        return "PushDeviceModel{" +
                "appVersion='" + appVersion + '\'' +
                ", application='" + application + '\'' +
                ", channelProvider='" + channelProvider + '\'' +
                ", devModel='" + devModel + '\'' +
                ", devVendor='" + devVendor + '\'' +
                ", idDevice='" + idDevice + '\'' +
                ", idUser='" + idUser + '\'' +
                ", osVendor='" + osVendor + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", token='" + token + '\'' +
                ", tsCreate='" + tsCreate + '\'' +
                ", uuidDevice='" + uuidDevice + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.appVersion);
        dest.writeString(this.application);
        dest.writeString(this.channelProvider);
        dest.writeString(this.devModel);
        dest.writeString(this.devVendor);
        dest.writeString(this.idDevice);
        dest.writeString(this.idUser);
        dest.writeString(this.osVendor);
        dest.writeString(this.osVersion);
        dest.writeString(this.token);
        dest.writeString(this.tsCreate);
        dest.writeString(this.uuidDevice);
    }

    private PushDeviceModel(Parcel in) {
        this.appVersion = in.readString();
        this.application = in.readString();
        this.channelProvider = in.readString();
        this.devModel = in.readString();
        this.devVendor = in.readString();
        this.idDevice = in.readString();
        this.idUser = in.readString();
        this.osVendor = in.readString();
        this.osVersion = in.readString();
        this.token = in.readString();
        this.tsCreate = in.readString();
        this.uuidDevice = in.readString();
    }

    public static Parcelable.Creator<PushDeviceModel> CREATOR = new Parcelable.Creator<PushDeviceModel>() {
        public PushDeviceModel createFromParcel(Parcel source) {
            return new PushDeviceModel(source);
        }

        public PushDeviceModel[] newArray(int size) {
            return new PushDeviceModel[size];
        }
    };
}
