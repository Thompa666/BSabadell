package com.ideaknow.api.client.forms.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

public class AccountMovementsForm implements Parcelable {

    private AccountModel account;
    private String dateFrom;
    private String dateTo;
    private boolean moreRequest;

    public AccountMovementsForm() {

    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public boolean isMoreRequest() {
        return moreRequest;
    }

    public void setMoreRequest(boolean moreRequest) {
        this.moreRequest = moreRequest;
    }

    @Override
    public String toString() {
        return "AccountMovementsForm{" +
                "account=" + account +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", moreRequest=" + moreRequest +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeString(this.dateFrom);
        dest.writeString(this.dateTo);
        dest.writeByte(moreRequest ? (byte) 1 : (byte) 0);
    }

    private AccountMovementsForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.dateFrom = in.readString();
        this.dateTo = in.readString();
        this.moreRequest = in.readByte() != 0;
    }

    public static final Creator<AccountMovementsForm> CREATOR = new Creator<AccountMovementsForm>() {
        public AccountMovementsForm createFromParcel(Parcel source) {
            return new AccountMovementsForm(source);
        }

        public AccountMovementsForm[] newArray(int size) {
            return new AccountMovementsForm[size];
        }
    };
}
