package practice_activities.the_tin_dung;

public class Test {
    private static CredictExample phoneExample;
    public static final String[] valid = new String[]{"980900032009393939", "10000000000000"};
    public static final String[] invalid = new String[]{"0809000009393939", "9809000"};

    public static void main(String args[]) {
        phoneExample = new CredictExample();
        for (String account : valid) {
            boolean isvalid = phoneExample.validate(account);
            System.out.println("Credit number is " + account + " is valid: " + isvalid);
        }
        for (String account : invalid) {
            boolean isvalid = phoneExample.validate(account);
            System.out.println("Credit numbe is " + account + " is valid: " + isvalid);
        }
    }
}
