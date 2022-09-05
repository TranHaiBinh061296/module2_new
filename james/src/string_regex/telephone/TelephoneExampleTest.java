package string_regex.telephone;

public class TelephoneExampleTest {

    public static final String[] validTelephone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidTelephone = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        TelephoneExample telephone = new TelephoneExample();
        for (String number : validTelephone) {
            if (telephone.validate(number)) {
                System.out.println(number + " is number phone");
            } else {
                System.out.println(number + " is not number phone");
            }
        }
        for (String number : invalidTelephone) {
            if (telephone.validate(number)) {
                System.out.println(number + " is number phone");
            } else {
                System.out.println(number + " is not number phone");
            }
        }
    }
}
