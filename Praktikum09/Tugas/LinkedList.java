package Tugas;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;

    }
    
    public boolean isEmpty() {
        return (head == null);
    }

    public void insertBefore(int keyword, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        if (head.data == keyword) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == keyword) {
                newNode.next = current.next;
                return;
            }
            current = current.next;
        }
    }

    public void insertAfter(int index, int data) {
        if (index < 0) {
            System.out.println("Linked list ksong");
            return;
        }

        Node newNode = new Node(data);
        
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Linked list kosong");
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeFirst() {
        if (isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosng");
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " : ");
            current = current.next;
        }
        System.out.println("null");
    }
}
