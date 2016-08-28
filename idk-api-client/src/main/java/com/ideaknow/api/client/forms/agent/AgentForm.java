package com.ideaknow.api.client.forms.agent;

import android.os.Parcel;
import android.os.Parcelable;


public class AgentForm implements Parcelable {

    private String identification;

    public AgentForm() {
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public String toString() {
        return "AgentForm{" +
                "identification=" + identification +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.identification);
    }

    private AgentForm(Parcel in) {
        this.identification = in.readString();
    }

    public static Parcelable.Creator<AgentForm> CREATOR = new Parcelable.Creator<AgentForm>() {
        public AgentForm createFromParcel(Parcel source) {
            return new AgentForm(source);
        }

        public AgentForm[] newArray(int size) {
            return new AgentForm[size];
        }
    };

}
