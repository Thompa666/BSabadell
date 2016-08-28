package com.ideaknow.api.client.forms.nosessionnotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;

import java.util.*;

public class NoSessionNotificationsForm implements Parcelable {

    public static final String NOTIFICATION_PROPERTY_CALL_ME_BACK = "CALLB";
    public static final String NOTIFICATION_PROPERTY_CLIENT_REGISTRATION = "MV_ACNR";
    public static final String NOTIFICATION_PROPERTY_ONLINE_REGISTRATION = "MV_ABNR";
    public static final String OPERATION_CODE_CALL_ME_BACK = "CALLB";
    public static final String OPERATION_CODE_CLIENT_REGISTRATION = "ACNR";
    public static final String OPERATION_CODE_HELP = "MV_AYUDA";
    public static final String OPERATION_CODE_ONLINE_REGISTRATION = "ABNR";

    public static final String KEY_CONDITIONS = "condiciones";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_ID = "identificacion";
    public static final String KEY_LANGUAGE = "idioma";
    public static final String KEY_LOPD = "lopd";
    public static final String KEY_MOBILE = "movil";
    public static final String KEY_NOMBRE_APELLIDOS = "nombre_apellidos";
    public static final String KEY_NIF = "nif";
    public static final String KEY_PORTAL = "portal";
    public static final String KEY_TELEFONO = "telefono";

    public static final String VALUE_YES = "SI";

    public static final String MV_HELP_REGISTER = "MV_AYUDA_REGISTER";
    public static final String MV_HELP_PIN = "MV_AYUDA_PIN";
    public static final String MV_HELP_PINCARD = "MV_AYUDA_PINCARD";
    public static final String MV_HELP_OPERATION = "MV_AYUDA_OPERATION";

    // change agent
    public static final String NIF = "nif";
    public static final String COMMENTS = "comentarios";

    private String email;
    private String subject;
    private String phoneNumber;
    private String brand;
    private String notificationProperty;
    private String operationCode;
    private ArrayList<KeyValueModel> keyValues;

    public NoSessionNotificationsForm() {
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        return "NoSessionNotificationsForm{" +
                "email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
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
        dest.writeString(this.brand);
        dest.writeString(this.notificationProperty);
        dest.writeString(this.operationCode);
        dest.writeList(this.keyValues);
    }

    private NoSessionNotificationsForm(Parcel in) {
        this.email = in.readString();
        this.subject = in.readString();
        this.phoneNumber = in.readString();
        this.brand = in.readString();
        this.notificationProperty = in.readString();
        this.operationCode = in.readString();
        if (keyValues == null) {
            keyValues = new ArrayList<KeyValueModel>();
        }
        in.readList(keyValues, KeyValueModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<NoSessionNotificationsForm> CREATOR =
            new Parcelable.Creator<NoSessionNotificationsForm>() {
                public NoSessionNotificationsForm createFromParcel(Parcel source) {
                    return new NoSessionNotificationsForm(source);
                }

                public NoSessionNotificationsForm[] newArray(int size) {
                    return new NoSessionNotificationsForm[size];
                }
            };
}
