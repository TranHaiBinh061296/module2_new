package string_regex.validate_nameclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    //    B?t ??u b?ng m?t k� t? ch? hoa C ho?c A
//    ho?c P
//    Kh�ng ch?a c�c k� t? ??c bi?t
//    Theo sau k� t? b?t ??u l� 4 k� t? s?
//    K?t th�c ph?i l� 1 trong nh?ng k� t? ch? hoa sau:
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
