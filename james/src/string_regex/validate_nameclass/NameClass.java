package string_regex.validate_nameclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    //    B?t ??u b?ng m?t ký t? ch? hoa C ho?c A
//    ho?c P
//    Không ch?a các ký t? ??c bi?t
//    Theo sau ký t? b?t ??u là 4 ký t? s?
//    K?t thúc ph?i là 1 trong nh?ng ký t? ch? hoa sau:
//    G, H, I, K, L, M
    private static final String CLASS_REGEX = "^[CAZ]+\\d{4}[GHIKLM]$";
    //"^[C|A|P]+\\d{4}[G|H|I|K|L|M]";

    public NameClass() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher mtr = pattern.matcher(regex);
        return mtr.matches();
    }
}
