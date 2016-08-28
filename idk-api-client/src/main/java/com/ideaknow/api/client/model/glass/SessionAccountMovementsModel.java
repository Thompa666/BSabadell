package com.ideaknow.api.client.model.glass;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.accounts.AccountMovementsListModel;
import com.ideaknow.api.client.model.session.SessionModel;

public class SessionAccountMovementsModel implements Parcelable {

    private SessionModel session;
    private AccountMovementsListModel accountMovementsList;

    public SessionAccountMovementsModel() {
    }

    public SessionModel getSession() {
        return session;
    }

    public void setSession(SessionModel session) {
        this.session = session;
    }

    public AccountMovementsListModel getAccountMovementsList() {
        return accountMovementsList;
    }

    public void setAccountMovementsList(AccountMovementsListModel accountMovementsList) {
        this.accountMovementsList = accountMovementsList;
    }

    @Override
    public String toString() {
        return "SessionAccountMovementsModel{" +
                "session=" + session +
                ", accountMovementsList=" + accountMovementsList +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.session, 0);
        dest.writeParcelable(this.accountMovementsList, 0);
    }

    private SessionAccountMovementsModel(Parcel in) {
        this.session = in.readParcelable(SessionModel.class.getClassLoader());
        this.accountMovementsList = in
                .readParcelable(AccountMovementsListModel.class.getClassLoader());
    }

    public static final Creator<SessionAccountMovementsModel> CREATOR
            = new Creator<SessionAccountMovementsModel>() {
        public SessionAccountMovementsModel createFromParcel(Parcel source) {
            return new SessionAccountMovementsModel(source);
        }

        public SessionAccountMovementsModel[] newArray(int size) {
            return new SessionAccountMovementsModel[size];
        }
    };
}
