package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

import static com.ideaknow.api.client.enums.PaginatorOrder.DESC;

public class PaginatorModel implements Parcelable {

    private static final int DEFAULT_ITEMS_PER_PAGE = 20;

    private Integer page;
    private Integer itemsPerPage;
    private String order;
    private Integer totalItems;

    public PaginatorModel() {
        page = 0;
        itemsPerPage = DEFAULT_ITEMS_PER_PAGE;
        order = DESC.toString();
        totalItems = 0;
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

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    @Override
    public String toString() {
        return "PaginatorModel{" +
                "page=" + page +
                ", itemsPerPage=" + itemsPerPage +
                ", order='" + order + '\'' +
                ", totalItems=" + totalItems +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.page);
        dest.writeValue(this.itemsPerPage);
        dest.writeString(this.order);
        dest.writeValue(this.totalItems);
    }

    private PaginatorModel(Parcel in) {
        this.page = (Integer) in.readValue(Integer.class.getClassLoader());
        this.itemsPerPage = (Integer) in.readValue(Integer.class.getClassLoader());
        this.order = in.readString();
        this.totalItems = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static Parcelable.Creator<PaginatorModel> CREATOR = new Parcelable.Creator<PaginatorModel>() {
        public PaginatorModel createFromParcel(Parcel source) {
            return new PaginatorModel(source);
        }

        public PaginatorModel[] newArray(int size) {
            return new PaginatorModel[size];
        }
    };
}
