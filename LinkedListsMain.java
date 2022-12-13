package StackAndQueue;

public class LinkedListsMain {
    /*
    ability to peek and pop from stack till its empty
     */
    public static void main(String[] args) {
        LinkedLists<Integer> Stack = new LinkedLists<>();
        LinkedLists<Integer> Queue = new LinkedLists<>();

       Queue.append(56);
       Queue.append(30);
       Queue.append(70);
       Queue.show();

    }
}
