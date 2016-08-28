package com.ideaknow.api.client.model.key;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.tpc.CardCodeModel;

import java.util.*;

/**
 * Second key model
 */
public class KeyModel implements Parcelable {

    private boolean smsEnabled;
    private String number;
    private String password;
    private String referOTP;
    private boolean tpcEnabled;
    private ArrayList<CardCodeModel> cardCodes;
    private boolean signPending;

    public KeyModel() {
        smsEnabled = false;
        tpcEnabled = false;
        number = "";
        password = "";
        referOTP = "";
    }

    public KeyModel(String number, String password) {
        this();
        this.number = number;
        this.password = password;
    }

    public boolean isSmsEnabled() {
        return smsEnabled;
    }

    public void setSmsEnabled(boolean smsEnabled) {
        this.smsEnabled = smsEnabled;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReferOTP() {
        return referOTP;
    }

    public void setReferOTP(String referOTP) {
        this.referOTP = referOTP;
    }

    public boolean isTpcEnabled() {
        return tpcEnabled;
    }

    public void setTpcEnabled(boolean tpcEnabled) {
        this.tpcEnabled = tpcEnabled;
    }

    public ArrayList<CardCodeModel> getCardCodes() {
        return cardCodes;
    }

    public void setCardCodes(ArrayList<CardCodeModel> cardCodes) {
        this.cardCodes = cardCodes;
    }

    public boolean isSignPending() {
        return signPending;
    }

    public void setSignPending(boolean signPending) {
        this.signPending = signPending;
    }

    @Override
    public String toString() {
        return "KeyModel{" +
                "smsEnabled=" + smsEnabled +
                ", tpcEnabled=" + tpcEnabled +
                ", signPending=" + signPending +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(smsEnabled ? (byte) 1 : (byte) 0);
        dest.writeString(this.number);
        dest.writeString(this.password);
        dest.writeString(this.referOTP);
        dest.writeByte(tpcEnabled ? (byte) 1 : (byte) 0);
        dest.writeList(this.cardCodes);
        dest.writeByte(signPending ? (byte) 1 : (byte) 0);
    }

    protected KeyModel(Parcel in) {
        this.smsEnabled = in.readByte() != 0;
        this.number = in.readString();
        this.password = in.readString();
        this.referOTP = in.readString();
        this.tpcEnabled = in.readByte() != 0;
        if (this.cardCodes == null) {
            this.cardCodes = new ArrayList<CardCodeModel>();
        }
        in.readList(cardCodes, CardCodeModel.class.getClassLoader());
        this.signPending = in.readByte() != 0;
    }

    public static final Creator<KeyModel> CREATOR = new Creator<KeyModel>() {
        public KeyModel createFromParcel(Parcel source) {
            return new KeyModel(source);
        }

        public KeyModel[] newArray(int size) {
            return new KeyModel[size];
        }
    };
}
