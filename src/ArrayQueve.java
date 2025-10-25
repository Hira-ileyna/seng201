public class ArrayQueve {
    private int[] queve;
    private int front ;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueve(int capacity) {
        queve = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queve[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue");
        }
        int item = queve[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek from an empty queue");
        }
        return queve[front];
    }



}
