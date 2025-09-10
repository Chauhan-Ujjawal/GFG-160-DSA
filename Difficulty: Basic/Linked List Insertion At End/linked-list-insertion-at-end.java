/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        if(head==null){
            Node new2= new Node(x);
            head=new2;
            return new2;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node new1 = new Node(x);
        temp.next=new1;
        return head;
    }
}