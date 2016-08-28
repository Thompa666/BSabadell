package com.ideaknow.api.client.forms.companies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.PaginatorModel;

public class CompanyForm implements Parcelable {

    private String identification;
    private PaginatorModel paginator;

    public CompanyForm() {
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "CompanyForm{" +
                "identification=" + identification +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.identification);
        dest.writeParcelable(this.paginator, 0);
    }

    private CompanyForm(Parcel in) {
        this.identification = in.readString();
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CompanyForm> CREATOR = new Parcelable.Creator<CompanyForm>() {
        public CompanyForm createFromParcel(Parcel source) {
            return new CompanyForm(source);
        }

        public CompanyForm[] newArray(int size) {
            return new CompanyForm[size];
        }
    };
}
