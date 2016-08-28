package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.menu.AndroidModel;

public class ParamsModel implements Parcelable {

    public static final String ARG_ACTION_OPEN_OP_MODEL = "arg_action_open_op_model";

    private String operationName;
    private boolean requiredLogin;
    private String operationBlock;
    private String url;
    private boolean isInternal;
    private AndroidModel android;
    private String social;
    private String username;
    private String service; // layers
    private String layerName; // layers
    // Note: ************* this param is exclusive for messaging *********
    // used in this model due to use generic navigation to specific operations
    private String messageId;

    public ParamsModel() {
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public boolean isRequiredLogin() {
        return requiredLogin;
    }

    public void setRequiredLogin(boolean requiredLogin) {
        this.requiredLogin = requiredLogin;
    }

    public String getOperationBlock() {
        return operationBlock;
    }

    public void setOperationBlock(String operationBlock) {
        this.operationBlock = operationBlock;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isInternal() {
        return isInternal;
    }

    public void setInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }

    public AndroidModel getAndroid() {
        return android;
    }

    public void setAndroid(AndroidModel android) {
        this.android = android;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "ParamsModel{" +
                "operationName='" + operationName + '\'' +
                ", requiredLogin=" + requiredLogin +
                ", operationBlock='" + operationBlock + '\'' +
                ", url='" + url + '\'' +
                ", isInternal=" + isInternal +
                ", android=" + android +
                ", social='" + social + '\'' +
                ", username='" + username + '\'' +
                ", service='" + service + '\'' +
                ", layerName='" + layerName + '\'' +
                ", messageId='" + messageId + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.operationName);
        dest.writeByte(requiredLogin ? (byte) 1 : (byte) 0);
        dest.writeString(this.operationBlock);
        dest.writeString(this.url);
        dest.writeByte(isInternal ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.android, 0);
        dest.writeString(this.social);
        dest.writeString(this.username);
        dest.writeString(this.service);
        dest.writeString(this.layerName);
        dest.writeString(this.messageId);
    }

    private ParamsModel(Parcel in) {
        this.operationName = in.readString();
        this.requiredLogin = in.readByte() != 0;
        this.operationBlock = in.readString();
        this.url = in.readString();
        this.isInternal = in.readByte() != 0;
        this.android = in.readParcelable(AndroidModel.class.getClassLoader());
        this.social = in.readString();
        this.username = in.readString();
        this.service = in.readString();
        this.layerName = in.readString();
        this.messageId = in.readString();
    }

    public static final Creator<ParamsModel> CREATOR = new Creator<ParamsModel>() {
        public ParamsModel createFromParcel(Parcel source) {
            return new ParamsModel(source);
        }

        public ParamsModel[] newArray(int size) {
            return new ParamsModel[size];
        }
    };
}
