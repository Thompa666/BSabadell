package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.BaseModel;

public class ProductsListModel extends BaseModel implements Parcelable {

    private AccountProductModel accountProduct;
    private AdditionalProductModel additionalProduct;
    private CardProductModel cardProduct;
    private InvestmentProductModel investmentProduct;
    private FinancialProductModel financialProduct;
    private UnknownListModel other;

    public ProductsListModel() {
        accountProduct = new AccountProductModel();
        additionalProduct = new AdditionalProductModel();
        cardProduct = new CardProductModel();
        investmentProduct = new InvestmentProductModel();
        financialProduct = new FinancialProductModel();
        other = new UnknownListModel();
    }

    public AccountProductModel getAccountProduct() {
        return accountProduct;
    }

    public void setAccountProduct(AccountProductModel accountProduct) {
        this.accountProduct = accountProduct;
    }

    public void setAdditionalProduct(AdditionalProductModel additionalProduct) {
        this.additionalProduct = additionalProduct;
    }

    public AdditionalProductModel getAdditionalProduct() {
        return additionalProduct;
    }

    public CardProductModel getCardProduct() {
        return cardProduct;
    }

    public void setCardProduct(CardProductModel cardProduct) {
        this.cardProduct = cardProduct;
    }

    public InvestmentProductModel getInvestmentProduct() {
        return investmentProduct;
    }

    public void setInvestmentProduct(InvestmentProductModel investmentProduct) {
        this.investmentProduct = investmentProduct;
    }

    public FinancialProductModel getFinancialProduct() {
        return financialProduct;
    }

    public void setFinancialProduct(FinancialProductModel financialProduct) {
        this.financialProduct = financialProduct;
    }

    public UnknownListModel getOther() {
        return other;
    }

    public void setOther(UnknownListModel other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "ProductsListModel{" +
                "accountProduct=" + accountProduct +
                ", cardProduct=" + cardProduct +
                ", investmentProduct=" + investmentProduct +
                ", financialProduct=" + financialProduct +
                ", additionalProduct=" + additionalProduct +
                ", other=" + other +
                '}';
    }

    @Override
    public boolean isEmpty() {
        return (accountProduct == null || accountProduct.isEmpty()) &&
                (cardProduct == null || cardProduct.isEmpty()) &&
                (investmentProduct == null || investmentProduct.isEmpty()) &&
                (financialProduct == null || financialProduct.isEmpty()) &&
                (additionalProduct == null || additionalProduct.isEmpty());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    private ProductsListModel(Parcel in) {
        this.accountProduct = in.readParcelable(AccountProductModel.class.getClassLoader());
        this.cardProduct = in.readParcelable(CardProductModel.class.getClassLoader());
        this.investmentProduct = in.readParcelable(InvestmentProductModel.class.getClassLoader());
        this.financialProduct = in.readParcelable(FinancialProductModel.class.getClassLoader());
        this.additionalProduct = in.readParcelable(AdditionalProductModel.class.getClassLoader());
        this.other = in.readParcelable(UnknownListModel.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.accountProduct, 0);
        dest.writeParcelable(this.cardProduct, 0);
        dest.writeParcelable(this.investmentProduct, 0);
        dest.writeParcelable(this.financialProduct, 0);
        dest.writeParcelable(this.additionalProduct, 0);
        dest.writeParcelable(this.other, 0);
    }

    public static final Creator<ProductsListModel> CREATOR = new Creator<ProductsListModel>() {
        public ProductsListModel createFromParcel(Parcel source) {
            return new ProductsListModel(source);
        }

        public ProductsListModel[] newArray(int size) {
            return new ProductsListModel[size];
        }
    };

}
