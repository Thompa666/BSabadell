package com.ideaknow.api.client.forms.atmmobile;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.session.UserModel;

public class OtpRemoveForm implements Parcelable {

    private String otpHash;
    private UserModel user;
    private AmountModel amount;

    public OtpRemoveForm() {
    }

    public String getOtpHash() {
        return otpHash;
    }

    public void setOtpHash(String otpHash) {
        this.otpHash = otpHash;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OtpRemoveForm{" +
                "otpHash='" + otpHash + '\'' +
                ", user=" + user +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.otpHash);
        dest.writeParcelable(this.user, 0);
        dest.writeParcelable(this.amount, 0);
    }

    private OtpRemoveForm(Parcel in) {
        this.otpHash = in.readString();
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<OtpRemoveForm> CREATOR = new Creator<OtpRemoveForm>() {
        public OtpRemoveForm createFromParcel(Parcel source) {
            return new OtpRemoveForm(source);
        }

        public OtpRemoveForm[] newArray(int size) {
            return new OtpRemoveForm[size];
        }
    };
}
