package com.ideaknow.api.client.forms.mail;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.mail.MailModel;

public class MailDocumentForm implements Parcelable {

    private MailModel mail;
    private String format;

    public MailDocumentForm() {

    }

    public MailModel getMail() {
        return mail;
    }

    public void setMail(MailModel mail) {
        this.mail = mail;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "MailDocumentForm{" +
                "mail='" + mail + '\'' +
                ", format='" + format + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.mail, 0);
        dest.writeString(this.format);
    }

    private MailDocumentForm(Parcel in) {
        this.mail = in.readParcelable(MailModel.class.getClassLoader());
        this.format = in.readString();
    }

    public static final Parcelable.Creator<MailDocumentForm> CREATOR =
            new Parcelable.Creator<MailDocumentForm>() {
                public MailDocumentForm createFromParcel(Parcel source) {
                    return new MailDocumentForm(source);
                }

                public MailDocumentForm[] newArray(int size) {
                    return new MailDocumentForm[size];
                }
            };

}
