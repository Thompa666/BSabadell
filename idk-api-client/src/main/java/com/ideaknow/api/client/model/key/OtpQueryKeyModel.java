package com.ideaknow.api.client.model.key;

import android.os.Parcel;

/**
 * Created by corteggo on 2/11/15.
 */
public class OtpQueryKeyModel extends KeyModel {
    private static final String VTPC_RISK_KEY = "VTPCRSC";

    private String personNumber;

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getOtpType() {
        return otpType;
    }

    public void setOtpType(String otpType) {
        this.otpType = otpType;
    }

    private String otpType = "";

    public OtpQueryKeyModel() {
        super();
        this.personNumber = "";
        this.otpType = "";
    }

    private OtpQueryKeyModel(Parcel in) {
        super(in);

        this.personNumber = in.readString();
        this.otpType = in.readString();
    }

    public static final Creator<OtpQueryKeyModel> CREATOR = new Creator<OtpQueryKeyModel>() {
        public OtpQueryKeyModel createFromParcel(Parcel source) {
            return new OtpQueryKeyModel(source);
        }

        public OtpQueryKeyModel[] newArray(int size) {
            return new OtpQueryKeyModel[size];
        }
    };

    public boolean hasRisk() {
        return VTPC_RISK_KEY.equals(this.otpType);
    }
}
