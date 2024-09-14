
class Queue{
    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    
    public void enqueue(int data){
        queue[rear] = data;
        rear = ( rear + 1) % 5;
        size++;
    }

    public void dequeue(){
        front = (front +1) % 5;
        size--;
    }

    public void size(){
        System.out.println("Size: "+size);
    }

    public void isEmpty(){
        System.out.print("isEmpty: ");
        System.out.println(size==0);
    }

    public void show(){
        System.out.println("Elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i) % 5]+" ");
        }
    }

    public void isFull(){
        System.out.print("isFull: ");
        System.out.println(size==5);
    }


}

public class DS_Queue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        q.enqueue(5);
        // q.dequeue();
        q.size();
        q.isEmpty();
        q.isFull();
        q.show();
    }
}
