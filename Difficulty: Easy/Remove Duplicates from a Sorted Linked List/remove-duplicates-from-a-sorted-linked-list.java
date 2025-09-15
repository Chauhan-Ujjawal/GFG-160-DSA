/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        Node prev=head;
        Node temp=head.next;
        while(temp!=null){
            if(prev.data==temp.data){
                prev.next=temp.next;
                temp=temp.next;
                continue;
            }
            temp=temp.next;
            prev=prev.next;
        }
        return head;
        
    }
}