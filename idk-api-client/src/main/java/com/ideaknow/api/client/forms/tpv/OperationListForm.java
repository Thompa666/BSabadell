package com.ideaknow.api.client.forms.tpv;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.PaginatorModel;
import com.ideaknow.api.client.model.tpv.MerchantModel;
import com.ideaknow.api.client.model.tpv.TerminalModel;

public class OperationListForm implements Parcelable {

    private MerchantModel merchant;
    private TerminalModel terminal;
    private String dateFrom;
    private String dateTo;
    private boolean refunds;
    private PaginatorModel paginator;

    public OperationListForm() {
    }

    public MerchantModel getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantModel merchant) {
        this.merchant = merchant;
    }

    public TerminalModel getTerminal() {
        return terminal;
    }

    public void setTerminal(TerminalModel terminal) {
        this.terminal = terminal;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public boolean isRefunds() {
        return refunds;
    }

    public void setRefunds(boolean refunds) {
        this.refunds = refunds;
    }

    public PaginatorModel getPaginator() {
        return paginator;
    }

    public void setPaginator(PaginatorModel paginator) {
        this.paginator = paginator;
    }

    @Override
    public String toString() {
        return "OperationListForm{" +
                "merchant=" + merchant +
                ", terminal=" + terminal +
                ", dateFrom='" + dateFrom + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", refunds=" + refunds +
                ", paginator=" + paginator +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.merchant, 0);
        dest.writeParcelable(this.terminal, 0);
        dest.writeString(this.dateFrom);
        dest.writeString(this.dateTo);
        dest.writeByte(refunds ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.paginator, 0);
    }

    private OperationListForm(Parcel in) {
        this.merchant = in.readParcelable(MerchantModel.class.getClassLoader());
        this.terminal = in.readParcelable(TerminalModel.class.getClassLoader());
        this.dateFrom = in.readString();
        this.dateTo = in.readString();
        this.refunds = in.readByte() != 0;
        this.paginator = in.readParcelable(PaginatorModel.class.getClassLoader());
    }

    public static final Parcelable.Creator<OperationListForm> CREATOR =
            new Parcelable.Creator<OperationListForm>() {
        public OperationListForm createFromParcel(Parcel source) {
            return new OperationListForm(source);
        }

        public OperationListForm[] newArray(int size) {
            return new OperationListForm[size];
        }
    };
}
