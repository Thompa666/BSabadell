package com.ideaknow.api.client.model.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.KeyValueModel;

public class PushMessageModel implements Parcelable {

    private String data;
    private String idMsg;
    private String idMsgExt;
    private boolean isDeleted;
    private boolean isReaded;
    private String refApp;
    private String tsCreate;
    private String tsTrans;
    private KeyValueModel user;

    public PushMessageModel() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIdMsg() {
        return idMsg;
    }

    public void setIdMsg(String idMsg) {
        this.idMsg = idMsg;
    }

    public String getIdMsgExt() {
        return idMsgExt;
    }

    public void setIdMsgExt(String idMsgExt) {
        this.idMsgExt = idMsgExt;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean isReaded() {
        return isReaded;
    }

    public void setReaded(boolean isReaded) {
        this.isReaded = isReaded;
    }

    public String getRefApp() {
        return refApp;
    }

    public void setRefApp(String refApp) {
        this.refApp = refApp;
    }

    public String getTsCreate() {
        return tsCreate;
    }

    public void setTsCreate(String tsCreate) {
        this.tsCreate = tsCreate;
    }

    public String getTsTrans() {
        return tsTrans;
    }

    public void setTsTrans(String tsTrans) {
        this.tsTrans = tsTrans;
    }

    public KeyValueModel getUser() {
        return user;
    }

    public void setUser(KeyValueModel user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PushMessageModel{" +
                "data='" + data + '\'' +
                ", idMsg='" + idMsg + '\'' +
                ", idMsgExt='" + idMsgExt + '\'' +
                ", isDeleted=" + isDeleted +
                ", isReaded=" + isReaded +
                ", refApp='" + refApp + '\'' +
                ", tsCreate='" + tsCreate + '\'' +
                ", tsTrans='" + tsTrans + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.data);
        dest.writeString(this.idMsg);
        dest.writeString(this.idMsgExt);
        dest.writeByte(isDeleted ? (byte) 1 : (byte) 0);
        dest.writeByte(isReaded ? (byte) 1 : (byte) 0);
        dest.writeString(this.refApp);
        dest.writeString(this.tsCreate);
        dest.writeString(this.tsTrans);
        dest.writeParcelable(this.user, 0);
    }

    private PushMessageModel(Parcel in) {
        this.data = in.readString();
        this.idMsg = in.readString();
        this.idMsgExt = in.readString();
        this.isDeleted = in.readByte() != 0;
        this.isReaded = in.readByte() != 0;
        this.refApp = in.readString();
        this.tsCreate = in.readString();
        this.tsTrans = in.readString();
        this.user = in.readParcelable(KeyValueModel.class.getClassLoader());
    }

    public static Parcelable.Creator<PushMessageModel> CREATOR = new Parcelable.Creator<PushMessageModel>() {
        public PushMessageModel createFromParcel(Parcel source) {
            return new PushMessageModel(source);
        }

        public PushMessageModel[] newArray(int size) {
            return new PushMessageModel[size];
        }
    };
}
