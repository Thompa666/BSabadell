package com.ideaknow.api.client.forms.directdebit;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.PaginatorModel;

public class DirectDebitListForm implements Parcelable {

    private AccountModel account;
    private PaginatorModel paginator;

    public DirectDebitListForm() {
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "DirectDebitListForm{" +
                "account=" + account +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.account, 0);
        dest.writeParcelable(this.paginator, 0);
    }

    private DirectDebitListForm(Parcel in) {
        this.account = in.readParcelable(AccountModel.class.getClassLoader());
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Creator<DirectDebitListForm> CREATOR = new Creator<DirectDebitListForm>() {
        public DirectDebitListForm createFromParcel(Parcel source) {
            return new DirectDebitListForm(source);
        }

        public DirectDebitListForm[] newArray(int size) {
            return new DirectDebitListForm[size];
        }
    };
}
