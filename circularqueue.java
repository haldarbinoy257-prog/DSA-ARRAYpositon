class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularQueue {
    Node front = null;
    Node rear = null;

    // Enqueue operation
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }

        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        int value = front.data;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }

        System.out.println("Dequeued: " + value);
    }

    // Display queue
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;

        System.out.print("Queue: ");

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();
        q.display();

        q.enqueue(50);
        q.display();
    }
}