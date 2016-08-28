package com.ideaknow.api.client.forms.session;

import android.os.Parcel;
import android.os.Parcelable;

public class  SessionForm implements Parcelable {

    public static final String REQUEST_ID_ANDROID = "SDK";
    public static final String ANONYMOUS_TYPE_VTPC = "LOGINVTPC";
    public static final String ANONYMOUS_TYPE_BUZON = "BUZON";

    private String userName;
    private String password;
    private int loginType;
    private String requestId;
    private String geolocationData;
    private String brand;
    private String contract;
    private String devicePrint;
    private String deviceInfo;
    private boolean newDevice;
    private String anonymousType;

    public SessionForm() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getGeolocationData() {
        return geolocationData;
    }

    public void setGeolocationData(String geolocationData) {
        this.geolocationData = geolocationData;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getDevicePrint() {
        return devicePrint;
    }

    public void setDevicePrint(String devicePrint) {
        this.devicePrint = devicePrint;
    }

    public boolean isNewDevice() {
        return newDevice;
    }

    public void setNewDevice(boolean newDevice) {
        this.newDevice = newDevice;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getAnonymousType() {
        return anonymousType;
    }

    public void setAnonymousType(String anonymousType) {
        this.anonymousType = anonymousType;
    }

    @Override
    public String toString() {
        return "SessionForm{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", loginType=" + loginType +
                ", requestId='" + requestId + '\'' +
                ", geolocationData='" + geolocationData + '\'' +
                ", brand='" + brand + '\'' +
                ", contract='" + contract + '\'' +
                ", devicePrint='" + devicePrint + '\'' +
                ", deviceInfo='" + deviceInfo + '\'' +
                ", newDevice=" + newDevice +
                ", anonymousType='" + anonymousType + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userName);
        dest.writeString(this.password);
        dest.writeInt(this.loginType);
        dest.writeString(this.requestId);
        dest.writeString(this.geolocationData);
        dest.writeString(this.brand);
        dest.writeString(this.contract);
        dest.writeString(this.devicePrint);
        dest.writeString(this.deviceInfo);
        dest.writeByte(newDevice ? (byte) 1 : (byte) 0);
        dest.writeString(this.anonymousType);
    }

    private SessionForm(Parcel in) {
        this.userName = in.readString();
        this.password = in.readString();
        this.loginType = in.readInt();
        this.requestId = in.readString();
        this.geolocationData = in.readString();
        this.brand = in.readString();
        this.contract = in.readString();
        this.devicePrint = in.readString();
        this.deviceInfo = in.readString();
        this.newDevice = in.readByte() != 0;
        this.anonymousType = in.readString();
    }

    public static final Creator<SessionForm> CREATOR = new Creator<SessionForm>() {
        public SessionForm createFromParcel(Parcel source) {
            return new SessionForm(source);
        }

        public SessionForm[] newArray(int size) {
            return new SessionForm[size];
        }
    };
}
