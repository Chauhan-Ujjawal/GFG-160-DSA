/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(x==1){
            Node temp=head.next;
            head=temp;
            return head;
        }
        Node temp=head;
        for(int i=0;i<x-2;i++){
            temp=temp.next;
        }
        if(temp.next.next!=null){
            temp.next=temp.next.next;
        }else{
            temp.next=null;
        }
        return head;
    }
}