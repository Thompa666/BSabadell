package com.ideaknow.api.client.model.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.lib.StringUtils;

public class UserModel implements Parcelable, Cloneable {

    public static final String SIGNATURE_TYPE_TPC = "tpc";
    public static final String SIGNATURE_TYPE_VTPC = "vtpc";
    public static final String SIGNATURE_TYPE_VTPC2 = "vtpc2";
    public static final String SIGNATURE_TYPE_CONSULTATIVE = "consultative";
    public static final String SIGNATURE_TYPE_VTPC_PENDING = "vtpc1pending";

    private String dni;
    private String name;
    private String firstName;
    private String sex;
    private String phoneNumber;
    private String contractNumber;
    private boolean hasMoreContracts;
    private String customization;
    private boolean isNewUser;
    private int pendingSignOperations;
    private String personNumber;
    private String idType;
    private int loginType;
    private PromoLayerModel promoLayer;
    private String cardId;
    private int refreshActiveAgent;
    private String signatureType;
    private String vTPCInscriptionKey;

    public UserModel() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean isHasMoreContracts() {
        return hasMoreContracts;
    }

    public void setHasMoreContracts(boolean hasMoreContracts) {
        this.hasMoreContracts = hasMoreContracts;
    }

    public String getCustomization() {
        return customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
    }

    public boolean isNewUser() {
        return isNewUser;
    }

    public void setNewUser(boolean isNewUser) {
        this.isNewUser = isNewUser;
    }

    public int getPendingSignOperations() {
        return pendingSignOperations;
    }

    public void setPendingSignOperations(int pendingSignOperations) {
        this.pendingSignOperations = pendingSignOperations;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public PromoLayerModel getPromoLayer() {
        return promoLayer;
    }

    public void setPromoLayer(PromoLayerModel promoLayer) {
        this.promoLayer = promoLayer;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getRefreshActiveAgent() {
        return refreshActiveAgent;
    }

    public void setRefreshActiveAgent(int refreshActiveAgent) {
        this.refreshActiveAgent = refreshActiveAgent;
    }

    public String getSignatureType() {
        // Sometimes api returns empty or null signatureTypes, return "tpc" by default.
        if (StringUtils.isBlank(signatureType)) {
            return UserModel.SIGNATURE_TYPE_TPC;
        }
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public String getvTPCInscriptionKey() {
        return vTPCInscriptionKey;
    }

    public void setvTPCInscriptionKey(String vTPCInscriptionKey) {
        this.vTPCInscriptionKey = vTPCInscriptionKey;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", hasMoreContracts=" + hasMoreContracts +
                ", customization='" + customization + '\'' +
                ", isNewUser=" + isNewUser +
                ", pendingSignOperations=" + pendingSignOperations +
                ", personNumber='" + personNumber + '\'' +
                ", idType='" + idType + '\'' +
                ", loginType=" + loginType +
                ", promoLayer=" + promoLayer +
                ", cardId='" + cardId + '\'' +
                ", refreshActiveAgent=" + refreshActiveAgent +
                ", signatureType='" + signatureType + '\'' +
                ", vTPCInscriptionKey='" + vTPCInscriptionKey + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.dni);
        dest.writeString(this.name);
        dest.writeString(this.firstName);
        dest.writeString(this.sex);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.contractNumber);
        dest.writeByte(hasMoreContracts ? (byte) 1 : (byte) 0);
        dest.writeString(this.customization);
        dest.writeByte(isNewUser ? (byte) 1 : (byte) 0);
        dest.writeInt(this.pendingSignOperations);
        dest.writeString(this.personNumber);
        dest.writeString(this.idType);
        dest.writeInt(this.loginType);
        dest.writeParcelable(this.promoLayer, 0);
        dest.writeString(this.cardId);
        dest.writeInt(this.refreshActiveAgent);
        dest.writeString(this.signatureType);
        dest.writeString(this.vTPCInscriptionKey);
    }

    private UserModel(Parcel in) {
        this.dni = in.readString();
        this.name = in.readString();
        this.firstName = in.readString();
        this.sex = in.readString();
        this.phoneNumber = in.readString();
        this.contractNumber = in.readString();
        this.hasMoreContracts = in.readByte() != 0;
        this.customization = in.readString();
        this.isNewUser = in.readByte() != 0;
        this.pendingSignOperations = in.readInt();
        this.personNumber = in.readString();
        this.idType = in.readString();
        this.loginType = in.readInt();
        this.promoLayer = in.readParcelable(PromoLayerModel.class.getClassLoader());
        this.cardId = in.readString();
        this.refreshActiveAgent = in.readInt();
        this.signatureType = in.readString();
        this.vTPCInscriptionKey = in.readString();
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        public UserModel createFromParcel(Parcel source) {
            return new UserModel(source);
        }

        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };
}
