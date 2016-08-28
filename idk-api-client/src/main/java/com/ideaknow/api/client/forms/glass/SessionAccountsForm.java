package com.ideaknow.api.client.forms.glass;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.forms.accounts.AccountsForm;
import com.ideaknow.api.client.forms.session.SessionForm;

public class SessionAccountsForm implements Parcelable {

    private SessionForm session;
    private AccountsForm accounts;

    public SessionAccountsForm() {
    }

    public AccountsForm getAccounts() {
        return accounts;
    }

    public void setAccounts(AccountsForm accounts) {
        this.accounts = accounts;
    }

    public SessionForm getSession() {
        return session;
    }

    public void setSession(SessionForm session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "SessionAccountsForm{" +
                "session=" + session +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.session, 0);
        dest.writeParcelable(this.accounts, 0);
    }

    private SessionAccountsForm(Parcel in) {
        this.session = in.readParcelable(SessionForm.class.getClassLoader());
        this.accounts = in.readParcelable(AccountsForm.class.getClassLoader());
    }

    public static final Creator<SessionAccountsForm> CREATOR = new Creator<SessionAccountsForm>() {
        public SessionAccountsForm createFromParcel(Parcel source) {
            return new SessionAccountsForm(source);
        }

        public SessionAccountsForm[] newArray(int size) {
            return new SessionAccountsForm[size];
        }
    };
}
