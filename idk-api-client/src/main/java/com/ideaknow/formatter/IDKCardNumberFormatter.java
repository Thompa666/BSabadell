package com.ideaknow.formatter;

import com.ideaknow.lib.StringUtils;

public class IDKCardNumberFormatter {

    public static final String OBFUSCATED_PATTERN = "____";
    public static final String WHITE_SPACE = "  ";

    public static String format(String cardNumber) {
        String subString;
        String result = tryGetText(cardNumber, 0, 4).concat(WHITE_SPACE);
        subString = tryGetText(cardNumber, 4, 8);
        result += StringUtils.isEmpty(subString) ? subString: subString.concat(WHITE_SPACE);
        subString = tryGetText(cardNumber, 8, 12);
        result += StringUtils.isEmpty(subString) ? subString: subString.concat(WHITE_SPACE);
        result += tryGetText(cardNumber, 12, 16);

        return result;
    }

    public static String formatObfuscated(String cardNumber) {
        String subString;
        String result = tryGetText(cardNumber, 0, 4).concat(WHITE_SPACE);
        subString = StringUtils.isEmpty(tryGetText(cardNumber, 4, 8)) ? "" : OBFUSCATED_PATTERN ;
        result += StringUtils.isEmpty(subString) ? subString: subString.concat(WHITE_SPACE);
        subString = StringUtils.isEmpty(tryGetText(cardNumber, 4, 8)) ? "" : OBFUSCATED_PATTERN ;
        result += StringUtils.isEmpty(subString) ? subString: subString.concat(WHITE_SPACE);
        result += tryGetText(cardNumber, 12, 16);

        return result;
    }

    private static String tryGetText(String data, int start, int end) {
        String text;
        if (data == null) {
            text = "";
        } else if (data.length() >= (start + 4)) {
            text = data.substring(start, end);
        } else if ((data.length() > start) && (data.length() < (start + end))) {
            text = data.substring(start, data.length());
        } else {
            text = "";
        }
        return text;
    }
}
