package com.ideaknow.api.client.forms.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

public class EnrollmentListForm implements Parcelable {

    private UserModel user;

    public EnrollmentListForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "AtmMobileEnrollmentListForm{" +
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

    private EnrollmentListForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<EnrollmentListForm> CREATOR =
            new Parcelable.Creator<EnrollmentListForm>() {
        public EnrollmentListForm createFromParcel(Parcel source) {
            return new EnrollmentListForm(source);
        }

        public EnrollmentListForm[] newArray(int size) {
            return new EnrollmentListForm[size];
        }
    };
}
