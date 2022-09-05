package dsa_danhsach.method_linkedlist;

import javax.swing.plaf.nimbus.NimbusStyle;

public class MyLinkedList<E> {

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Phần tử đầu tiên của danh sách liên kết
    private Node head;
    //Số lượng phần tử có trong danh sách
    private int numNodes = 0;

    public MyLinkedList() {

    }

    public void addFirst(E element) {
        if (head == null) {
            head = new Node(element);
        } else {
            //Khai báo 1 biến là temp tham chiếu(trỏ) đến giá trị của head
            Node temp = head;
            //Biến head sẽ nhận được giá trị là 1 node mới
            head = new Node(element);
            //head.next trỏ đến temp
            head.next = temp;
        }
        numNodes++;
    }

    public void addLast(E element) {
        if (head == null) {
            addFirst(element);
        }else {//Khai báo biến temp trỏ đến head
            Node temp = head;
            //Sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(element);
        }
        numNodes++;
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
            return;
        }
        if (index == size()) {
            addLast(element);
            return;
        }
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        //Khai báo 1 node là holder
        Node holder;
        //Cho con trỏ chạy đến vị trí index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chiếu đến vị trí index
        holder = temp.next;
        //node tại ví trí index-1 sẽ trỏ đến node mới
        temp.next = new Node(element);
        //node mới sẽ trỏ đến holder
        temp.next.next = holder;
        //tăng số lượng phần tử ds lên 1
        numNodes++;
    }


    public Object get(int index) {
        //Khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Error index" + index);
        }
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        Object data;
        //Nếu index = 0 thì trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //Remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //Nếu như tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //Kiểm tra linkedlist có phần tử hay không
        if (numNodes == 0) {
            throw new IndexOutOfBoundsException("Linkedlist is null");
        }
        //Khai báo Linkedlist trả về
        MyLinkedList<E> returnLinkedlist = new MyLinkedList<>();
        //Khai báo 1 temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách để nó làm head
        returnLinkedlist.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedlist.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedlist;
    }

    public boolean contains(E element) {
        Node tempt = head;
        while (tempt != null) {
            if (tempt.data.equals(element)) {
                return true;
            }
            tempt = tempt.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(element)) {
                return 1;
            }
            temp = temp.next;
        }
        return -1;
    }
    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}
