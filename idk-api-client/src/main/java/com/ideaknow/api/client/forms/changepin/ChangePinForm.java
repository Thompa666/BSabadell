package com.ideaknow.api.client.forms.changepin;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.key.KeyModel;

public class ChangePinForm implements Parcelable {

    private String pinCodeNew;
    private String pinCodeNewRepeated;
    private String pinCodeOld;
    private KeyModel key;

    public ChangePinForm() {
    }

    public String getPinCodeNew() {
        return pinCodeNew;
    }

    public void setPinCodeNew(String pinCodeNew) {
        this.pinCodeNew = pinCodeNew;
    }

    public String getPinCodeNewRepeated() {
        return pinCodeNewRepeated;
    }

    public void setPinCodeNewRepeated(String pinCodeNewRepeated) {
        this.pinCodeNewRepeated = pinCodeNewRepeated;
    }

    public String getPinCodeOld() {
        return pinCodeOld;
    }

    public void setPinCodeOld(String pinCodeOld) {
        this.pinCodeOld = pinCodeOld;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ChangePinForm{" +
                "pinCodeNew='" + pinCodeNew + '\'' +
                ", pinCodeNewRepeated='" + pinCodeNewRepeated + '\'' +
                ", pinCodeOld='" + pinCodeOld + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.pinCodeNew);
        dest.writeString(this.pinCodeNewRepeated);
        dest.writeString(this.pinCodeOld);
        dest.writeParcelable(this.key, 0);
    }

    private ChangePinForm(Parcel in) {
        this.pinCodeNew = in.readString();
        this.pinCodeNewRepeated = in.readString();
        this.pinCodeOld = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static Parcelable.Creator<ChangePinForm> CREATOR = new Parcelable.Creator<ChangePinForm>() {
        public ChangePinForm createFromParcel(Parcel source) {
            return new ChangePinForm(source);
        }

        public ChangePinForm[] newArray(int size) {
            return new ChangePinForm[size];
        }
    };
}
