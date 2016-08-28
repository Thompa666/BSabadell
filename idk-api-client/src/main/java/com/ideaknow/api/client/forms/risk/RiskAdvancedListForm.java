package com.ideaknow.api.client.forms.risk;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;

public class RiskAdvancedListForm implements Parcelable {

    private AccountModel account;
    private String dateFrom;
    private String dateTo;
    private String status;
    private String tsFrom;

    public RiskAdvancedListForm() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTsFrom() {
        return tsFrom;
    }

    public void setTsFrom(String tsFrom) {
        this.tsFrom = tsFrom;
    }

    @Override
    public String toString() {
        return "RiskAdvancedListForm{" +
                "account=" + account +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", status='" + status + '\'' +
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
        dest.writeString(this.dateFrom);
        dest.writeString(this.dateTo);
        dest.writeString(this.status);
        dest.writeString(this.tsFrom);
    }

    private RiskAdvancedListForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.dateFrom = in.readString();
        this.dateTo = in.readString();
        this.status = in.readString();
        this.tsFrom = in.readString();
    }

    public static final Creator<RiskAdvancedListForm> CREATOR =
            new Creator<RiskAdvancedListForm>() {
                public RiskAdvancedListForm createFromParcel(Parcel source) {
                    return new RiskAdvancedListForm(source);
                }

                public RiskAdvancedListForm[] newArray(int size) {
                    return new RiskAdvancedListForm[size];
                }
            };
}
