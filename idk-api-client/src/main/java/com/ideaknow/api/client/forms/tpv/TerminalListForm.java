package com.ideaknow.api.client.forms.tpv;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CompanyModel;
import com.ideaknow.api.client.model.tpv.MerchantModel;

public class TerminalListForm implements Parcelable {

    private CompanyModel company;
    private MerchantModel merchant;

    public TerminalListForm() {
    }

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }

    public MerchantModel getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantModel merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return "TerminalListForm{" +
                "company=" + company +
                ", merchant=" + merchant +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.company, 0);
        dest.writeParcelable(this.merchant, 0);
    }

    private TerminalListForm(Parcel in) {
        this.company = in.readParcelable(CompanyModel.class.getClassLoader());
        this.merchant = in.readParcelable(MerchantModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<TerminalListForm> CREATOR =
            new Parcelable.Creator<TerminalListForm>() {
        public TerminalListForm createFromParcel(Parcel source) {
            return new TerminalListForm(source);
        }

        public TerminalListForm[] newArray(int size) {
            return new TerminalListForm[size];
        }
    };
}
