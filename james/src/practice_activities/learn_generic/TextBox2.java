package practice_activities.learn_generic;

public class TextBox2 {
    public static void main(String[] args) {
        Box2 b1 = new Box2<Integer>(15);
        System.out.println("Gia tri: " +b1.getValue());

        Box2 b2 = new Box2<String>("Tran Hai Binh");

        Box2 b3 = new Box2<Double>(18.8);
    }
}
