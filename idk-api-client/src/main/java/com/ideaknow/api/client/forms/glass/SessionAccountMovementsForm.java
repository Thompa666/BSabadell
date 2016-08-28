package com.ideaknow.api.client.forms.glass;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.forms.accounts.AccountMovementsForm;
import com.ideaknow.api.client.forms.session.SessionForm;

public class SessionAccountMovementsForm implements Parcelable {

    private SessionForm session;
    private AccountMovementsForm accountMovements;

    public SessionAccountMovementsForm() {
    }

    public SessionForm getSession() {
        return session;
    }

    public void setSession(SessionForm session) {
        this.session = session;
    }

    public AccountMovementsForm getAccountMovements() {
        return accountMovements;
    }

    public void setAccountMovements(AccountMovementsForm accountMovements) {
        this.accountMovements = accountMovements;
    }

    @Override
    public String toString() {
        return "SessionAccountMovementsForm{" +
                "session=" + session +
                ", accountMovements=" + accountMovements +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.session, 0);
        dest.writeParcelable(this.accountMovements, 0);
    }

    private SessionAccountMovementsForm(Parcel in) {
        this.session = in.readParcelable(SessionForm.class.getClassLoader());
        this.accountMovements = in.readParcelable(AccountMovementsForm.class.getClassLoader());
    }


    public static final Creator<SessionAccountMovementsForm> CREATOR =
            new Creator<SessionAccountMovementsForm>() {
                public SessionAccountMovementsForm createFromParcel(Parcel source) {
                    return new SessionAccountMovementsForm(source);
                }

                public SessionAccountMovementsForm[] newArray(int size) {
                    return new SessionAccountMovementsForm[size];
                }
            };
}
