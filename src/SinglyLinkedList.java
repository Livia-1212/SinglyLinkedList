public class SinglyLinkedList {

    //instance variables of the SinglyLinkedList
    public Node head = null;                //head node of the list
    public Node tail = null;                //last node of the list
    public int size = 0;                    //numbers of nodes in the list

    public SinglyLinkedList() {
    }             //Constructs an innitially empty list


    public static class Node {
        private int data;
        private Node next;

        public Node(int e, Node n) {
            this.data = e;
            this.next = n;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    public int getSize() {                  //returns the size of the list (numbers of nodes)
        return size;
    }

    public boolean isEmpty() {              //return true if no node in the list
        return size == 0;
    }

    //returns but does not remove 1st element in list
    public Node getFirst() {
        if (isEmpty())
            return null;
        return head;
    }

    //returns but does not remove last element in list
    public Node getLast() {
        if (isEmpty())
            return null;
        return tail;
    }

    //add element to the front of the list
    public void insertAtStart(int e) {
        head = new Node(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void insertAtEnd(int e) {
        Node newest = new Node(e, null);
        if (isEmpty())
            head = newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }

    public Node deleteAtStart() {
        if (isEmpty()) {
            return null;
        }
        Node deletedNode = head;
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return deletedNode;
    }

    public Node deleteAtLast() {
        if (isEmpty()) {
            return null;
        }
        Node deletedNode = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            tail.setNext(null);
        }
        size--;
        return deletedNode;
    }

    public void deleteNode(Node n) {
        if (isEmpty() || n == null) {
            return;
        }

        if (head == n) {
            deleteAtStart();
            return;
        }

        Node prev = head;
        while (prev.getNext() != null && prev.getNext() != n) {
            prev = prev.getNext();
        }

        if (prev.getNext() == null)
            return;

        prev.setNext(n.getNext());
        if (n == tail) {
            tail = prev;
        }
        size--;
    }

    //Find a node by its value
    public Node findNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.getData() == value) {
                return current;
            }
            current = current.getNext();
        }
        return null; //value not found
    }

    public String displayList() {
        StringBuilder builder = new StringBuilder();
        Node current = head;
        while (current != null) {
            builder.append(current.getData()).append("-->");
            current = current.getNext();
        }
        builder.append("null");
        return builder.toString();
    }

    //Check if the linked list is palindrome
    public boolean isPalindrome() {
        if (head == null || tail == null) {
            return true; //A list with 0 or 1 element is a palindrome
        }

        //Find the middle of the list
        boolean flag = true;
        int left = head.getData();
        int right = tail.getData();

        while (left < right) {
            if (left != right) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
}