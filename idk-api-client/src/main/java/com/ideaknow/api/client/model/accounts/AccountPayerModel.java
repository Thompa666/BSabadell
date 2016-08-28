package com.ideaknow.api.client.model.accounts;

import android.os.Parcel;
import android.os.Parcelable;

public class AccountPayerModel implements Parcelable {

    private String address;
    private String country;
    private String customerName;
    private String customerSurname1;
    private String customerSurname2;
    private String name;
    private String nif;
    private String personNumber;
    private String personType;
    private String postCode;
    private String senderType;
    private String town;

    public AccountPayerModel() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname1() {
        return customerSurname1;
    }

    public void setCustomerSurname1(String customerSurname1) {
        this.customerSurname1 = customerSurname1;
    }

    public String getCustomerSurname2() {
        return customerSurname2;
    }

    public void setCustomerSurname2(String customerSurname2) {
        this.customerSurname2 = customerSurname2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getSenderType() {
        return senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "AccountPayerModel{" +
                "address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerSurname1='" + customerSurname1 + '\'' +
                ", customerSurname2='" + customerSurname2 + '\'' +
                ", name='" + name + '\'' +
                ", nif='" + nif + '\'' +
                ", personNumber='" + personNumber + '\'' +
                ", personType='" + personType + '\'' +
                ", postCode='" + postCode + '\'' +
                ", senderType='" + senderType + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.address);
        dest.writeString(this.country);
        dest.writeString(this.customerName);
        dest.writeString(this.customerSurname1);
        dest.writeString(this.customerSurname2);
        dest.writeString(this.name);
        dest.writeString(this.nif);
        dest.writeString(this.personNumber);
        dest.writeString(this.personType);
        dest.writeString(this.postCode);
        dest.writeString(this.senderType);
        dest.writeString(this.town);
    }

    private AccountPayerModel(Parcel in) {
        this.address = in.readString();
        this.country = in.readString();
        this.customerName = in.readString();
        this.customerSurname1 = in.readString();
        this.customerSurname2 = in.readString();
        this.name = in.readString();
        this.nif = in.readString();
        this.personNumber = in.readString();
        this.personType = in.readString();
        this.postCode = in.readString();
        this.senderType = in.readString();
        this.town = in.readString();
    }

    public static final Parcelable.Creator<AccountPayerModel> CREATOR =
            new Parcelable.Creator<AccountPayerModel>() {

                public AccountPayerModel createFromParcel(Parcel source) {
                    return new AccountPayerModel(source);
                }

                public AccountPayerModel[] newArray(int size) {
                    return new AccountPayerModel[size];
                }
            };
}
