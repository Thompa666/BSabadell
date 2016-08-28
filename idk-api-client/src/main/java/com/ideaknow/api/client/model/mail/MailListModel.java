package com.ideaknow.api.client.model.mail;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class MailListModel implements Parcelable {

    private List<MailModel> mails;
    private PaginatorModel paginator;

    public MailListModel() {

    }

    public List<MailModel> getMails() {
        return mails;
    }

    public void setMails(List<MailModel> mails) {
        this.mails = mails;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "MailListModel{" +
                "mails='" + mails + '\'' +
                ", paginator='" + paginator + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(mails);
        dest.writeParcelable(this.paginator, 0);
    }

    private MailListModel(Parcel in) {
        if (this.mails == null) {
            this.mails = new ArrayList<MailModel>();
        }
        in.readList(this.mails, AccountModel.class.getClassLoader());
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<MailListModel> CREATOR =
            new Parcelable.Creator<MailListModel>() {
                public MailListModel createFromParcel(Parcel source) {
                    return new MailListModel(source);
                }

                public MailListModel[] newArray(int size) {
                    return new MailListModel[size];
                }
            };

}
