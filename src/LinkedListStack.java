import java.util.EmptyStackException;

public class LinkedListStack <T> {
    private class Node {
         T data;
         Node next;
         Node(T data) {
             this.data = data;
             this.next = null;
         }
    }
    private Node top;
    private int size;
    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }
    public void push(T data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /*public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }*/
}
