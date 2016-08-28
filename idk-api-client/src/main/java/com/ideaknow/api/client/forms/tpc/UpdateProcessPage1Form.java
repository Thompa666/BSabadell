package com.ideaknow.api.client.forms.tpc;

import android.os.Parcel;
import android.os.Parcelable;

public class UpdateProcessPage1Form implements Parcelable {

    public static final String TPC_TO_VTPC = "tpc_vtpc";
    public static final String VTPC_TO_VTPC = "vtpc_vtpc";

    private boolean startProcess;
    private String process;

    public UpdateProcessPage1Form() {
    }

    public boolean isStartProcess() {
        return startProcess;
    }

    public void setStartProcess(boolean startProcess) {
        this.startProcess = startProcess;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "UpdateProcessPage1Form{" +
                "startProcess=" + startProcess +
                ", process='" + process + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(startProcess ? (byte) 1 : (byte) 0);
        dest.writeString(this.process);
    }

    private UpdateProcessPage1Form(Parcel in) {
        this.startProcess = in.readByte() != 0;
        this.process = in.readString();
    }

    public static final Creator<UpdateProcessPage1Form> CREATOR =
            new Creator<UpdateProcessPage1Form>() {
                public UpdateProcessPage1Form createFromParcel(Parcel source) {
                    return new UpdateProcessPage1Form(source);
                }

                public UpdateProcessPage1Form[] newArray(int size) {
                    return new UpdateProcessPage1Form[size];
                }
            };
}
