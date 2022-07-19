/**
 * Recursive java program to reverse the linked list
 */

public class ReverseLinkedList {
    static Node head;
    static class Node{
        int id;
        Node next;

        Node(int id){
            this.id = id;
            next = null;
        }
    }

    static Node reverseList(Node head){
        if(head == null || head.next == null)
            return head;

        /*
         Reverse the list and put the first element to end
         */
        Node node = reverseList(head.next);
        head.next.next = head;

        head.next = null;

        return node;
    }

    /*
     * Function to print linked list
     */
    static void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.id + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    /**
     * Function to add data to list
     * @param data element
     */
    static void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public static void main(String[] args) {
        push(20);
        push(4);
        push(15);
        push(85);

        System.out.println("Given linked list");
        print();

        head = reverseList(head);

        System.out.println("Reversed Linked list");
        print();
    }
}
