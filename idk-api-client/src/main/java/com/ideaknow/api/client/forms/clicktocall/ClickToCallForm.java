package com.ideaknow.api.client.forms.clicktocall;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.session.UserModel;

public class ClickToCallForm implements Parcelable {

    public static final String WEB_CODE_PIN_RECOVERY = "RecuperacionPIN";

    private UserModel user;
    private String brand;
    private String web;
    private String phone;

    public ClickToCallForm() {
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ClickToCallForm{" +
                "user=" + user +
                ", brand='" + brand + '\'' +
                ", web='" + web + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.user, 0);
        dest.writeString(this.brand);
        dest.writeString(this.web);
        dest.writeString(this.phone);
    }

    private ClickToCallForm(Parcel in) {
        this.user = in.readParcelable(UserModel.class.getClassLoader());
        this.brand = in.readString();
        this.web = in.readString();
        this.phone = in.readString();
    }

    public static final Parcelable.Creator<ClickToCallForm> CREATOR =
            new Parcelable.Creator<ClickToCallForm>() {
                public ClickToCallForm createFromParcel(Parcel source) {
                    return new ClickToCallForm(source);
                }

                public ClickToCallForm[] newArray(int size) {
                    return new ClickToCallForm[size];
                }
    };
}
