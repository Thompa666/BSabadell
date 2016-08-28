package com.ideaknow.api.client.model.push;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class PushMessageListModel implements Parcelable {

    private List<PushMessageModel> messages;
    private String tsTo;
    private boolean moreElements;

    public PushMessageListModel() {
    }

    public List<PushMessageModel> getMessages() {
        return messages;
    }

    public void setMessages(List<PushMessageModel> messages) {
        this.messages = messages;
    }

    public String getTsTo() {
        return tsTo;
    }

    public void setTsTo(String tsTo) {
        this.tsTo = tsTo;
    }

    public boolean hasMoreElements() {
        return moreElements;
    }

    public void setMoreElements(boolean moreElements) {
        this.moreElements = moreElements;
    }

    @Override
    public String toString() {
        return "PushMessageListModel{" +
                "messages=" + messages +
                ", tsTo='" + tsTo + '\'' +
                ", moreElements=" + moreElements +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tsTo);
        dest.writeByte(moreElements ? (byte) 1 : (byte) 0);
        dest.writeList(messages);
    }

    private PushMessageListModel(Parcel in) {
        this.tsTo = in.readString();
        this.moreElements = in.readByte() != 0;
        if (messages == null) {
            messages = new ArrayList<PushMessageModel>();
        }
        in.readList(messages, PushDeviceModel.class.getClassLoader());
    }

    public static Parcelable.Creator<PushMessageListModel> CREATOR = new Parcelable.Creator<PushMessageListModel>() {
        public PushMessageListModel createFromParcel(Parcel source) {
            return new PushMessageListModel(source);
        }

        public PushMessageListModel[] newArray(int size) {
            return new PushMessageListModel[size];
        }
    };
}
