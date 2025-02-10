// Node class contains the data and the next node.
class Node {
    int data;
    Node next;
}

class Linkedlist {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        Node n = head;
        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data); 
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Deleted node: "+n1.data);
        }
    }
}

public class DS_LinkedList {
    public static void main(String args[]) {
        Linkedlist list = new Linkedlist();
        list.insert(2);
        list.insert(4);
        list.insertAtStart(0);
        list.insertAt(2, 3);
        list.insert(6);
        list.insert(8);
        list.deleteAt(2);
        list.show();

    }
}
