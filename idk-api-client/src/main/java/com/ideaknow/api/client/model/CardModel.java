package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.cards.CardTypeModel;
import com.ideaknow.api.client.model.cards.NfcModel;
import com.ideaknow.formatter.IDKAmountFormatter;
import com.ideaknow.lib.StringUtils;

import java.util.*;

public class CardModel extends BaseModel implements Parcelable, IDKDisplayData, Cloneable {

    public static final int CVV_MAX_LENGTH = 3;
    public static final int STICKER_PAN_MAX_LENGTH = 4;

    public static final String DEBIT = "TD";
    public static final String CREDIT = "TA";
    public static final String PREPAID = "TP";

    /** Card types constants */
    public static final String CARD_TYPE_MASTERCARD = "mastercard";
    public static final String CARD_TYPE_VISA = "visa";
    public static final String CARD_TYPE_VIAT = "viat";
    public static final String CARD_TYPE_SOLRED = "solred";
    public static final String CARD_TYPE_GASOIL = "gasoil";
    public static final String CARD_TYPE_PRIVATE = "private";

    /** Card subtypes constants */
    public static final String CARD_SUBTYPE_DEBIT = "debit";
    public static final String CARD_SUBTYPE_CREDIT = "credit";
    public static final String CARD_SUBTYPE_COMPANY = "company";
    public static final String CARD_SUBTYPE_REVOLVING = "revolving";
    public static final String CARD_SUBTYPE_SOLRED_REPSOL = "solredrepsol";
    public static final String CARD_SUBTYPE_LINEA_EXP = "lineaexpansion";
    public static final String CARD_SUBTYPE_PREPAID = "prepaid";

    /** Card logos constants */
    public static final String CARD_LOGO_MASTERCARD = "mastercard1";
    public static final String CARD_LOGO_MASTERCARD_BUSINESS = "mastercard2";
    public static final String CARD_LOGO_VISA1 = "visa1"; // Visa white.
    public static final String CARD_LOGO_VISA2 = "visa2"; // Visa white electron.
    public static final String CARD_LOGO_VISA3 = "visa3"; // Visa blue.
    public static final String CARD_LOGO_VISA4 = "visa4"; // Visa blue electron.

    public static final String CARD_ICONS_BLACK = "#000000";
    public static final String CARD_ICONS_WHITE = "#ffffff";

    public static String DMS_SKIP_PDFS = "0";

    private String bsprotect;
    private String description;
    private String isMarsans;
    private String name;
    private String productType;
    private String reference;
    private String type;
    private String shortDescription;
    private String number;
    private String realNumber;
    private String numcard;
    private boolean isOwner;
    private String activatedLE;
    private String codret;
    private String contractCCC;
    private String operativeCode;
    private String cvv2;
    private String dni;
    private String entity;
    private String mail;
    private String mailChecked;
    private String phoneNumber;
    private String phoneNumberChecked;
    private String alias;
    private String expirationDate;
    private AmountModel balance;
    private AmountModel availableBalance;
    private String dms;
    private String indAlert;
    private String selectableIndex;
    private boolean canActivate;
    private CardTypeModel cardType;
    private DateModel expirationDateObject;
    private String status;
    private ArrayList<String> availableOperations;
    private boolean isInternational;
    private boolean isInternet;
    private boolean isSticker;
    private boolean stickerCard;
    private NfcModel nfcCard;
    private String stickerPan;
    private boolean deteriorationLock;
    private boolean isPrepaidAnonymous;

    public CardModel() {
        balance = new AmountModel();
        availableBalance = new AmountModel();
        cardType = new CardTypeModel();
    }

    public String getBsprotect() {
        return bsprotect;
    }

