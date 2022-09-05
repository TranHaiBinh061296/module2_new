package dsa_danhsach.method_arraylist;

public class TestArrayList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6, 7);
//        list.clear();
        list.show();
    }
}
