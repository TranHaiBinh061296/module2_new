package string_regex.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
//   Không ch?a các ký t? ??c bi?t
//	  Ph?i dài h?n 6 ký t?
//	  Không ch?a các ký t? vi?t hoa
//	  Cho phép d?u g?ch d??i (_)
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    //"^(?=.{3,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";

    public AccountExample() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matr = pattern.matcher(regex);
        return matr.matches();
    }
}
