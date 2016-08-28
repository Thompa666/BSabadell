package com.ideaknow.api.client.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

public class BeneficiaryModel implements Parcelable {

    private String name;
    private String beneficiaryId;
    private String beneficiaryKey;
    private String mail;
    private String phoneNumber;
    private String city;
    private String address;
    private AccountModel account;
    private CountryModel country;
    private CountryModel accountCountry;
    private String bankName;

    public BeneficiaryModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getBeneficiaryKey() {
        return beneficiaryKey;
    }

    public void setBeneficiaryKey(String beneficiaryKey) {
        this.beneficiaryKey = beneficiaryKey;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public CountryModel getCountry() {
        return country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }

    public CountryModel getAccountCountry() {
        return accountCountry;
    }

    public void setAccountCountry(CountryModel accountCountry) {
        this.accountCountry = accountCountry;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "BeneficiaryModel{" +
                "name='" + name + '\'' +
                ", beneficiaryId='" + beneficiaryId + '\'' +
                ", beneficiaryKey='" + beneficiaryKey + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", account=" + account +
                ", country=" + country +
                ", accountCountry=" + accountCountry +
                ", bankName='" + bankName + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.beneficiaryId);
        dest.writeString(this.beneficiaryKey);
        dest.writeString(this.mail);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.city);
        dest.writeString(this.address);
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.country, 0);
        dest.writeParcelable(this.accountCountry, 0);
        dest.writeString(this.bankName);
    }

    private BeneficiaryModel(Parcel in) {
        this.name = in.readString();
        this.beneficiaryId = in.readString();
        this.beneficiaryKey = in.readString();
        this.mail = in.readString();
        this.phoneNumber = in.readString();
        this.city = in.readString();
        this.address = in.readString();
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.country = in.readParcelable(CountryModel.class.getClassLoader());
        this.accountCountry = in.readParcelable(CountryModel.class.getClassLoader());
        this.bankName = in.readString();
    }

    public static final Parcelable.Creator<BeneficiaryModel> CREATOR =
            new Parcelable.Creator<BeneficiaryModel>() {
                public BeneficiaryModel createFromParcel(Parcel source) {
                    return new BeneficiaryModel(source);
                }

                public BeneficiaryModel[] newArray(int size) {
                    return new BeneficiaryModel[size];
                }
            };
}
