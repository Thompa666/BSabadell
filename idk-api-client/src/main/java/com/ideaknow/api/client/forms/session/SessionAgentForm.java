package com.ideaknow.api.client.forms.session;

import android.os.Parcel;
import android.os.Parcelable;

public class SessionAgentForm implements Parcelable {

    private SessionForm session;

    public SessionAgentForm() {
    }

    public SessionForm getSession() {
        return session;
    }

    public void setSession(SessionForm session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "SessionAgentForm{" +
                "session=" + session +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.session, 0);
    }

    private SessionAgentForm(Parcel in) {
        this.session = in.readParcelable(SessionForm.class.getClassLoader());
    }

    public static final Creator<SessionAgentForm> CREATOR = new Creator<SessionAgentForm>() {
        public SessionAgentForm createFromParcel(Parcel source) {
            return new SessionAgentForm(source);
        }

        public SessionAgentForm[] newArray(int size) {
            return new SessionAgentForm[size];
        }
    };
}
