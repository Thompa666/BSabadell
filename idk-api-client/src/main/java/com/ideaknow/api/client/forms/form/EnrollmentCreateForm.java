package com.ideaknow.api.client.forms.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AtmMobileEnrollmentModel;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.session.UserModel;

public class EnrollmentCreateForm implements Parcelable {

    public final static String ENROLLMENT_ACTIVATE = "A";
    public final static String ENROLLMENT_REACTIVATE = "R";
    public final static String ATM_ENTITY_CODE = "01";
    public final static String ATM_WEB = "IM - Reintegro Movil";

    private AtmMobileEnrollmentModel enrollment;
    private String registerType;
    private UserModel user;
    private String brand;
    private String web;
    private String phone;
    private KeyModel key;

    public EnrollmentCreateForm() {
    }

    public AtmMobileEnrollmentModel getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(AtmMobileEnrollmentModel enrollment) {
        this.enrollment = enrollment;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "AtmMobileEnrollmentCreateForm{" +
                "enrollment=" + enrollment +
                ", registerType='" + registerType + '\'' +
                ", user=" + user +
                ", brand='" + brand + '\'' +
                ", web='" + web + '\'' +
                ", phone='" + phone + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.enrollment, 0);
        dest.writeString(this.registerType);
        dest.writeParcelable(this.user, 0);
        dest.writeString(this.brand);
        dest.writeString(this.web);
        dest.writeString(this.phone);
        dest.writeParcelable(this.key, 0);
    }

    private EnrollmentCreateForm(Parcel in) {
        this.enrollment = in.readParcelable(AtmMobileEnrollmentModel.class.getClassLoader());
        this.registerType = in.readString();
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.brand = in.readString();
        this.web = in.readString();
        this.phone = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<EnrollmentCreateForm> CREATOR = new
            Creator<EnrollmentCreateForm>() {
                public EnrollmentCreateForm createFromParcel(Parcel source) {
                    return new EnrollmentCreateForm(source);
                }

                public EnrollmentCreateForm[] newArray(int size) {
                    return new EnrollmentCreateForm[size];
                }
            };
}
