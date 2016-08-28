package com.ideaknow.api.client.forms.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

public class UserForm implements Parcelable {
    private UserModel user;

    public UserForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "user=" + user +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
    }

    private UserForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<UserForm> CREATOR = new Parcelable.Creator<UserForm>() {
        public UserForm createFromParcel(Parcel source) {
            return new UserForm(source);
        }

        public UserForm[] newArray(int size) {
            return new UserForm[size];
        }
    };
}