    public void setBsprotect(String bsprotect) {
        this.bsprotect = bsprotect;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsMarsans() {
        return isMarsans;
    }

    public void setIsMarsans(String isMarsans) {
        this.isMarsans = isMarsans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(String realNumber) {
        this.realNumber = realNumber;
    }

    public String getNumcard() {
        return numcard;
    }

    public void setNumcard(String numcard) {
        this.numcard = numcard;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    public String getActivatedLE() {
        return activatedLE;
    }

    public void setActivatedLE(String activatedLE) {
        this.activatedLE = activatedLE;
    }

    public String getCodret() {
        return codret;
    }

    public void setCodret(String codret) {
        this.codret = codret;
    }

    public String getContractCCC() {
        return contractCCC;
    }

    public void setContractCCC(String contractCCC) {
        this.contractCCC = contractCCC;
    }

    public String getOperativeCode() {
        return operativeCode;
    }

    public void setOperativeCode(String operativeCode) {
        this.operativeCode = operativeCode;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMailChecked() {
        return mailChecked;
    }

    public void setMailChecked(String mailChecked) {
        this.mailChecked = mailChecked;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberChecked() {
        return phoneNumberChecked;
    }

    public void setPhoneNumberChecked(String phoneNumberChecked) {
        this.phoneNumberChecked = phoneNumberChecked;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public AmountModel getBalance() {
        return balance;
    }

    public void setBalance(AmountModel balance) {
        this.balance = balance;
    }

    public AmountModel getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(AmountModel availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getDms() {
        return dms;
    }

    public void setDms(String dms) {
        this.dms = dms;
    }

    public String getIndAlert() {
        return indAlert;
    }

    public void setIndAlert(String indAlert) {
        this.indAlert = indAlert;
    }

    public String getSelectableIndex() {
        return selectableIndex;
    }

    public void setSelectableIndex(String selectableIndex) {
        this.selectableIndex = selectableIndex;
    }

    public boolean isCanActivate() {
        return canActivate;
    }

    public void setCanActivate(boolean canActivate) {
        this.canActivate = canActivate;
    }

    public CardTypeModel getCardType() {
        return cardType;
    }

    public void setCardType(CardTypeModel cardType) {
        this.cardType = cardType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> getAvailableOperations() {
        return availableOperations;
    }

    public void setAvailableOperations(ArrayList<String> availableOperations) {
        this.availableOperations = availableOperations;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean isInternational) {
        this.isInternational = isInternational;
    }

    public boolean isInternet() {
        return isInternet;
    }

    public void setInternet(boolean isInternet) {
        this.isInternet = isInternet;
    }

    public boolean isSticker() {
        return isSticker;
    }

    public void setSticker(boolean isSticker) {
        this.isSticker = isSticker;
    }

    public DateModel getExpirationDateObject() {
        return expirationDateObject;
    }

    public void setExpirationDateObject(DateModel expirationDateObject) {
        this.expirationDateObject = expirationDateObject;
    }

    public boolean isStickerCard() {
        return stickerCard;
    }

    public void setStickerCard(boolean stickerCard) {
        this.stickerCard = stickerCard;
    }

    public String getStickerPan() {
        return stickerPan;
    }

    public void setStickerPan(String stickerPan) {
        this.stickerPan = stickerPan;
    }

    public NfcModel getNfcCard() {
        return nfcCard;
    }

    public void setNfcCard(NfcModel nfcCard) {
        this.nfcCard = nfcCard;
    }

    public boolean isDeteriorationLock() {
        return deteriorationLock;
    }

    public void setDeteriorationLock(boolean deteriorationLock) {
        this.deteriorationLock = deteriorationLock;
    }

    public boolean isPrepaidAnonymous() {
        return isPrepaidAnonymous;
    }

    public void setPrepaidAnonymous(boolean isPrepaidAnonymous) {
        this.isPrepaidAnonymous = isPrepaidAnonymous;
    }

    @Override
    public String toString() {
        return "CardModel{" +
                "bsprotect='" + bsprotect + '\'' +
                ", description='" + description + '\'' +
                ", isMarsans='" + isMarsans + '\'' +
                ", name='" + name + '\'' +
                ", productType='" + productType + '\'' +
                ", reference='" + reference + '\'' +
                ", type='" + type + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", number='" + number + '\'' +
                ", realNumber='" + realNumber + '\'' +
                ", numcard='" + numcard + '\'' +
                ", setIsOwner=" + isOwner +
                ", activatedLE='" + activatedLE + '\'' +
                ", codret='" + codret + '\'' +
                ", contractCCC='" + contractCCC + '\'' +
                ", operativeCode='" + operativeCode + '\'' +
                ", cvv2='" + cvv2 + '\'' +
                ", dni='" + dni + '\'' +
                ", entity='" + entity + '\'' +
                ", mail='" + mail + '\'' +
                ", mailChecked='" + mailChecked + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", phoneNumberChecked='" + phoneNumberChecked + '\'' +
                ", alias='" + alias + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", balance=" + balance +
                ", availableBalance=" + availableBalance +
                ", dms='" + dms + '\'' +
                ", indAlert='" + indAlert + '\'' +
                ", selectableIndex='" + selectableIndex + '\'' +
                ", canActivate=" + canActivate +
                ", cardType=" + cardType +
                ", expirationDateObject=" + expirationDateObject +
                ", status='" + status + '\'' +
                ", availableOperations=" + availableOperations +
                ", isInternational=" + isInternational +
                ", isInternet=" + isInternet +
                ", isSticker=" + isSticker +
                ", stickerCard=" + stickerCard +
                ", stickerPan='" + stickerPan + '\'' +
                ", isPrepaidAnonymous=" + isPrepaidAnonymous +
                "} " + super.toString();
    }

    @Override
    public boolean isEmpty() {
        return balance == null || balance.isEmpty();
    }

    @Override
    public String getTitle() {
        if (!StringUtils.isEmpty(alias)) {
            return alias;
        } else if (!StringUtils.isEmpty(description)) {
            return description;
        } else {
            return number;
        }
    }

    @Override
    public String getValue() {
        if (productType.equals(PREPAID)) {
            return "";
        } else {
            return IDKAmountFormatter.format(balance);
        }
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        return null;
    }

    @Override
    public boolean isClickable() {
        return true;
    }

    public String getProductTypeTitle() {
        if (DEBIT.equals(productType)) {
            return CARD_SUBTYPE_DEBIT;
        } else if (CREDIT.equals(productType)) {
            return CARD_SUBTYPE_CREDIT;
        } else if (PREPAID.equals(productType)) {
            return CARD_SUBTYPE_PREPAID;
        } else {
            return "";
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.bsprotect);
        dest.writeString(this.description);
        dest.writeString(this.isMarsans);
        dest.writeString(this.name);
        dest.writeString(this.productType);
        dest.writeString(this.reference);
        dest.writeString(this.type);
        dest.writeString(this.shortDescription);
        dest.writeString(this.number);
        dest.writeString(this.realNumber);
        dest.writeString(this.numcard);
        dest.writeByte(isOwner ? (byte) 1 : (byte) 0);
        dest.writeString(this.activatedLE);
        dest.writeString(this.codret);
        dest.writeString(this.contractCCC);
        dest.writeString(this.operativeCode);
        dest.writeString(this.cvv2);
        dest.writeString(this.dni);
        dest.writeString(this.entity);
        dest.writeString(this.mail);
        dest.writeString(this.mailChecked);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.phoneNumberChecked);
        dest.writeString(this.alias);
        dest.writeString(this.expirationDate);
        dest.writeParcelable(this.balance, 0);
        dest.writeParcelable(this.availableBalance, 0);
        dest.writeString(this.dms);
        dest.writeString(this.indAlert);
        dest.writeString(this.selectableIndex);
        dest.writeByte(canActivate ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.cardType, 0);
        dest.writeParcelable(this.expirationDateObject, 0);
        dest.writeString(this.status);
        dest.writeList(this.availableOperations);
        dest.writeByte(isInternational ? (byte) 1 : (byte) 0);
        dest.writeByte(isInternet ? (byte) 1 : (byte) 0);
        dest.writeByte(isSticker ? (byte) 1 : (byte) 0);
        dest.writeByte(stickerCard ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.nfcCard, 0);
        dest.writeString(this.stickerPan);
        dest.writeByte(deteriorationLock ? (byte) 1 : (byte) 0);
        dest.writeByte(isPrepaidAnonymous ? (byte) 1 : (byte) 0);
    }

    private CardModel(Parcel in) {
        this.bsprotect = in.readString();
        this.description = in.readString();
        this.isMarsans = in.readString();
        this.name = in.readString();
        this.productType = in.readString();
        this.reference = in.readString();
        this.type = in.readString();
        this.shortDescription = in.readString();
        this.number = in.readString();
        this.realNumber = in.readString();
        this.numcard = in.readString();
        this.isOwner = in.readByte() != 0;
        this.activatedLE = in.readString();
        this.codret = in.readString();
        this.contractCCC = in.readString();
        this.operativeCode = in.readString();
        this.cvv2 = in.readString();
        this.dni = in.readString();
        this.entity = in.readString();
        this.mail = in.readString();
        this.mailChecked = in.readString();
        this.phoneNumber = in.readString();
        this.phoneNumberChecked = in.readString();
        this.alias = in.readString();
        this.expirationDate = in.readString();
        this.balance = in.readParcelable(AmountModel.class.getClassLoader());
        this.availableBalance = in.readParcelable(AmountModel.class.getClassLoader());
        this.dms = in.readString();
        this.indAlert = in.readString();
        this.selectableIndex = in.readString();
        this.canActivate = in.readByte() != 0;
        this.cardType = in.readParcelable(CardTypeModel.class.getClassLoader());
        this.expirationDateObject = in.readParcelable(DateModel.class.getClassLoader());
        this.status = in.readString();
        if (this.availableOperations == null) {
            this.availableOperations = new ArrayList<String>();
        }
        in.readList(this.availableOperations, String.class.getClassLoader());
        this.isInternational = in.readByte() != 0;
        this.isInternet = in.readByte() != 0;
        this.isSticker = in.readByte() != 0;
        this.stickerCard = in.readByte() != 0;
        this.nfcCard = in.readParcelable(NfcModel.class.getClassLoader());
        this.stickerPan = in.readString();
        this.deteriorationLock = in.readByte() != 0;
        this.isPrepaidAnonymous = in.readByte() != 0;
    }

    public static final Creator<CardModel> CREATOR = new Creator<CardModel>() {
        public CardModel createFromParcel(Parcel source) {
            return new CardModel(source);
        }

        public CardModel[] newArray(int size) {
            return new CardModel[size];
        }
    };

    public CardModel clone(){
        try {
            return (CardModel) super.clone();
        } catch (CloneNotSupportedException e) {
            // Should never happen.
            throw new RuntimeException(e.toString());
        }
    }
}
