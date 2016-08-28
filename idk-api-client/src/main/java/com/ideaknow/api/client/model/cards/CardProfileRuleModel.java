package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

public class CardProfileRuleModel implements Parcelable {

    private String code;
    private String name;
    private String status;
    private boolean active;

    public static final String FOREIGN = "001";
    public static final String INTERNET = "002";
    public static final String STICKER = "004";

    public CardProfileRuleModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "CardProfileRuleModel{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", active=" + active +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.name);
        dest.writeString(this.status);
        dest.writeByte(active ? (byte) 1 : (byte) 0);
    }

    private CardProfileRuleModel(Parcel in) {
        this.code = in.readString();
        this.name = in.readString();
        this.status = in.readString();
        this.active = in.readByte() != 0;
    }

    public static final Creator<CardProfileRuleModel> CREATOR = new Creator<CardProfileRuleModel>() {
        public CardProfileRuleModel createFromParcel(Parcel source) {
            return new CardProfileRuleModel(source);
        }

        public CardProfileRuleModel[] newArray(int size) {
            return new CardProfileRuleModel[size];
        }
    };
}
