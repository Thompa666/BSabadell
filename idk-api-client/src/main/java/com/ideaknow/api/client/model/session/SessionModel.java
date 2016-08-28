package com.ideaknow.api.client.model.session;

import android.os.Parcel;
import android.os.Parcelable;

public class SessionModel implements Parcelable {

    private UserModel user;
    private String sessionId;
    private boolean isInputTypeNumberSupported;

    public SessionModel() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean isInputTypeNumberSupported() {
        return isInputTypeNumberSupported;
    }

    public void setInputTypeNumberSupported(boolean isInputTypeNumberSupported) {
        this.isInputTypeNumberSupported = isInputTypeNumberSupported;
    }

    @Override
    public String toString() {
        return "SessionModel{" +
                "user=" + user +
                ", sessionId='" + sessionId + '\'' +
                ", isInputTypeNumberSupported=" + isInputTypeNumberSupported +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
        dest.writeString(this.sessionId);
        dest.writeByte(isInputTypeNumberSupported ? (byte) 1 : (byte) 0);
    }

    private SessionModel(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.sessionId = in.readString();
        this.isInputTypeNumberSupported = in.readByte() != 0;
    }

    public static final Creator<SessionModel> CREATOR = new Creator<SessionModel>() {
        public SessionModel createFromParcel(Parcel source) {
            return new SessionModel(source);
        }

        public SessionModel[] newArray(int size) {
            return new SessionModel[size];
        }
    };
}
