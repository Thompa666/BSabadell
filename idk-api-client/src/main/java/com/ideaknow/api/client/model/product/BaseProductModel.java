package com.ideaknow.api.client.model.product;

import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.BaseModel;
import com.ideaknow.api.client.model.IDKDisplayData;
import com.ideaknow.formatter.IDKAmountFormatter;

/**
 * All products have an amount, this parent class implements the methods isEmpty and getValue for
 * all our products model
 */
public class BaseProductModel extends BaseModel implements IDKDisplayData {

    protected AmountModel amount;

    public BaseProductModel(){
        super();
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public boolean isEmpty() {
        return amount == null || amount.isEmpty();
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getValue() {
        return IDKAmountFormatter.format(amount);
    }

    @Override
    public IDKDisplayData[] getMenuItems() {
        return null;
    }

    @Override
    public boolean isClickable() {
        return true;
    }

    @Override
    public String toString() {
        return "BaseProduct{" +
                "amount=" + amount +
                "} " + super.toString();
    }
}
