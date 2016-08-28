package com.ideaknow.api.client.forms.companies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CompanyModel;
import com.ideaknow.api.client.model.OperationModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class LimitAssignedForm implements Parcelable {

    private CompanyModel company;
    private OperationModel operation;
    private OperationModel operationGroup;
    private String cardSituationHandle;
    private String cardSituationValue;
    private String cardUserId;
    private String cardUserReference;
    private KeyModel key;

    public LimitAssignedForm() {
    }

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }

    public OperationModel getOperation() {
        return operation;
    }

    public void setOperation(OperationModel operation) {
        this.operation = operation;
    }

    public OperationModel getOperationGroup() {
        return operationGroup;
    }

    public void setOperationGroup(OperationModel operationGroup) {
        this.operationGroup = operationGroup;
    }

    public String getCardSituationHandle() {
        return cardSituationHandle;
    }

    public void setCardSituationHandle(String cardSituationHandle) {
        this.cardSituationHandle = cardSituationHandle;
    }

    public String getCardSituationValue() {
        return cardSituationValue;
    }

    public void setCardSituationValue(String cardSituationValue) {
        this.cardSituationValue = cardSituationValue;
    }

    public String getCardUserId() {
        return cardUserId;
    }

    public void setCardUserId(String cardUserId) {
        this.cardUserId = cardUserId;
    }

    public String getCardUserReference() {
        return cardUserReference;
    }

    public void setCardUserReference(String cardUserReference) {
        this.cardUserReference = cardUserReference;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "LimitAssignedForm{" +
                "company=" + company +
                ", operation=" + operation +
                ", operationGroup=" + operationGroup +
                ", cardSituationHandle='" + cardSituationHandle + '\'' +
                ", cardSituationValue='" + cardSituationValue + '\'' +
                ", cardUserId='" + cardUserId + '\'' +
                ", cardUserReference='" + cardUserReference + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.company, 0);
        dest.writeParcelable(this.operation, 0);
        dest.writeParcelable(this.operationGroup, 0);
        dest.writeString(this.cardSituationHandle);
        dest.writeString(this.cardSituationValue);
        dest.writeString(this.cardUserId);
        dest.writeString(this.cardUserReference);
        dest.writeParcelable(this.key, 0);
    }

    private LimitAssignedForm(Parcel in) {
        this.company = in.readParcelable(CompanyModel.class.getClassLoader());
        this.operation = in.readParcelable(OperationModel.class.getClassLoader());
        this.operationGroup = in.readParcelable(OperationModel.class.getClassLoader());
        this.cardSituationHandle = in.readString();
        this.cardSituationValue = in.readString();
        this.cardUserId = in.readString();
        this.cardUserReference = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<LimitAssignedForm> CREATOR = new Parcelable.Creator<LimitAssignedForm>() {
        public LimitAssignedForm createFromParcel(Parcel source) {
            return new LimitAssignedForm(source);
        }

        public LimitAssignedForm[] newArray(int size) {
            return new LimitAssignedForm[size];
        }
    };
}
