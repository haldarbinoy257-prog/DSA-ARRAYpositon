class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void deletePosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

        list.deletePosition(3);

        System.out.println("After deletion:");

        list.display();
    }
}