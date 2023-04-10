package javaPractice;

import java.util.regex.Pattern;

public class RegexPattern {

    public static void main(String[] args) {
        String s = "abba";


        System.out.print(Pattern.matches("a[abc]+",s));
    }

}
