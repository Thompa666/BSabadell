package com.ideaknow.api.client.model.mail;

import android.os.Parcel;
import android.os.Parcelable;

public class MailBaseModel implements Parcelable {

    private String contract;
    private String entity;
    private String documentId;
    private String product;

    public MailBaseModel() {
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "MailBaseModel{" +
                "contract='" + contract + '\'' +
                ", entity='" + entity + '\'' +
                ", documentId='" + documentId + '\'' +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.contract);
        dest.writeString(this.entity);
        dest.writeString(this.documentId);
        dest.writeString(this.product);
    }

    public MailBaseModel(Parcel in) {
        this.contract = in.readString();
        this.entity = in.readString();
        this.documentId = in.readString();
        this.product = in.readString();
    }

    public static final Parcelable.Creator<MailBaseModel> CREATOR =
            new Parcelable.Creator<MailBaseModel>() {
                public MailBaseModel createFromParcel(Parcel source) {
                    return new MailBaseModel(source);
                }

                public MailBaseModel[] newArray(int size) {
                    return new MailBaseModel[size];
                }
            };
}
