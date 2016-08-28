package com.ideaknow.api.client.forms.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class NfcSignUpUnsubscribeForm implements Parcelable {

    private String dni;
    private CardModel card;
    private KeyModel key;

    public NfcSignUpUnsubscribeForm() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "NfcSignUpUnsubscribeForm{" +
                "dni='" + dni + '\'' +
                ", card=" + card +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.dni);
        dest.writeParcelable(this.card, 0);
        dest.writeParcelable(this.key, 0);
    }

    private NfcSignUpUnsubscribeForm(Parcel in) {
        this.dni = in.readString();
        this.card = in.readParcelable(CardModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<NfcSignUpUnsubscribeForm> CREATOR =
            new Creator<NfcSignUpUnsubscribeForm>() {
                public NfcSignUpUnsubscribeForm createFromParcel(Parcel source) {
                    return new NfcSignUpUnsubscribeForm(source);
                }

                public NfcSignUpUnsubscribeForm[] newArray(int size) {
                    return new NfcSignUpUnsubscribeForm[size];
                }
            };
}
