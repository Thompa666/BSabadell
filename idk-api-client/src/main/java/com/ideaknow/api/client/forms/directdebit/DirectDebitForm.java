package com.ideaknow.api.client.forms.directdebit;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.directdebit.DirectDebitModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class DirectDebitForm implements Parcelable {

    private DirectDebitModel directDebit;
    private AccountModel newAccount;
    private String action;
    private String email;
    private String phone;
    private KeyModel key;

    public DirectDebitForm() {
    }

    public DirectDebitModel getDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(DirectDebitModel directDebit) {
        this.directDebit = directDebit;
    }

    public AccountModel getNewAccount() {
        return newAccount;
    }

    public void setNewAccount(AccountModel newAccount) {
        this.newAccount = newAccount;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "DirectDebitForm{" +
                "directDebit=" + directDebit +
                ", newAccount=" + newAccount +
                ", action='" + action + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.directDebit, 0);
        dest.writeParcelable(this.newAccount, 0);
        dest.writeString(this.action);
        dest.writeString(this.email);
        dest.writeString(this.phone);
        dest.writeParcelable(this.key, 0);
    }

    private DirectDebitForm(Parcel in) {
        this.directDebit = in.readParcelable(DirectDebitModel.class.getClassLoader());
        this.newAccount = in.readParcelable(AccountModel.class.getClassLoader());
        this.action = in.readString();
        this.email = in.readString();
        this.phone = in.readString();
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<DirectDebitForm> CREATOR = new Creator<DirectDebitForm>() {
        public DirectDebitForm createFromParcel(Parcel source) {
            return new DirectDebitForm(source);
        }

        public DirectDebitForm[] newArray(int size) {
            return new DirectDebitForm[size];
        }
    };
}
