/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        //calucalting length of linkedlist
        //making linked list circular
        Node prev=null;
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            prev=temp;
            temp=temp.next;
        }
        prev.next=head;
        temp=head;
        k=k%length;
        if(k == 0) {
            prev.next = null; // break circular
            return head;
        }
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    
        
    }
}