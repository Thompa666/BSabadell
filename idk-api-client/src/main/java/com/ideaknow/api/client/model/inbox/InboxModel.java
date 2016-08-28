package com.ideaknow.api.client.model.inbox;

import android.os.Parcel;
import android.os.Parcelable;

public class InboxModel implements Parcelable {

    private String id;
    private int badge;

    public InboxModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    @Override
    public String toString() {
        return "InboxModel{" +
                "id='" + id + '\'' +
                ", badge=" + badge +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeInt(this.badge);
    }

    private InboxModel(Parcel in) {
        this.id = in.readString();
        this.badge = in.readInt();
    }

    public static final Creator<InboxModel> CREATOR = new Creator<InboxModel>() {
        public InboxModel createFromParcel(Parcel source) {
            return new InboxModel(source);
        }

        public InboxModel[] newArray(int size) {
            return new InboxModel[size];
        }
    };
}
