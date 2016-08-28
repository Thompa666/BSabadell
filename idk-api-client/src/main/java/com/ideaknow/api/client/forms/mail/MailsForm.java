package com.ideaknow.api.client.forms.mail;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.mail.MailBaseModel;

import java.util.*;

public class MailsForm implements Parcelable {

    private ArrayList<MailBaseModel> mails;
    private boolean read;

    public MailsForm() {

    }

    public ArrayList<MailBaseModel> getMails() {
        return mails;
    }

    public void setMails(ArrayList<MailBaseModel> mails) {
        this.mails = mails;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "MailsForm{" +
                "mails='" + mails + '\'' +
                ", read='" + read + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(mails);
        dest.writeByte(read ? (byte) 1 : (byte) 0);
    }

    private MailsForm(Parcel in) {
        if (this.mails == null) {
            this.mails = new ArrayList<MailBaseModel>();
        }
        in.readList(this.mails, AccountModel.class.getClassLoader());
        this.read = in.readByte() != 0;
    }

    public static final Parcelable.Creator<MailsForm> CREATOR =
            new Parcelable.Creator<MailsForm>() {
                public MailsForm createFromParcel(Parcel source) {
                    return new MailsForm(source);
                }

                public MailsForm[] newArray(int size) {
                    return new MailsForm[size];
                }
            };

}
