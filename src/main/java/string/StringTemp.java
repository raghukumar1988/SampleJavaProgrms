package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTemp {
    public static void main(String[] args) {
       String str="BE346462234 234320942";
       boolean isWhitespace = Pattern.matches("[a-zA-Z0-9]+",str);


        System.out.println(isWhitespace);
    }
}
