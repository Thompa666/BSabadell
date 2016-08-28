package com.ideaknow.api.client.forms.tpv;

import android.os.Parcel;
import android.os.Parcelable;

public class TerminalsForm implements Parcelable {

    private String personNumber;

    public TerminalsForm() {
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    @Override
    public String toString() {
        return "TerminalsForm{" +
                "personNumber='" + personNumber + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.personNumber);
    }

    private TerminalsForm(Parcel in) {
        this.personNumber = in.readString();
    }

    public static final Creator<TerminalsForm> CREATOR = new Creator<TerminalsForm>() {
        public TerminalsForm createFromParcel(Parcel source) {
            return new TerminalsForm(source);
        }

        public TerminalsForm[] newArray(int size) {
            return new TerminalsForm[size];
        }
    };
}
