package com.ideaknow.api.client.forms.tpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.key.KeyModel;

public class TpcMobileForm implements Parcelable {

    private String mobileNum;
    private KeyModel key;
    private String prefix;

    public TpcMobileForm() {
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "TpcMobileForm{" +
                "mobileNum='" + mobileNum + '\'' +
                ", key=" + key +
                ", prefix='" + prefix + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mobileNum);
        dest.writeParcelable(this.key, 0);
        dest.writeString(this.prefix);
    }

    private TpcMobileForm(Parcel in) {
        this.mobileNum = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
        this.prefix = in.readString();
    }

    public static final Creator<TpcMobileForm> CREATOR = new Creator<TpcMobileForm>() {
        public TpcMobileForm createFromParcel(Parcel source) {
            return new TpcMobileForm(source);
        }

        public TpcMobileForm[] newArray(int size) {
            return new TpcMobileForm[size];
        }
    };
}
