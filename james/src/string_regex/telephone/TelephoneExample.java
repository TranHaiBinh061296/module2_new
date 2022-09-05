package string_regex.telephone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    //S? ?i?n tho?i h?p l? c?n ??t theo m?u sau: (xx)-(0xxxxxxxxx)
    private static final String TELEPHONE_REGEX = "^\\(\\d{2}\\)-\\([0-9]{10,}\\)$";
    //"^[0][1-9][0-9]{8}$";

    public TelephoneExample() {
    }

    public boolean validate(String regex) {
        Pattern patr = Pattern.compile(TELEPHONE_REGEX);
        Matcher mar = patr.matcher(regex);
        return mar.matches();
    }
}
