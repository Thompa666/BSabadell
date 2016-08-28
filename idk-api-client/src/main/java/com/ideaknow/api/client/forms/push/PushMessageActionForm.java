package com.ideaknow.api.client.forms.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

import java.util.*;

public class PushMessageActionForm implements Parcelable {

    private UserModel user;
    private ArrayList<String> messageIDs;

    public PushMessageActionForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public ArrayList<String> getMessageIDs() {
        return messageIDs;
    }

    public void setMessageIDs(ArrayList<String> messageIDs) {
        this.messageIDs = messageIDs;
    }

    @Override
    public String toString() {
        return "PushMessageActionForm{" +
                "user=" + user +
                ", messageIDs=" + messageIDs +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
        dest.writeList(this.messageIDs);
    }

    private PushMessageActionForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        if (messageIDs == null) {
            messageIDs = new ArrayList<String>();
        }
        in.readList(messageIDs, String.class.getClassLoader());
    }

    public static Parcelable.Creator<PushMessageActionForm> CREATOR = new Parcelable.Creator<PushMessageActionForm>() {
        public PushMessageActionForm createFromParcel(Parcel source) {
            return new PushMessageActionForm(source);
        }

        public PushMessageActionForm[] newArray(int size) {
            return new PushMessageActionForm[size];
        }
    };
}
