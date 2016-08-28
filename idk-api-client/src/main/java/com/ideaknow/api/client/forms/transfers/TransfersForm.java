package com.ideaknow.api.client.forms.transfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.PaginatorModel;

public class TransfersForm implements Parcelable {

    public static final String TYPE_CANCEL = "ANUT";
    public static final String TYPE_INTERNATIONAL = "TRIX";
    public static final String TYPE_NATIONAL = "TRAF";

    private AccountModel account;
    private String type;
    private String dateFrom;
    private String dateTo;
    private PaginatorModel paginator;

    public TransfersForm() {
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

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransfersForm{" +
                "account=" + account +
                ", type='" + type + '\'' +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeString(this.type);
        dest.writeString(this.dateFrom);
        dest.writeString(this.dateTo);
        dest.writeParcelable(this.paginator, 0);
    }

    private TransfersForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.type = in.readString();
        this.dateFrom = in.readString();
        this.dateTo = in.readString();
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<TransfersForm> CREATOR =
            new Parcelable.Creator<TransfersForm>() {
                public TransfersForm createFromParcel(Parcel source) {
                    return new TransfersForm(source);
                }

                public TransfersForm[] newArray(int size) {
                    return new TransfersForm[size];
                }
            };
}
