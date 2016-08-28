package com.ideaknow.api.client.model.glass;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.accounts.AccountsListModel;
import com.ideaknow.api.client.model.agent.AgentModel;
import com.ideaknow.api.client.model.session.SessionModel;

public class SessionAgentAccountsModel implements Parcelable {

    private SessionModel session;
    private AccountsListModel accountList;
    private AgentModel agent;

    public SessionAgentAccountsModel() {
    }

    public SessionModel getSession() {
        return session;
    }

    public void setSession(SessionModel session) {
        this.session = session;
    }

    public AccountsListModel getAccountList() {
        return accountList;
    }

    public void setAccountList(AccountsListModel accountList) {
        this.accountList = accountList;
    }

    public AgentModel getAgent() {
        return agent;
    }

    public void setAgent(AgentModel agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "SessionAgentAccountsModel{" +
                "session=" + session +
                ", accountList=" + accountList +
                ", agent=" + agent +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.session, 0);
        dest.writeParcelable(this.accountList, 0);
        dest.writeParcelable(this.agent, 0);
    }

    private SessionAgentAccountsModel(Parcel in) {
        this.session = in.readParcelable(SessionModel.class.getClassLoader());
        this.accountList = in.readParcelable(AccountsListModel.class.getClassLoader());
        this.agent = in.readParcelable(AgentModel.class.getClassLoader());
    }

    public static Parcelable.Creator<SessionAgentAccountsModel> CREATOR = new Parcelable.Creator<SessionAgentAccountsModel>() {
        public SessionAgentAccountsModel createFromParcel(Parcel source) {
            return new SessionAgentAccountsModel(source);
        }

        public SessionAgentAccountsModel[] newArray(int size) {
            return new SessionAgentAccountsModel[size];
        }
    };
}
