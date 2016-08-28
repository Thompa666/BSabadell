package com.ideaknow.api.client.forms.risk;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

public class RiskListForm implements Parcelable {

    private AccountModel account;
    private String tsFrom;

    public RiskListForm() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public String getTsFrom() {
        return tsFrom;
    }

    public void setTsFrom(String tsFrom) {
        this.tsFrom = tsFrom;
    }

    @Override
    public String toString() {
        return "RiskListForm{" +
                "account=" + account +
                ", tsFrom='" + tsFrom + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeString(this.tsFrom);
    }

    private RiskListForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.tsFrom = in.readString();
    }

    public static final Creator<RiskListForm> CREATOR = new Creator<RiskListForm>() {
        public RiskListForm createFromParcel(Parcel source) {
            return new RiskListForm(source);
        }

        public RiskListForm[] newArray(int size) {
            return new RiskListForm[size];
        }
    };
}
