package com.ideaknow.api.client.forms.tpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.TelephoneModel;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.push.PushDeviceModel;
import com.ideaknow.api.client.model.session.UserModel;

public class TpcEnrollmentCreateForm implements Parcelable {

    public static final String ENROLLMENT_ACTIVATE = "A";
    public static final String ENROLLMENT_REACTIVATE = "R";

    private UserModel user;
    private String inscriptionKey;
    private TelephoneModel telephone;
    private String email;
    private PushDeviceModel device;
    private KeyModel key;
    private String option;
    private boolean checkEmail;

    public TpcEnrollmentCreateForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getInscriptionKey() {
        return inscriptionKey;
    }

    public void setInscriptionKey(String inscriptionKey) {
        this.inscriptionKey = inscriptionKey;
    }

    public TelephoneModel getTelephone() {
        return telephone;
    }

    public void setTelephone(TelephoneModel telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PushDeviceModel getDevice() {
        return device;
    }

    public void setDevice(PushDeviceModel device) {
        this.device = device;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isCheckEmail() {
        return checkEmail;
    }

    public void setCheckEmail(boolean checkEmail) {
        this.checkEmail = checkEmail;
    }

    @Override
    public String toString() {
        return "TpcEnrollmentCreateForm{" +
                "user=" + user +
                ", inscriptionKey='" + inscriptionKey + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", device=" + device +
                ", key=" + key +
                ", option='" + option + '\'' +
                ", checkEmail=" + checkEmail +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
        dest.writeString(this.inscriptionKey);
        dest.writeParcelable(this.telephone, 0);
        dest.writeString(this.email);
        dest.writeParcelable(this.device, 0);
        dest.writeParcelable(this.key, 0);
        dest.writeString(this.option);
        dest.writeByte(checkEmail ? (byte) 1 : (byte) 0);
    }

    private TpcEnrollmentCreateForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.inscriptionKey = in.readString();
        this.telephone = in.readParcelable(TelephoneModel.class.getClassLoader());
        this.email = in.readString();
        this.device = in.readParcelable(PushDeviceModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
        this.option = in.readString();
        this.checkEmail = in.readByte() != 0;
    }

    public static final Creator<TpcEnrollmentCreateForm> CREATOR = new Creator<TpcEnrollmentCreateForm>() {
        public TpcEnrollmentCreateForm createFromParcel(Parcel source) {
            return new TpcEnrollmentCreateForm(source);
        }

        public TpcEnrollmentCreateForm[] newArray(int size) {
            return new TpcEnrollmentCreateForm[size];
        }
    };
}
