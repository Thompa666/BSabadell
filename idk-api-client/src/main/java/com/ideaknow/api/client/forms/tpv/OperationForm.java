package com.ideaknow.api.client.forms.tpv;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.tpv.TpvOperationModel;

public class OperationForm implements Parcelable {

    private TpvOperationModel operation;

    public OperationForm() {
    }

    public TpvOperationModel getOperation() {
        return operation;
    }

    public void setOperation(TpvOperationModel operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "OperationForm{" +
                "operation=" + operation +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.operation, 0);
    }

    private OperationForm(Parcel in) {
        this.operation = in.readParcelable(TpvOperationModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<OperationForm> CREATOR =
            new Parcelable.Creator<OperationForm>() {
        public OperationForm createFromParcel(Parcel source) {
            return new OperationForm(source);
        }

        public OperationForm[] newArray(int size) {
            return new OperationForm[size];
        }
    };
}
