package com.ideaknow.api.client.forms.tpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

public class TpcKeysOfflineForm implements Parcelable {

    private UserModel user;
    private String hashOTP;
    private long tmstCompr;

    public TpcKeysOfflineForm() {
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

    public long getTmstCompr() {
        return tmstCompr;
    }

    public void setTmstCompr(long tmstCompr) {
        this.tmstCompr = tmstCompr;
    }

    @Override
    public String toString() {
        return "TpcKeysOfflineForm{" +
                "user=" + user +
                ", hashOTP='" + hashOTP + '\'' +
                ", tmstCompr=" + tmstCompr +
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
        dest.writeLong(this.tmstCompr);
    }

    private TpcKeysOfflineForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.hashOTP = in.readString();
        this.tmstCompr = in.readLong();
    }

    public static final Creator<TpcKeysOfflineForm> CREATOR = new Creator<TpcKeysOfflineForm>() {
        public TpcKeysOfflineForm createFromParcel(Parcel source) {
            return new TpcKeysOfflineForm(source);
        }

        public TpcKeysOfflineForm[] newArray(int size) {
            return new TpcKeysOfflineForm[size];
        }
    };
}
