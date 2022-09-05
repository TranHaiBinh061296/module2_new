package dsa_danhsach.method_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.size = capacity;
        elements = new Object[capacity];
    }

    //Thêm một phần tử mới tại chỉ mục được chỉ định
    public void add(int index, E element) {
        int i = size;
        while (i > index) {
            elements[i] = elements[i - 1];
            i--;
        }
        elements[index] = element;
        size++;
    }

    //Xóa phần tử ở vị trí được chỉ định trong danh sách này.
    // Di chuyển bất kỳ phần tử tiếp theo nào sang trái. Trả lại phần tử đã bị xóa khỏi danh sách
    public E remove(int index) {
        E temp = (E) elements[index];
        for (int i = 0; i < index - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    //Trả về độ dài
    public int size() {
        return this.size;
    }

    //Trả về một bản sao ngắn của cá thể ArrayList này.
//    @Override
//    public MyList clone() {
//        MyList<E> clone = new MyList<E>(elements.length);
//        for (E e : (E[]) elements) {
//            clone.add(e);
//        }
//        return clone;
//    }

    //Trả về true nếu danh sách này chứa phần tử được chỉ định.
    public boolean contain(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    //Trả về chỉ số của lần xuất hiện đầu tiên của phần tử được chỉ định trong danh sách này
    // hoặc -1 nếu danh sách này không chứa phần tử.
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i]))
                return i;
        }
        return -1;
    }

    //Thêm phần tử đã chỉ định vào cuối danh sách này
    public boolean add(E o) {
        if (size == elements.length) {
            return false;
        }
        elements[size++] = o;
        return true;
    }

    //Tăng dung lượng của cá thể ArrayList này,
    // nếu cần, để đảm bảo rằng nó có thể chứa ít nhất số phần tử được chỉ định bởi đối số dung lượng tối thiểu.
    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Trả về phần tử ở vị trí đã chỉ định trong danh sách này.
    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("index: " + index + ", size" + index);
        }
        return (E) elements[index];
    }

    //Xóa tất cả các phần tử khỏi danh sách này.
    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void show() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
