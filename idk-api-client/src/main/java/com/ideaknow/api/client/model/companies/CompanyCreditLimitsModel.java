package com.ideaknow.api.client.model.companies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.OperationModel;

public class CompanyCreditLimitsModel implements Parcelable {

    private boolean hasCredit;
    private OperationModel operation;
    private OperationModel operationGroup;
    private String cardUserReference;
    private String cardUserId;
    private String cardSituationHandle;
    private String cardSituationValue;

    public CompanyCreditLimitsModel() {
    }

    public boolean hasCredit() {
        return hasCredit;
    }

    public void setHasCredit(boolean hasCredit) {
        this.hasCredit = hasCredit;
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

    public String getCardUserReference() {
        return cardUserReference;
    }

    public void setCardUserReference(String cardUserReference) {
        this.cardUserReference = cardUserReference;
    }

    public String getCardUserId() {
        return cardUserId;
    }

    public void setCardUserId(String cardUserId) {
        this.cardUserId = cardUserId;
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

    @Override
    public String toString() {
        return "CompanyCreditLimitsModel{" +
                "hasCredit=" + hasCredit +
                ", operation=" + operation +
                ", operationGroup=" + operationGroup +
                ", cardUserReference='" + cardUserReference + '\'' +
                ", cardUserId='" + cardUserId + '\'' +
                ", cardSituationHandle='" + cardSituationHandle + '\'' +
                ", cardSituationValue='" + cardSituationValue + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(hasCredit ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.operation, 0);
        dest.writeParcelable(this.operationGroup, 0);
        dest.writeString(this.cardUserReference);
        dest.writeString(this.cardUserId);
        dest.writeString(this.cardSituationHandle);
        dest.writeString(this.cardSituationValue);
    }

    private CompanyCreditLimitsModel(Parcel in) {
        this.hasCredit = in.readByte() != 0;
        this.operation = in.readParcelable(OperationModel.class.getClassLoader());
        this.operationGroup = in.readParcelable(OperationModel.class.getClassLoader());
        this.cardUserReference = in.readString();
        this.cardUserId = in.readString();
        this.cardSituationHandle = in.readString();
        this.cardSituationValue = in.readString();
    }

    public static final Parcelable.Creator<CompanyCreditLimitsModel> CREATOR =
            new Parcelable.Creator<CompanyCreditLimitsModel>() {
                public CompanyCreditLimitsModel createFromParcel(Parcel source) {
                    return new CompanyCreditLimitsModel(source);
                }

                public CompanyCreditLimitsModel[] newArray(int size) {
                    return new CompanyCreditLimitsModel[size];
                }
            };
}
