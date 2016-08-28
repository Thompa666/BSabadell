package com.ideaknow.api.client.forms.tpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.TelephoneModel;

public class UpdateProcessPage2Form implements Parcelable {

    private TelephoneModel telephone;
    private String email;
    private boolean checkLOPD;

    public UpdateProcessPage2Form() {
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

    @Override
    public String toString() {
        return "UpdateProcessPage2Form{" +
                "telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.telephone, 0);
        dest.writeString(this.email);
        dest.writeByte(checkLOPD ? (byte) 1 : (byte) 0);
    }

    private UpdateProcessPage2Form(Parcel in) {
        this.telephone = in.readParcelable(TelephoneModel.class.getClassLoader());
        this.email = in.readString();
    }

    public static final Creator<UpdateProcessPage2Form> CREATOR = new Creator<UpdateProcessPage2Form>() {
        public UpdateProcessPage2Form createFromParcel(Parcel source) {
            return new UpdateProcessPage2Form(source);
        }

        public UpdateProcessPage2Form[] newArray(int size) {
            return new UpdateProcessPage2Form[size];
        }
    };

    public void setCheckLOPD(boolean checkLOPD) {
        this.checkLOPD = checkLOPD;
    }
}
