/**
 * Linked List Node
 */
class Node{
    int id;
    Node next;

    Node(int id){
        this.id = id;
        next = null;
    }
}
public class PalindromeLinkedList {
    static Node head;

    /**
     * Wrapper over 'Node' class
     */
    static class NodeWrapper
    {
        public Node node;

        NodeWrapper(Node node) {
            this.node = node;
        }
    }
    // Recursive function to check if the linked list is a palindrome or not
    public static boolean checkPalindrome(NodeWrapper left, Node right)
    {
        // base case
        if (right == null) {
            return true;
        }

        boolean result = checkPalindrome(left, right.next) &&
                (left.node.id == right.id);
        left.node = left.node.next;

        return result;
    }

    // Function to check if the linked list is a palindrome or not
    public static boolean checkLinkedList(Node head)
    {
        /*
         * Wrap the `head` node, so its reference can be changed inside the
         */
        return checkPalindrome(new NodeWrapper(head), head);
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
        push(1);
        push(3);
        push(7);
        push(3);
        push(1);

        System.out.println("Given linked list");
        print();

        if (checkLinkedList(head)) {
            System.out.println("The linked list is a palindrome");
        }
        else {
            System.out.println("The linked list is not a palindrome");
        }

    }

}
