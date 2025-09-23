/*
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        if (head == null) return null;

        // Step 1: Insert cloned nodes in between
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        // Step 2: Copy random pointers
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next; 
        }

        // Step 3: Separate original and cloned list
        Node dummy = new Node(-1);
        Node copyPtr = dummy;
        temp = head;
        while (temp != null) {
            copyPtr.next = temp.next;
            temp.next = temp.next.next;
            copyPtr = copyPtr.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}
