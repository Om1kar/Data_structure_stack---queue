package StackAndQueue;

public class LinkedLists<T> {
    Node head;
    Node<T> tail;

    public void append(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }


    // adding new data
    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Display all Node with Value
    public void show() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    // Using Pop method to remove  elements
    public void pop() {
        Node<T> current = head;
        while (current != null) {
            if (current == head) {
                head = head.next;
                current = head;
            }
        }
    }

    // Using peak method to find top of the Element
    public T peak() {
        Node<T> current1 = head;
        return current1.data;
    }
    public void dequeue() {
        Node current = head;
        while (current != head) {
            if (current == head) {
                head = head.next;
                current = head;
            }
        }

    }
}
