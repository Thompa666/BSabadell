package com.ideaknow.api.client.forms.tpv;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CompanyModel;

public class MerchantsListForm implements Parcelable {

    private CompanyModel company;

    public MerchantsListForm() {
    }

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "MerchantsListForm{" +
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

    private MerchantsListForm(Parcel in) {
        this.company = in.readParcelable(CompanyModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<MerchantsListForm> CREATOR =
            new Parcelable.Creator<MerchantsListForm>() {
                public MerchantsListForm createFromParcel(Parcel source) {
                    return new MerchantsListForm(source);
                }

                public MerchantsListForm[] newArray(int size) {
                    return new MerchantsListForm[size];
                }
            };
}
