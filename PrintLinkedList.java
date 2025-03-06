class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to append a new value to the linked list
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Method to print the linked list elements
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println(); // For a new line after printing all elements
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a linked list and append values
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);

        // Print the linked list
        linkedList.printList();  // Output: 1 2 

        // Another example
        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(49);
        linkedList2.append(10);
        linkedList2.append(30);

        // Print the second linked list
        linkedList2.printList();  // Output: 49 10 30 
    }
}
