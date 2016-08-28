package com.ideaknow.api.client.model.tpv;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class TerminalListModel implements Parcelable {

    private List<TerminalModel> terminals;

    public TerminalListModel() {
    }

    public List<TerminalModel> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<TerminalModel> terminals) {
        this.terminals = terminals;
    }

    @Override
    public String toString() {
        return "TerminalListModel{" +
                "terminals=" + terminals +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(terminals);
    }

    private TerminalListModel(Parcel in) {
        in.readTypedList(terminals, TerminalModel.CREATOR);
    }

    public static final Parcelable.Creator<TerminalListModel> CREATOR =
            new Parcelable.Creator<TerminalListModel>() {
        public TerminalListModel createFromParcel(Parcel source) {
            return new TerminalListModel(source);
        }

        public TerminalListModel[] newArray(int size) {
            return new TerminalListModel[size];
        }
    };
}
