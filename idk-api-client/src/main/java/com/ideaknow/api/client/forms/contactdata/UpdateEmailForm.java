package com.ideaknow.api.client.forms.contactdata;

import android.os.Parcel;
import android.os.Parcelable;

public class UpdateEmailForm implements Parcelable {

    private String email;
    private String application;
    private String reference;
    private String batch;

    public UpdateEmailForm() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "UpdateEmailForm{" +
                "email='" + email + '\'' +
                ", application='" + application + '\'' +
                ", reference='" + reference + '\'' +
                ", batch='" + batch + '\'' +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.email);
        dest.writeString(this.application);
        dest.writeString(this.reference);
        dest.writeString(this.batch);
    }

    private UpdateEmailForm(Parcel in) {
        this.email = in.readString();
        this.application = in.readString();
        this.reference = in.readString();
        this.batch = in.readString();
    }

    public static final Creator<UpdateEmailForm> CREATOR = new Creator<UpdateEmailForm>() {
        public UpdateEmailForm createFromParcel(Parcel source) {
            return new UpdateEmailForm(source);
        }

        public UpdateEmailForm[] newArray(int size) {
            return new UpdateEmailForm[size];
        }
    };
}
