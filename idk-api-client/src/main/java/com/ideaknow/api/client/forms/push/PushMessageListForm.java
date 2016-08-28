package com.ideaknow.api.client.forms.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

public class PushMessageListForm implements Parcelable {

    private UserModel user;
    private String tsFrom;

    public PushMessageListForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getTsFrom() {
        return tsFrom;
    }

    public void setTsFrom(String tsFrom) {
        this.tsFrom = tsFrom;
    }

    @Override
    public String toString() {
        return "PushMessageListForm{" +
                "user=" + user +
                ", tsFrom='" + tsFrom + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
        dest.writeString(this.tsFrom);
    }

    private PushMessageListForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.tsFrom = in.readString();
    }

    public static Parcelable.Creator<PushMessageListForm> CREATOR = new Parcelable.Creator<PushMessageListForm>() {
        public PushMessageListForm createFromParcel(Parcel source) {
            return new PushMessageListForm(source);
        }

        public PushMessageListForm[] newArray(int size) {
            return new PushMessageListForm[size];
        }
    };
}
