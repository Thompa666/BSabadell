package com.ideaknow.api.client.model.informational;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class AppsModel implements Parcelable {

    private String GBS_EntradillaFamilia_Mobil;
    private String GBS_TituloFamilia_Mobil;
    private String GBS_ImagenEntradillaPubli_Mobil;
    private String GBS_Market_Android;
    private String H2;
    private boolean GBS_Destacado;
    private String GBS_EntradillaPubli_Mobil;
    private String H1;
    private Bitmap imagen;
    private String GBS_App_Version;

    public AppsModel() {}

    public String getGBS_EntradillaFamilia_Mobil() {
        return GBS_EntradillaFamilia_Mobil;
    }

    public void setGBS_EntradillaFamilia_Mobil(String GBS_EntradillaFamilia_Mobil) {
        this.GBS_EntradillaFamilia_Mobil = GBS_EntradillaFamilia_Mobil;
    }

    public String getGBS_App_Version() {
        return GBS_App_Version;
    }

    public void setGBS_App_Version(String GBS_App_Version) {
        this.GBS_App_Version = GBS_App_Version;
    }

    public String getGBS_TituloFamilia_Mobil() {
        return GBS_TituloFamilia_Mobil;
    }

    public void setGBS_TituloFamilia_Mobil(String GBS_TituloFamilia_Mobil) {
        this.GBS_TituloFamilia_Mobil = GBS_TituloFamilia_Mobil;
    }

    public String getGBS_ImagenEntradillaPubli_Mobil() {
        return GBS_ImagenEntradillaPubli_Mobil;
    }

    public void setGBS_ImagenEntradillaPubli_Mobil(String GBS_ImagenEntradillaPubli_Mobil) {
        this.GBS_ImagenEntradillaPubli_Mobil = GBS_ImagenEntradillaPubli_Mobil;
    }

    public String getGBS_Market_Android() {
        return GBS_Market_Android;
    }

    public void setGBS_Market_Android(String GBS_Market_Android) {
        this.GBS_Market_Android = GBS_Market_Android;
    }

    public String getH2() {
        return H2;
    }

    public void setH2(String h2) {
        H2 = h2;
    }

    public boolean isGBS_Destacado() {
        return GBS_Destacado;
    }

    public void setGBS_Destacado(boolean GBS_Destacado) {
        this.GBS_Destacado = GBS_Destacado;
    }

    public String getGBS_EntradillaPubli_Mobil() {
        return GBS_EntradillaPubli_Mobil;
    }

    public void setGBS_EntradillaPubli_Mobil(String GBS_EntradillaPubli_Mobil) {
        this.GBS_EntradillaPubli_Mobil = GBS_EntradillaPubli_Mobil;
    }

    public String getH1() {
        return H1;
    }

    public void setH1(String h1) {
        H1 = h1;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.GBS_EntradillaFamilia_Mobil);
        dest.writeString(this.GBS_TituloFamilia_Mobil);
        dest.writeString(this.GBS_ImagenEntradillaPubli_Mobil);
        dest.writeString(this.GBS_Market_Android);
        dest.writeString(this.H2);
        dest.writeByte(GBS_Destacado ? (byte) 1 : (byte) 0);
        dest.writeString(this.GBS_EntradillaPubli_Mobil);
        dest.writeString(this.H1);
        dest.writeParcelable(this.imagen, flags);
        dest.writeString(this.GBS_App_Version);
    }

    protected AppsModel(Parcel in) {
        this.GBS_EntradillaFamilia_Mobil = in.readString();
        this.GBS_TituloFamilia_Mobil = in.readString();
        this.GBS_ImagenEntradillaPubli_Mobil = in.readString();
        this.GBS_Market_Android = in.readString();
        this.H2 = in.readString();
        this.GBS_Destacado = in.readByte() != 0;
        this.GBS_EntradillaPubli_Mobil = in.readString();
        this.H1 = in.readString();
        this.imagen = in.readParcelable(Bitmap.class.getClassLoader());
        this.GBS_App_Version = in.readString();
    }

    public static final Creator<AppsModel> CREATOR = new Creator<AppsModel>() {
        @Override
        public AppsModel createFromParcel(Parcel source) {
            return new AppsModel(source);
        }

        @Override
        public AppsModel[] newArray(int size) {
            return new AppsModel[size];
        }
    };
}
