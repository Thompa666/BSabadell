package com.ideaknow.api.client.model.agent;

import android.os.Parcel;
import android.os.Parcelable;

public class AgentModel implements Parcelable {

    private String name;
    private String phone;
    private String email;
    private String office;
    private String dni;
    private boolean activeAgent;
    private String picture;
    private boolean available;

    public AgentModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isActiveAgent() {
        return activeAgent;
    }

    public void setActiveAgent(boolean activeAgent) {
        this.activeAgent = activeAgent;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "AgentModel{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", office='" + office + '\'' +
                ", dni='" + dni + '\'' +
                ", activeAgent=" + activeAgent +
                ", picture='" + picture + '\'' +
                ", available=" + available +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.phone);
        dest.writeString(this.email);
        dest.writeString(this.office);
        dest.writeString(this.dni);
        dest.writeByte(activeAgent ? (byte) 1 : (byte) 0);
        dest.writeString(this.picture);
        dest.writeByte(available ? (byte) 1 : (byte) 0);
    }

    private AgentModel(Parcel in) {
        this.name = in.readString();
        this.phone = in.readString();
        this.email = in.readString();
        this.office = in.readString();
        this.dni = in.readString();
        this.activeAgent = in.readByte() != 0;
        this.picture = in.readString();
        this.available = in.readByte() != 0;
    }

    public static final Creator<AgentModel> CREATOR = new Creator<AgentModel>() {
        public AgentModel createFromParcel(Parcel source) {
            return new AgentModel(source);
        }

        public AgentModel[] newArray(int size) {
            return new AgentModel[size];
        }
    };
}
