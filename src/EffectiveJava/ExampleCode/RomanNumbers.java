package EffectiveJava.ExampleCode;

import java.util.regex.Pattern;

public class RomanNumbers {

    private static final Pattern ROMAN_NUMBER_PATTERN = Pattern.compile("^M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3}) (I[XV] |V?I{0,3})$");

    static boolean isRomanNumber(String s) {
        return ROMAN_NUMBER_PATTERN.matcher(s).matches();
    }

}
