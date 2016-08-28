package com.ideaknow.api.client.forms;

import android.os.Parcel;
import android.os.Parcelable;

public class DocumentForm implements Parcelable {

    public static final String PDF_FORMAT = "pdf";

    private String format;
    private String url;
    private String name;

    public DocumentForm() {
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DocumentForm{" +
                "format='" + format + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.format);
        dest.writeString(this.url);
        dest.writeString(this.name);
    }

    private DocumentForm(Parcel in) {
        this.format = in.readString();
        this.url = in.readString();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<DocumentForm> CREATOR = new Parcelable.Creator<DocumentForm>() {
        public DocumentForm createFromParcel(Parcel source) {
            return new DocumentForm(source);
        }

        public DocumentForm[] newArray(int size) {
            return new DocumentForm[size];
        }
    };
}
