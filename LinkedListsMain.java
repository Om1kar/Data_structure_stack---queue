package StackAndQueue;

public class LinkedListsMain {
    /*
    ability to peek and pop from stack till its empty
     */
    public static void main(String[] args) {
        LinkedLists<Integer> Stack = new LinkedLists<>();
        Stack.push(70);
        Stack.push(30);
        Stack.push(56);
        Stack.display();
        System.out.println("Peak Element is = " + Stack.peak());
        Stack.pop();
        Stack.display();

    }
}
