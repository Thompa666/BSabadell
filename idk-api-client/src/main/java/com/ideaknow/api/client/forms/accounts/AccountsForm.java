package com.ideaknow.api.client.forms.accounts;

import android.os.Parcel;
import android.os.Parcelable;

public class AccountsForm implements Parcelable {

    public static final String DEFAULT_TYPE = "CTA_VISTA";
    public static final String NATIONAL_TYPE = "CTA_VISTA_NACIONAL";

    private String type;
    private Integer page;
    private Integer itemsPerPage;
    private String order;
    private String contractCCC;

    public AccountsForm() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getContractCCC() {
        return contractCCC;
    }

    public void setContractCCC(String contractCCC) {
        this.contractCCC = contractCCC;
    }

    @Override
    public String toString() {
        return "AccountsForm{" +
                "type='" + type + '\'' +
                ", page=" + page +
                ", itemsPerPage=" + itemsPerPage +
                ", order='" + order + '\'' +
                ", contractCCC='" + contractCCC + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeValue(this.page);
        dest.writeValue(this.itemsPerPage);
        dest.writeString(this.order);
        dest.writeString(this.contractCCC);
    }

    private AccountsForm(Parcel in) {
        this.type = in.readString();
        this.page = (Integer) in.readValue(Integer.class.getClassLoader());
        this.itemsPerPage = (Integer) in.readValue(Integer.class.getClassLoader());
        this.order = in.readString();
        this.contractCCC = in.readString();
    }

    public static Creator<AccountsForm> CREATOR = new Creator<AccountsForm>() {
        public AccountsForm createFromParcel(Parcel source) {
            return new AccountsForm(source);
        }

        public AccountsForm[] newArray(int size) {
            return new AccountsForm[size];
        }
    };
}
