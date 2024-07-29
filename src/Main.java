public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(3);
        list.insertAtEnd(5);
        list.insertAtEnd(8);
        list.insertAtEnd(2);
        list.insertAtEnd(1);
        list.insertAtEnd(9);
        System.out.println("List: " + list.displayList());
        System.out.println("Size: " + list.getSize());

        //Deleting the node with value 8
        SinglyLinkedList.Node nodeToDelete = list.findNode(8);
        if(nodeToDelete != null){
            list.deleteNode(nodeToDelete);
            System.out.println("Deleting the Node 8");
        }else{
            System.out.println("Node with value 8 not found");
        }

        System.out.println("List: " + list.displayList());
        System.out.println("Size: " + list.getSize());

        System.out.println("Deleting at start: " + list.deleteAtStart().getData());
        System.out.println("List: " + list.displayList());
        System.out.println("Size: " + list.getSize());
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        System.out.println("List: " + list.displayList());
        System.out.println("Size: " + list.getSize());
        System.out.println("Deleting at last: " + list.deleteAtLast().getData());
        System.out.println("List: " + list.displayList());
        System.out.println("Size: " + list.getSize());

        list.deleteAtLast();
        list.deleteAtLast();
        list.deleteAtLast();
        list.deleteAtLast();
        list.deleteAtLast();
        System.out.println("List: " + list.displayList());


        System.out.println("Is Palindromic: " + list.isPalindrome());

        System.out.println("List after check: " + list.displayList());



    }
}