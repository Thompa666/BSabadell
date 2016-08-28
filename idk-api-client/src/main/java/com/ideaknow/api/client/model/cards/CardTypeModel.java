package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

public class CardTypeModel implements Parcelable {

    private String background;
    private String type;
    private String subtype;
    private String textColor;
    private String iconColor;
    private String logo;

    public CardTypeModel(){

    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getIconColor() {
        return iconColor;
    }

    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "CardTypeModel{" +
                "background='" + background + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", textColor='" + textColor + '\'' +
                ", iconColor='" + iconColor + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.background);
        dest.writeString(this.type);
        dest.writeString(this.subtype);
        dest.writeString(this.textColor);
        dest.writeString(this.iconColor);
        dest.writeString(this.logo);
    }

    private CardTypeModel(Parcel in) {
        this.background = in.readString();
        this.type = in.readString();
        this.subtype = in.readString();
        this.textColor = in.readString();
        this.iconColor = in.readString();
        this.logo = in.readString();
    }

    public static Creator<CardTypeModel> CREATOR = new Creator<CardTypeModel>() {
        public CardTypeModel createFromParcel(Parcel source) {
            return new CardTypeModel(source);
        }

        public CardTypeModel[] newArray(int size) {
            return new CardTypeModel[size];
        }
    };
}
