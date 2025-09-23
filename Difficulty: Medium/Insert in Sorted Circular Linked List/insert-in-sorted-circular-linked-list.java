/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} 
*/

class Solution {
    public Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;

        // Case 2: New node smaller than head (insert before head)
        if(data < head.data){
            // Find last node
            while(temp.next != head) temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
            return newNode; // new head
        }

        // Case 3: Insert somewhere in middle or at end
        temp = head;
        while(temp.next != head && temp.next.data < data){
            temp = temp.next;
        }

        // Insert new node
        newNode.next = temp.next;
        temp.next = newNode;

        return head; // head remains same
    }
}
