package com.ideaknow.api.client.model.tpv;

import android.os.Parcel;
import android.os.Parcelable;

public class TerminalModel implements Parcelable {

    private String id;
    private String type;
    private MerchantModel merchant;

    public TerminalModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MerchantModel getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantModel merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return "TerminalModel{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", merchant=" + merchant +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeParcelable(this.merchant, 0);
    }

    private TerminalModel(Parcel in) {
        this.id = in.readString();
        this.type = in.readString();
        this.merchant = in.readParcelable(MerchantModel.class.getClassLoader());
    }

    public static final Creator<TerminalModel> CREATOR = new Creator<TerminalModel>() {
        public TerminalModel createFromParcel(Parcel source) {
            return new TerminalModel(source);
        }

        public TerminalModel[] newArray(int size) {
            return new TerminalModel[size];
        }
    };
}
