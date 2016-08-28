package com.ideaknow.api.client.forms.informational;

import android.os.Parcel;
import android.os.Parcelable;

import com.ideaknow.api.client.model.informational.InformationalModel;

public class InformationalForm implements Parcelable {

    private InformationalModel informational;
    private String publishDate;

    public InformationalModel getInformational() {
        return informational;
    }

    public void setInformational(InformationalModel informational) {
        this.informational = informational;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.informational, flags);
        dest.writeString(this.publishDate);
    }

    public InformationalForm() {
    }

    protected InformationalForm(Parcel in) {
        this.informational = in.readParcelable(InformationalModel.class.getClassLoader());
        this.publishDate = in.readString();
    }

    public static final Creator<InformationalForm> CREATOR = new Creator<InformationalForm>() {
        @Override
        public InformationalForm createFromParcel(Parcel source) {
            return new InformationalForm(source);
        }

        @Override
        public InformationalForm[] newArray(int size) {
            return new InformationalForm[size];
        }
    };
}
