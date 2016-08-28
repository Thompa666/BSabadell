package com.ideaknow.api.client.model.tpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.TelephoneModel;

public class ContractResponseModel implements Parcelable {

    private TelephoneModel telephone;
    private String email;

    public ContractResponseModel() {
    }

    public TelephoneModel getTelephone() {
        return telephone;
    }

    public void setTelephone(TelephoneModel telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContractResponseModel{" +
                "telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.telephone, 0);
        dest.writeString(this.email);
    }

    private ContractResponseModel(Parcel in) {
        this.telephone = in.readParcelable(TelephoneResponseModel.class.getClassLoader());
        this.email = in.readString();
    }

    public static final Creator<ContractResponseModel> CREATOR = new Creator<ContractResponseModel>() {
        public ContractResponseModel createFromParcel(Parcel source) {
            return new ContractResponseModel(source);
        }

        public ContractResponseModel[] newArray(int size) {
            return new ContractResponseModel[size];
        }
    };
}
