package com.ideaknow.api.client.forms.mail;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.PaginatorModel;

public class MailListForm implements Parcelable {

    public static final String QUERY_TYPE_DEFAULT = "0";
    public static final String QUERY_TYPE_ADVANCED = "1";

    private AccountModel account;
    private PaginatorModel paginator;
    private String dateFrom;
    private String dateTo;
    private String queryType;
    private String category;
    private Boolean read;

    public MailListForm() {
        paginator = new PaginatorModel();
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
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

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean isRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "MailListForm{" +
                "account=" + account +
                ", paginator=" + paginator +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", queryType='" + queryType + '\'' +
                ", category='" + category + '\'' +
                ", read=" + read +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.paginator, 0);
        dest.writeString(this.dateFrom);
        dest.writeString(this.dateTo);
        dest.writeString(this.queryType);
        dest.writeString(this.category);
        dest.writeValue(this.read);
    }

    private MailListForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
        this.dateFrom = in.readString();
        this.dateTo = in.readString();
        this.queryType = in.readString();
        this.category = in.readString();
        this.read = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Creator<MailListForm> CREATOR = new Creator<MailListForm>() {
        public MailListForm createFromParcel(Parcel source) {
            return new MailListForm(source);
        }

        public MailListForm[] newArray(int size) {
            return new MailListForm[size];
        }
    };
}
