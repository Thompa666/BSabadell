package com.ideaknow.api.client.forms.checks;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.checks.CheckModel;

public class CheckForm implements Parcelable {

    private CheckModel check;

    public CheckForm() {

    }

    public CheckModel getCheck() {
        return check;
    }

    public void setCheck(CheckModel check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "CheckForm{" +
                "check=" + check +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.check, 0);
    }

    private CheckForm(Parcel in) {
        this.check = in.readParcelable(CheckModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CheckForm> CREATOR = new Parcelable.Creator<CheckForm>() {
        public CheckForm createFromParcel(Parcel source) {
            return new CheckForm(source);
        }

        public CheckForm[] newArray(int size) {
            return new CheckForm[size];
        }
    };
}
