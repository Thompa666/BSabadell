package com.ideaknow.api.client.model.mail;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;

public class MailModel extends MailBaseModel {

    private String category;
    private String subject;
    private String content;
    private AccountModel account;
    private String date;
    private String pdfId;
    private AmountModel amount;
    private boolean read;

    public MailModel() {
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    public String getPdfId() {
        return pdfId;
    }

    public void setPdfId(String pdfId) {
        this.pdfId = pdfId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "MailModel{" +
                "category='" + category + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", account='" + account + '\'' +
                ", date='" + date + '\'' +
                ", pdfId='" + pdfId + '\'' +
                ", amount='" + amount + '\'' +
                ", read='" + read + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.category);
        dest.writeString(this.subject);
        dest.writeString(this.content);
        dest.writeParcelable(this.account, 0);
        dest.writeString(this.date);
        dest.writeString(this.pdfId);
        dest.writeParcelable(this.amount, 0);
        dest.writeByte(read ? (byte) 1 : (byte) 0);
    }

    private MailModel(Parcel in) {
        super(in);
        this.category = in.readString();
        this.subject = in.readString();
        this.content = in.readString();
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.date = in.readString();
        this.pdfId = in.readString();
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
        this.read = in.readByte() != 0;
    }

    public static final Parcelable.Creator<MailModel> CREATOR =
            new Parcelable.Creator<MailModel>() {
                public MailModel createFromParcel(Parcel source) {
                    return new MailModel(source);
                }

                public MailModel[] newArray(int size) {
                    return new MailModel[size];
                }
            };

}
