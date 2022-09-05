package dsa_stack_queue.palindrome;

public class Queue{
    private Node front, rear;

    public class Node {
        public char data;
        public Node link;
    }

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(char data) {
        Node temp = new Node();
        temp.data = data;
        if (front == null) {
            front = temp;
        } else rear.link = temp;
        rear = temp;
        rear.link = front;
    }

    public boolean isEmpty(){
        if(front == null ) return true ;
        return false ;
    }

    public char deQueue()  {
        char value = front.data;
        if (front == rear) {
            rear = front = null;
        } else {
            front = front.link;
            rear.link = front;
        }
        return value ;
    }

    public void displayQueue() {
        if (front== null) {
            System.out.println("\nQueue is empty");
        } else {
            Node temp = front;
            System.out.print("\nElements in  Queue are: ");
            while (temp.link != front) {
                System.out.printf(" %d ", temp.data);
                temp = temp.link;
            }
            System.out.printf(" %d", temp.data);
        }
    }
}
