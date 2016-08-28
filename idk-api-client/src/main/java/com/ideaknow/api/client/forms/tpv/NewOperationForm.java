package com.ideaknow.api.client.forms.tpv;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.tpv.TpvOperationModel;

public class NewOperationForm implements Parcelable {

    private TpvOperationModel operation;
    private String merchantUrl;
    private String customerMobile;
    private String customerEmail;

    public NewOperationForm() {
    }

    public TpvOperationModel getOperation() {
        return operation;
    }

    public void setOperation(TpvOperationModel operation) {
        this.operation = operation;
    }

    public String getMerchantUrl() {
        return merchantUrl;
    }

    public void setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString() {
        return "NewOperationForm{" +
                "operation=" + operation +
                ", merchantUrl='" + merchantUrl + '\'' +
                ", customerMobile='" + customerMobile + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.operation, 0);
        dest.writeString(this.merchantUrl);
        dest.writeString(this.customerMobile);
        dest.writeString(this.customerEmail);
    }

    private NewOperationForm(Parcel in) {
        this.operation = in.readParcelable(TpvOperationModel.class.getClassLoader());
        this.merchantUrl = in.readString();
        this.customerMobile = in.readString();
        this.customerEmail = in.readString();
    }

    public static final Parcelable.Creator<NewOperationForm> CREATOR =
            new Parcelable.Creator<NewOperationForm>() {
                public NewOperationForm createFromParcel(Parcel source) {
                    return new NewOperationForm(source);
                }

                public NewOperationForm[] newArray(int size) {
                    return new NewOperationForm[size];
                }
            };
}
