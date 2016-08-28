package com.ideaknow.api.client.forms.tpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

public class TpcSecondKeyForm implements Parcelable {

    private UserModel user;
    private String hashOTP;
    private boolean risk;

    public TpcSecondKeyForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getHashOTP() {
        return hashOTP;
    }

    public void setHashOTP(String hashOTP) {
        this.hashOTP = hashOTP;
    }

    public boolean isRisk() {
        return risk;
    }

    public void setRisk(boolean risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        return "TpcSecondKeyForm{" +
                "user=" + user +
                ", hashOTP='" + hashOTP + '\'' +
                ", risk=" + risk +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
        dest.writeString(this.hashOTP);
        dest.writeByte(risk ? (byte) 1 : (byte) 0);
    }

    private TpcSecondKeyForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.hashOTP = in.readString();
        this.risk = in.readByte() != 0;
    }

    public static final Creator<TpcSecondKeyForm> CREATOR = new Creator<TpcSecondKeyForm>() {
        public TpcSecondKeyForm createFromParcel(Parcel source) {
            return new TpcSecondKeyForm(source);
        }

        public TpcSecondKeyForm[] newArray(int size) {
            return new TpcSecondKeyForm[size];
        }
    };
}
