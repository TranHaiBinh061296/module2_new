package dsa_stack_queue.demerging;

public class Queue {
    public Node front;
    public Node rear;

    public class Node {
        public String data;
        public Node link;
    }

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        if (front == null) return true;
        return false;
    }

    public void enQueue(String name, String gender, int day, int month, int year) {
        Node temp = new Node();
        temp.data = name + "," + gender + " ," + day + "/" + month + year;
        if (isEmpty()) {
            this.front = temp;
        } else this.rear.link = temp;
        this.rear = temp;
        this.rear.link = this.front;
    }
    public String deQueue() {
        Node temp = null;
        if (!isEmpty()) {
            temp = front;
            if (front == rear) {
                front = rear = null;
            }else {
                front = front.link;
                rear.link = front;
            }
        }
        return temp.data;
    }
}
