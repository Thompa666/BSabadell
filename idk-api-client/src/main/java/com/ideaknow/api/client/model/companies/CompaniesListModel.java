package com.ideaknow.api.client.model.companies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CompanyModel;
import com.ideaknow.api.client.model.PaginatorModel;

import java.util.*;

public class CompaniesListModel implements Parcelable {

    private ArrayList<CompanyModel> companies;
    private PaginatorModel paginator;

    public CompaniesListModel() {
    }

    public ArrayList<CompanyModel> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<CompanyModel> companies) {
        this.companies = companies;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "CompaniesListModel{" +
                "companies=" + companies +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.companies);
        dest.writeParcelable(this.paginator, 0);
    }

    private CompaniesListModel(Parcel in) {
        if (companies == null) {
            companies = new ArrayList<CompanyModel>();
        }
        in.readList(companies, CompanyModel.class.getClassLoader());
        paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CompaniesListModel> CREATOR = new Parcelable.Creator<CompaniesListModel>() {
        public CompaniesListModel createFromParcel(Parcel source) {
            return new CompaniesListModel(source);
        }

        public CompaniesListModel[] newArray(int size) {
            return new CompaniesListModel[size];
        }
    };
}
