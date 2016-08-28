package com.ideaknow.api.client.forms.inbox;

import android.os.Parcel;
import android.os.Parcelable;

public class InboxForm implements Parcelable {

    private String brand;

    public InboxForm() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "InboxForm{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.brand);
    }

    private InboxForm(Parcel in) {
        this.brand = in.readString();
    }

    public static final Parcelable.Creator<InboxForm> CREATOR = new Parcelable.Creator<InboxForm>() {
        public InboxForm createFromParcel(Parcel source) {
            return new InboxForm(source);
        }

        public InboxForm[] newArray(int size) {
            return new InboxForm[size];
        }
    };
}
