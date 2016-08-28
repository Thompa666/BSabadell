package com.ideaknow.formatter;

import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.lib.StringUtils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class IDKAmountFormatter {

    public static final DecimalFormat DECIMAL_FORMAT_FOR_DISPLAY_ES;
    static {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(); // we do not request the ES local, because it may not be present on the device.
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        DECIMAL_FORMAT_FOR_DISPLAY_ES =  new DecimalFormat("#,###.####", dfs);
        DECIMAL_FORMAT_FOR_DISPLAY_ES.setGroupingUsed(true);
        DECIMAL_FORMAT_FOR_DISPLAY_ES.setMinimumFractionDigits(0); // remove trailing zero
    }

    // Percent
    public static final String PERCENT_SYMBOL = "%";

    /**
     * ISO CURRENCY CODES <a>http://en.wikipedia.org/wiki/ISO_4217</a>
     */
    public static final String EURO_CODE = "EUR";
    public static final String POUND_CODE = "GBP";
    public static final String DOLLAR_CODE = "USD";

    private static final String EURO_SYMB = "€";
    private static final String POUND_SYMB = "£";
    private static final String DOLLAR_SYMB = "$";

    public static String format(AmountModel amount) {
        String stringAmount = "";

        if (amount != null) {
            String value = amount.getValue();
            String currencySymb = getCurrencySymbol(amount.getCurrency());
            if (!StringUtils.isEmpty(value)) {
                stringAmount = value + currencySymb;
            }
        }

        return stringAmount;
    }

    public static String getCurrencySymbol(String currency) {
        String symbol = "";
        if (!StringUtils.isEmpty(currency)) {
            if (currency.equals(EURO_CODE)) {
                symbol = EURO_SYMB;
            } else if (currency.equals(POUND_CODE)) {
                symbol = POUND_SYMB;
            } else if (currency.equals(DOLLAR_CODE)) {
                symbol = DOLLAR_SYMB;
            } else {
                symbol = currency;
            }
        }
        return symbol;
    }

    public static String getCurrencyCode(String symbol) {
        String code = "";
        if (!StringUtils.isEmpty(symbol)) {
            if (symbol.equals(EURO_SYMB)) {
                code = EURO_CODE;
            } else if (symbol.equals(POUND_SYMB)) {
                code = POUND_CODE;
            } else if (symbol.equals(DOLLAR_SYMB)) {
                code = DOLLAR_CODE;
            } else {
                code = symbol;
            }
        }
        return code;
    }

    public static boolean isZero(AmountModel amount) {
        if (amount == null || amount.isEmpty()) {
            return true;
        } else {
            String value = amount.getValue();
            if (value.equals("0") || value.equals("0,0") || value.equals("0,00")
                    || value.equals(",00") || value.equals("0.0") || value.equals("0.00")
                    || value.equals(".00")) {
                return true;
            }
        }

        return false;
    }
}
