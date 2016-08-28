package com.ideaknow.api.client.model.glass;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.accounts.AccountsListModel;
import com.ideaknow.api.client.model.session.SessionModel;

public class SessionAccountsModel implements Parcelable {

    private SessionModel session;
    private AccountsListModel accountList;

    public SessionAccountsModel() {
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

    @Override
    public String toString() {
        return "SessionAccountsModel{" +
                "session=" + session +
                ", accountList=" + accountList +
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
    }

    private SessionAccountsModel(Parcel in) {
        this.session = in.readParcelable(SessionModel.class.getClassLoader());
        this.accountList = in.readParcelable(AccountsListModel.class.getClassLoader());
    }

    public static Parcelable.Creator<SessionAccountsModel> CREATOR = new Parcelable.Creator<SessionAccountsModel>() {
        public SessionAccountsModel createFromParcel(Parcel source) {
            return new SessionAccountsModel(source);
        }

        public SessionAccountsModel[] newArray(int size) {
            return new SessionAccountsModel[size];
        }
    };
}
