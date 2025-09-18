/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node new1=new Node(x);
        //empty list
        if(head==null ){
             return new1;
        }
        //single node list
        if(head.next==null){
            head.next=new1;
            return head;
        }
        Node prev=null;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        Node nextNode = slow.next;
        slow.next=new1;
        new1.next=nextNode;
        return head;
    }
}