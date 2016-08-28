package com.ideaknow.api.client.model.cards;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class CardProfileRulesListModel implements Parcelable {

    private ArrayList<CardProfileRuleModel> rules;

    public CardProfileRulesListModel() {
    }

    public ArrayList<CardProfileRuleModel> getRules() {
        return rules;
    }

    public void setRules(ArrayList<CardProfileRuleModel> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "CardProfileRulesListModel{" +
                "rules=" + rules +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.rules);
    }

    private CardProfileRulesListModel(Parcel in) {
        if (rules == null) {
            rules = new ArrayList<CardProfileRuleModel>();
        }
        in.readList(rules, CardProfileRuleModel.class.getClassLoader());
    }

    public static Parcelable.Creator<CardProfileRulesListModel> CREATOR = new Parcelable.Creator<CardProfileRulesListModel>() {
        public CardProfileRulesListModel createFromParcel(Parcel source) {
            return new CardProfileRulesListModel(source);
        }

        public CardProfileRulesListModel[] newArray(int size) {
            return new CardProfileRulesListModel[size];
        }
    };
}
