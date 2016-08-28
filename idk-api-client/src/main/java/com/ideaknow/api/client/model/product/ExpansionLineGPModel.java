package com.ideaknow.api.client.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.expansionlines.ExpansionLineModel;

import java.util.*;

public class ExpansionLineGPModel extends BaseProductModel implements Parcelable {

    private ArrayList<ExpansionLineModel> expansionLines;

    public ExpansionLineGPModel() {
        amount = new AmountModel();
    }

    public ArrayList<ExpansionLineModel> getExpansionLines() {
        return expansionLines;
    }

    public void setExpansionLines(ArrayList<ExpansionLineModel> expansionLines) {
        this.expansionLines = expansionLines;
    }

    public AmountModel getAmount() {
        return amount;
    }

    public void setAmount(AmountModel amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ExpansionLineGPModel{" +
                "expansionLines=" + expansionLines +
                '}' + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.expansionLines);
        dest.writeParcelable(this.amount, 0);
    }

    private ExpansionLineGPModel(Parcel in) {
        if (expansionLines == null) {
            expansionLines = new ArrayList<ExpansionLineModel>();
        }
        in.readList(expansionLines, ExpansionLineModel.class.getClassLoader());
        this.amount = in.readParcelable(AmountModel.class.getClassLoader());
    }

    public static final Creator<ExpansionLineGPModel> CREATOR = new Creator<ExpansionLineGPModel>() {
        public ExpansionLineGPModel createFromParcel(Parcel source) {
            return new ExpansionLineGPModel(source);
        }

        public ExpansionLineGPModel[] newArray(int size) {
            return new ExpansionLineGPModel[size];
        }
    };
}
