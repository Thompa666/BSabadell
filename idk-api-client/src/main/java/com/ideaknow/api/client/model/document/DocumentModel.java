package com.ideaknow.api.client.model.document;

import android.os.Parcel;
import android.os.Parcelable;

public class DocumentModel implements Parcelable {

    private String id;
    private String content;
    private String text;
    private String url;
    private String name;

    public DocumentModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        return "DocumentModel{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", text='" + text + '\'' +
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
        dest.writeString(this.id);
        dest.writeString(this.content);
        dest.writeString(this.text);
        dest.writeString(this.url);
        dest.writeString(this.name);
    }

    private DocumentModel(Parcel in) {
        this.id = in.readString();
        this.content = in.readString();
        this.text = in.readString();
        this.url = in.readString();
        this.name = in.readString();
    }

    public static Parcelable.Creator<DocumentModel> CREATOR = new Parcelable.Creator<DocumentModel>() {
        public DocumentModel createFromParcel(Parcel source) {
            return new DocumentModel(source);
        }

        public DocumentModel[] newArray(int size) {
            return new DocumentModel[size];
        }
    };
}
