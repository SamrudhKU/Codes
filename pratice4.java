// Stack is linear data structure, It stores in last in first out
// Queue is linear data structure, It stores in first in first out

import java.util.Arrays;

class Queue1 {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int max = 5;
    private int arr[] = new int[max];

    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            arr[rear] = data;
            size++;
        } else {
            System.out.println("Queue is Full");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            // throw new RuntimeException("Queue is Empty");
            System.out.println("Queue is Empty");
        }
        int data = arr[front];
        front = (front + 1) % max;
        size--;
        return data;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        return arr[front];
    }

    public void show() {
        // for (int i = front; i <= size; i++) {
        // System.out.print(arr[i]+" ");
        // }

        System.out.println(Arrays.toString(arr));
    }
}

public class pratice4 {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Deleted element: " + q.dequeue());
        q.enqueue(50);
        q.enqueue(70);
        q.enqueue(60);

        System.out.println("Peek: " + q.peek());
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
        System.out.println("Deleted element: " + q.dequeue());
        q.show();
    }
}
