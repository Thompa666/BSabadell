package com.ideaknow.api.client.model.alerts;

import android.os.Parcel;
import android.os.Parcelable;

public class AlertContractModel implements Parcelable {

    private String authorized;
    private String contractNumber;
    private String email;
    private String environment;
    private String initialDate;
    private String lastPrintDate;
    private String nif;
    private String owner;
    private String personNumber;
    private String phone;
    /**
     * Comes void if this contract wasn't registered for push yet
     */
    private String push;
    private String type;

    public AlertContractModel() {
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public String getLastPrintDate() {
        return lastPrintDate;
    }

    public void setLastPrintDate(String lastPrintDate) {
        this.lastPrintDate = lastPrintDate;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPush() {
        return push;
    }

    public void setPush(String push) {
        this.push = push;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AlertContractModel{" +
                "authorized='" + authorized + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", email='" + email + '\'' +
                ", environment='" + environment + '\'' +
                ", initialDate='" + initialDate + '\'' +
                ", lastPrintDate='" + lastPrintDate + '\'' +
                ", nif='" + nif + '\'' +
                ", owner='" + owner + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", push='" + push + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.authorized);
        dest.writeString(this.contractNumber);
        dest.writeString(this.email);
        dest.writeString(this.environment);
        dest.writeString(this.initialDate);
        dest.writeString(this.lastPrintDate);
        dest.writeString(this.nif);
        dest.writeString(this.owner);
        dest.writeString(this.personNumber);
        dest.writeString(this.phone);
        dest.writeString(this.push);
        dest.writeString(this.type);
    }

    private AlertContractModel(Parcel in) {
        this.authorized = in.readString();
        this.contractNumber = in.readString();
        this.email = in.readString();
        this.environment = in.readString();
        this.initialDate = in.readString();
        this.lastPrintDate = in.readString();
        this.nif = in.readString();
        this.owner = in.readString();
        this.personNumber = in.readString();
        this.phone = in.readString();
        this.push = in.readString();
        this.type = in.readString();
    }

    public static final Parcelable.Creator<AlertContractModel> CREATOR = new Parcelable
            .Creator<AlertContractModel>() {
        public AlertContractModel createFromParcel(Parcel source) {
            return new AlertContractModel(source);
        }

        public AlertContractModel[] newArray(int size) {
            return new AlertContractModel[size];
        }
    };
}
