package string_regex.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
//   Kh�ng ch?a c�c k� t? ??c bi?t
//	  Ph?i d�i h?n 6 k� t?
//	  Kh�ng ch?a c�c k� t? vi?t hoa
//	  Cho ph�p d?u g?ch d??i (_)
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
