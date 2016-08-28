package com.ideaknow.api.client.model.informational;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class CatalogModel implements Parcelable {

    private ArrayList<ProductModel> products;
    private String GBS_EntradillaFamilia_Mobil;
    private String GBS_TituloFamilia_Mobil;
    private String GBS_IdFamilia;
    private ArrayList<CatalogModel> catalog;
    private String GBS_IdAnalytics;

    public String getGBS_IdFamilia() {
        return GBS_IdFamilia;
    }

    public void setGBS_IdFamilia(String GBS_IdFamilia) {
        this.GBS_IdFamilia = GBS_IdFamilia;
    }

    public ArrayList<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductModel> products) {
        this.products = products;
    }

    public ArrayList<CatalogModel> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<CatalogModel> catalog) {
        this.catalog = catalog;
    }

    public String getGBS_EntradillaFamilia_Mobil() {
        return GBS_EntradillaFamilia_Mobil;
    }

    public void setGBS_EntradillaFamilia_Mobil(String GBS_EntradillaFamilia_Mobil) {
        this.GBS_EntradillaFamilia_Mobil = GBS_EntradillaFamilia_Mobil;
    }

    public String getGBS_TituloFamilia_Mobil() {
        return GBS_TituloFamilia_Mobil;
    }

    public void setGBS_TituloFamilia_Mobil(String GBS_TituloFamilia_Mobil) {
        this.GBS_TituloFamilia_Mobil = GBS_TituloFamilia_Mobil;
    }

    public String getGBS_IdAnalytics() {
        return GBS_IdAnalytics;
    }

    public void setGBS_IdAnalytics(String GBS_IdAnalytics) {
        this.GBS_IdAnalytics = GBS_IdAnalytics;
    }

    public CatalogModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(products);
        dest.writeTypedList(catalog);
        dest.writeString(this.GBS_EntradillaFamilia_Mobil);
        dest.writeString(this.GBS_TituloFamilia_Mobil);
        dest.writeString(this.GBS_IdFamilia);
        dest.writeString(this.GBS_IdAnalytics);
    }

    protected CatalogModel(Parcel in) {
        this.products = in.createTypedArrayList(ProductModel.CREATOR);
        this.catalog = in.createTypedArrayList(CatalogModel.CREATOR);
        this.GBS_EntradillaFamilia_Mobil = in.readString();
        this.GBS_TituloFamilia_Mobil = in.readString();
        this.GBS_IdFamilia = in.readString();
        this.GBS_IdAnalytics = in.readString();
    }

    public static final Creator<CatalogModel> CREATOR = new Creator<CatalogModel>() {
        @Override
        public CatalogModel createFromParcel(Parcel source) {
            return new CatalogModel(source);
        }

        @Override
        public CatalogModel[] newArray(int size) {
            return new CatalogModel[size];
        }
    };
}
