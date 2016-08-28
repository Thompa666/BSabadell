package com.ideaknow.api.client.model.status;

import android.os.Parcel;
import android.os.Parcelable;

public class StatusModel implements Parcelable {

    private VersionModel version;
    private boolean logged;

    public StatusModel() {
    }

    public VersionModel getVersion() {
        return version;
    }

    public void setVersion(VersionModel version) {
        this.version = version;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    @Override
    public String toString() {
        return "StatusModel{" +
                "version=" + version +
                ", logged=" + logged +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.version, 0);
        dest.writeByte(logged ? (byte) 1 : (byte) 0);
    }

    private StatusModel(Parcel in) {
        this.version = in.readParcelable(VersionModel.class.getClassLoader());
        this.logged = in.readByte() != 0;
    }

    public static final Parcelable.Creator<StatusModel> CREATOR =
            new Parcelable.Creator<StatusModel>() {
        public StatusModel createFromParcel(Parcel source) {
            return new StatusModel(source);
        }

        public StatusModel[] newArray(int size) {
            return new StatusModel[size];
        }
    };
}
