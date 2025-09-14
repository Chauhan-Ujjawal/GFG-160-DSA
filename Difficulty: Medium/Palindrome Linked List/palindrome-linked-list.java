/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public static Node reverseLL(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static Node middle(Node head1){
        Node slow=head1;
        Node fast=head1;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    public boolean isPalindrome(Node head) {
        Node temp=head;
        Node center=middle(temp);
        Node newHead=reverseLL(center.next);
        while(newHead!=null){
            if(newHead.data!=temp.data) return false;
            temp=temp.next;
            newHead=newHead.next;
        }
        return true;
    }
}