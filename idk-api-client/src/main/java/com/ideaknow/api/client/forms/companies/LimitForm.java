package com.ideaknow.api.client.forms.companies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CompanyModel;

public class LimitForm implements Parcelable {

    private CompanyModel company;

    public LimitForm() {
    }

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "LimitForm{" +
                "company=" + company +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.company, 0);
    }

    private LimitForm(Parcel in) {
        this.company = in.readParcelable(CompanyModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<LimitForm> CREATOR = new Parcelable.Creator<LimitForm>() {
        public LimitForm createFromParcel(Parcel source) {
            return new LimitForm(source);
        }

        public LimitForm[] newArray(int size) {
            return new LimitForm[size];
        }
    };
}
