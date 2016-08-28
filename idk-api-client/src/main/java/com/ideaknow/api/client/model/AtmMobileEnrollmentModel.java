package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AtmMobileEnrollmentModel implements Parcelable {

    public static final String VERIFIED_DEVICE = "V";

    private String status;
    private String alias;
    private String entityCode;
    private String registerDate;
    private String deleteDate;
    private String id;
    private String serviceName;
    private KeyValueModel type;
    private String inscriptionKey;

    public AtmMobileEnrollmentModel() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public KeyValueModel getType() {
        return type;
    }

    public void setType(KeyValueModel type) {
        this.type = type;
    }

    public String getInscriptionKey() {
        return inscriptionKey;
    }

    public void setInscriptionKey(String inscriptionKey) {
        this.inscriptionKey = inscriptionKey;
    }

    @Override
    public String toString() {
        return "AtmMobileEnrollmentModel{" +
                "status='" + status + '\'' +
                ", alias='" + alias + '\'' +
                ", entityCode='" + entityCode + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", deleteDate='" + deleteDate + '\'' +
                ", id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", type=" + type +
                ", inscriptionKey='" + inscriptionKey + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.status);
        dest.writeString(this.alias);
        dest.writeString(this.entityCode);
        dest.writeString(this.registerDate);
        dest.writeString(this.deleteDate);
        dest.writeString(this.id);
        dest.writeString(this.serviceName);
        dest.writeParcelable(this.type, 0);
        dest.writeString(this.inscriptionKey);
    }

    private AtmMobileEnrollmentModel(Parcel in) {
        this.status = in.readString();
        this.alias = in.readString();
        this.entityCode = in.readString();
        this.registerDate = in.readString();
        this.deleteDate = in.readString();
        this.id = in.readString();
        this.serviceName = in.readString();
        this.type = in.readParcelable(KeyValueModel.class.getClassLoader());
        this.inscriptionKey = in.readString();
    }

    public static final Creator<AtmMobileEnrollmentModel> CREATOR =
            new Creator<AtmMobileEnrollmentModel>() {
        public AtmMobileEnrollmentModel createFromParcel(Parcel source) {
            return new AtmMobileEnrollmentModel(source);
        }

        public AtmMobileEnrollmentModel[] newArray(int size) {
            return new AtmMobileEnrollmentModel[size];
        }
    };
}
