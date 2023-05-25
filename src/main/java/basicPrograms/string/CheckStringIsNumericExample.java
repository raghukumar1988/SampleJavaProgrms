package basicPrograms.string;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.regex.Pattern;

import static org.hamcrest.MatcherAssert.assertThat;

public class CheckStringIsNumericExample {
    public static void main(String[] args) {
        // using Character class
        System.out.println(isNumericUsingCharClass("23345"));

        //using plain java Parse method
        System.out.println(isNumeric("23345.45"));

        //using Regular Expression
        System.out.println(isNumericUsingRegEx("23345.45"));

        //Using StringUtils
        //System.out.println(isNumericByStringUtils("23345.45"));
        System.out.println(isNumericByStringUtils("23345"));

        //Using NumberUtils
        System.out.println(isNumericByNumberUtils("23345.45"));

        /* Refer here - https://www.baeldung.com/java-check-string-number  */

    }

    private static boolean isNumericUsingCharClass(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean isNumericByNumberUtils(String s) {
        return NumberUtils.isParsable(s);
    }

    private static boolean isNumericByStringUtils(String s) {
        return StringUtils.isNumeric(s);
    }

    private static boolean isNumericUsingRegEx(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            // Here you can use parse method of Integer,Float.Long,etc..
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
