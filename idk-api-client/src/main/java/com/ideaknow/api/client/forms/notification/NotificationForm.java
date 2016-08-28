package com.ideaknow.api.client.forms.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;

import java.util.*;

public class NotificationForm implements Parcelable {

    public static final String TRAF = "MV_TRAF";
    public static final String STICKER = "MV_OFI_SOLT";
    public static final String SOLT_CODE = "SOLT";

    public static final String CHANGE_AGENT_PROPERTY = "MV_GACG";
    public static final String CHANGE_AGENT_CODE = "GACG";

    private String email;
    private String subject;
    private String phoneNumber;
    private String notificationProperty;
    private String operationCode;
    private ArrayList<KeyValueModel> keyValues;

    public NotificationForm() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotificationProperty() {
        return notificationProperty;
    }

    public void setNotificationProperty(String notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public ArrayList<KeyValueModel> getKeyValues() {
        return keyValues;
    }

    public void setKeyValues(ArrayList<KeyValueModel> keyValues) {
        this.keyValues = keyValues;
    }

    @Override
    public String toString() {
        return "NotificationForm{" +
                "email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", notificationProperty='" + notificationProperty + '\'' +
                ", operationCode='" + operationCode + '\'' +
                ", keyValues=" + keyValues +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.email);
        dest.writeString(this.subject);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.notificationProperty);
        dest.writeString(this.operationCode);
        dest.writeList(this.keyValues);
    }

    private NotificationForm(Parcel in) {
        this.email = in.readString();
        this.subject = in.readString();
        this.phoneNumber = in.readString();
        this.notificationProperty = in.readString();
        this.operationCode = in.readString();
        if (keyValues == null) {
            keyValues = new ArrayList<KeyValueModel>();
        }
        in.readList(keyValues, KeyValueModel.class.getClassLoader());
    }

    public static final Creator<NotificationForm> CREATOR = new Creator<NotificationForm>() {
        public NotificationForm createFromParcel(Parcel source) {
            return new NotificationForm(source);
        }

        public NotificationForm[] newArray(int size) {
            return new NotificationForm[size];
        }
    };
}
