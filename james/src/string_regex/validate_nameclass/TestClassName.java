package string_regex.validate_nameclass;

public class TestClassName {
    private static NameClass nameClass;

    public static final String[] validNameClass = new String[] {"C0318G","C0622G"};
    public static final String[] invalidNameClass = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String name : validNameClass) {
            boolean isvalid = nameClass.validate(name);
            System.out.println(name + " h?p l? hay k? " + isvalid);
        }
        for (String name : invalidNameClass) {
            boolean isvalid = nameClass.validate(name);
            System.out.println(name + " h?p l? hay k? " + isvalid);
        }
    }

}
