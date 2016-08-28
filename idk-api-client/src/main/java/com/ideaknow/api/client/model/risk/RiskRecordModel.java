package com.ideaknow.api.client.model.risk;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class RiskRecordModel implements Parcelable {

    public static final String STATUS_DOC_PENDING = "STATUS_DOC_PENDING";
    public static final String STATUS_OPEN = "STATUS_OPEN";
    public static final String STATUS_CLOSED = "STATUS_CLOSED";

    private String status;
    private String deliveryDate;
    private String endDate;
    private String maxDate;
    private String requestDate;
    private String number;
    private List<RiskProductModel> products;

    public RiskRecordModel() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<RiskProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<RiskProductModel> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "RiskRecordModel{" +
                "status='" + status + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", maxDate='" + maxDate + '\'' +
                ", requestDate='" + requestDate + '\'' +
                ", number='" + number + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.status);
        dest.writeString(this.deliveryDate);
        dest.writeString(this.endDate);
        dest.writeString(this.maxDate);
        dest.writeString(this.requestDate);
        dest.writeString(this.number);
        dest.writeList(products);
    }

    private RiskRecordModel(Parcel in) {
        this.status = in.readString();
        this.deliveryDate = in.readString();
        this.endDate = in.readString();
        this.maxDate = in.readString();
        this.requestDate = in.readString();
        this.number = in.readString();
        if (this.products == null) {
            this.products = new ArrayList<RiskProductModel>();
        }
        in.readList(this.products, RiskProductModel.class.getClassLoader());
    }

    public static final Creator<RiskRecordModel> CREATOR = new Creator<RiskRecordModel>() {
        public RiskRecordModel createFromParcel(Parcel source) {
            return new RiskRecordModel(source);
        }

        public RiskRecordModel[] newArray(int size) {
            return new RiskRecordModel[size];
        }
    };
}
