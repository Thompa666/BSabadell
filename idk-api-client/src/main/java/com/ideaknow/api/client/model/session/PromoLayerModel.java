package com.ideaknow.api.client.model.session;

import android.os.Parcel;
import android.os.Parcelable;

public class PromoLayerModel implements Parcelable {

    private String code;
    private String url;
    private int nShows;
    private boolean exist;

    public PromoLayerModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getnShows() {
        return nShows;
    }

    public void setnShows(int nShows) {
        this.nShows = nShows;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    @Override
    public String toString() {
        return "PromoLayerModel{" +
                "code='" + code + '\'' +
                ", url='" + url + '\'' +
                ", nShows=" + nShows +
                ", exist=" + exist +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.url);
        dest.writeInt(this.nShows);
        dest.writeByte(exist ? (byte) 1 : (byte) 0);
    }

    private PromoLayerModel(Parcel in) {
        this.code = in.readString();
        this.url = in.readString();
        this.nShows = in.readInt();
        this.exist = in.readByte() != 0;
    }

    public static final Creator<PromoLayerModel> CREATOR = new Creator<PromoLayerModel>() {
        public PromoLayerModel createFromParcel(Parcel source) {
            return new PromoLayerModel(source);
        }

        public PromoLayerModel[] newArray(int size) {
            return new PromoLayerModel[size];
        }
    };
}
