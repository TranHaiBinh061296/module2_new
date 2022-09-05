package dsa_stack_queue.queue;

class Solution {
    static class Node {
        private int data;
        private Node link;

    }

    static class Queue {
        Node front, rear;

        // hàm tạo liên kết vòng
        static void enQueue(Queue q, int value) {
            Node temp = new Node();
            temp.data = value;
            if (q.front == null) q.front = temp;

            else q.rear.link = temp;

            q.rear = temp;
            q.rear.link = q.front;
        }

        // tạo hàm xóa khỏi liên kết vòng
        static int deQueue(Queue q) {
            if (q.front == null) {
                System.out.println("Queue is empty ");
                return Integer.MIN_VALUE;
            }

            // nếu đây là phần tử cuối sẽ bị xóa
            int value; // giá trị để xóa
            if (q.front == q.rear) {
                value = q.front.data;
                q.front = null;
                q.rear = null;
            } else { // có nhiều hơn 1 nút
                Node temp = q.front;
                value = temp.data;
                q.front = q.front.link;
                q.rear.link = q.front;
            }
            return value;
        }

        // hàm để hiển thị phần tử liên kết vòng

        static void displayQueue(Queue q) {
            Node temp = q.front;
            System.out.println("Các phần tử trong hàng đợi liên kết vòng ");

            while (temp.link != q.front) {
                System.out.println(temp.data);
                temp = temp.link;
            }
            System.out.println(temp.data);
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.front = q.rear = null;

            // chèn các phần tử trong hàng đợi vòng lặp

            enQueue(q, 14);
            enQueue(q, 22);
            enQueue(q, 6);

            // hiển thị các phần tử có trong hàng đợi
            displayQueue(q);

            // xóa các phần tử trong hàng đợi

            System.out.println("xóa giá trị = " + deQueue(q));
            System.out.println("xóa giá trị = " + deQueue(q));

            // Các phần tử còn lại trong hàng đợi vòng tròn

            displayQueue(q);

            // thêm vào lại 2 phần tử
            enQueue(q, 9);
            enQueue(q, 20);
            displayQueue(q);
        }

    }
}
