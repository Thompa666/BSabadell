package com.ideaknow.api.client.model.inbox;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class InboxesModel implements Parcelable {

    private int badge;
    private List<InboxModel> inboxes;

    public InboxesModel() {
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public List<InboxModel> getInboxes() {
        return inboxes;
    }

    public void setInboxes(List<InboxModel> inboxes) {
        this.inboxes = inboxes;
    }

    @Override
    public String toString() {
        return "InboxesModel{" +
                "badge=" + badge +
                ", inboxes=" + inboxes +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.badge);
        dest.writeList(inboxes);
    }

    private InboxesModel(Parcel in) {
        this.badge = in.readInt();
        if (this.inboxes == null) {
            this.inboxes = new ArrayList<InboxModel>();
        }
        in.readList(this.inboxes, InboxModel.class.getClassLoader());
    }

    public static final Creator<InboxesModel> CREATOR = new Creator<InboxesModel>() {
        public InboxesModel createFromParcel(Parcel source) {
            return new InboxesModel(source);
        }

        public InboxesModel[] newArray(int size) {
            return new InboxesModel[size];
        }
    };
}
