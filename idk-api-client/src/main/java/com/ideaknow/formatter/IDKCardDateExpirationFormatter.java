package com.ideaknow.formatter;

import android.util.Log;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.lib.StringUtils;

public class IDKCardDateExpirationFormatter {

    private static final String TAG = IDKCardDateExpirationFormatter.class.getName();
    private static final String API_FORMAT = "dd-MM-yyyy";
    private static final String FORMAT = "%1$s/%2$s";

    public static String format(CardModel cardModel) {
        String expirationDate = "";

        if (cardModel != null && cardModel.getExpirationDate() != null) {
            String date = cardModel.getExpirationDate();
            if (!StringUtils.isEmpty(date)) {
                try {
                    //TODO: refactor/clean this and move it to IDKLib.
                    String[] splittedDate = date.split("-");
                    expirationDate = String.format(FORMAT, splittedDate[1],
                            splittedDate[2].substring(2));
                } catch (Exception e) {
                    // A ill-formatted date shouldn't crash the app.
                    Log.d(TAG, e.getMessage());
                    return date;
                }
            }
        }

        return expirationDate;
    }
}
