package com.ideaknow.api.client.model.agent;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.SessionModel;

public class AgentSessionModel implements Parcelable {

    private SessionModel session;
    private AgentModel agent;

    public AgentSessionModel() {
    }

    public SessionModel getSession() {
        return session;
    }

    public void setSession(SessionModel session) {
        this.session = session;
    }

    public AgentModel getAgent() {
        return agent;
    }

    public void setAgent(AgentModel agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "AgentSessionModel{" +
                "session=" + session +
                ", agent='" + agent + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.session, 0);
        dest.writeParcelable(this.agent, 0);

    }

    private AgentSessionModel(Parcel in) {
        this.session = in.readParcelable(SessionModel.class.getClassLoader());
        this.agent = in.readParcelable(AgentModel.class.getClassLoader());
    }

    public static Parcelable.Creator<AgentSessionModel> CREATOR = new Parcelable.Creator<AgentSessionModel>() {
        public AgentSessionModel createFromParcel(Parcel source) {
            return new AgentSessionModel(source);
        }

        public AgentSessionModel[] newArray(int size) {
            return new AgentSessionModel[size];
        }
    };
}
