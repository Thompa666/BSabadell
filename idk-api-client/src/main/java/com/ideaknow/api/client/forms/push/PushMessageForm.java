package com.ideaknow.api.client.forms.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

public class PushMessageForm implements Parcelable {

    private UserModel user;
    private String messageID;

    public PushMessageForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    @Override
    public String toString() {
        return "PushMessageForm{" +
                "user=" + user +
                ", messageID='" + messageID + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
        dest.writeString(this.messageID);
    }

    private PushMessageForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.messageID = in.readString();
    }

    public static Parcelable.Creator<PushMessageForm> CREATOR = new Parcelable.Creator<PushMessageForm>() {
        public PushMessageForm createFromParcel(Parcel source) {
            return new PushMessageForm(source);
        }

        public PushMessageForm[] newArray(int size) {
            return new PushMessageForm[size];
        }
    };
}
