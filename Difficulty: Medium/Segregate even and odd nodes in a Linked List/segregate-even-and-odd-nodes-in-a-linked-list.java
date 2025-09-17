// User function Template for Java

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
    Node divide(Node head) {
        // code here
        if(head==null || head.next==null) return null;
        Node edummy=new Node(-1);
        Node ptr1=edummy;
        Node odummy=new Node(-1);
        Node ptr2=odummy;
        Node temp=head;
        while(temp!=null){
            if((temp.data%2)==0){
                ptr1.next=temp;
                ptr1=ptr1.next;
            }
            else{
                ptr2.next=temp;
                ptr2=ptr2.next;
            }
            temp=temp.next;
        }
        //second list ka last node should always point towards null
        ptr2.next=null;
        ptr1.next=odummy.next;
        return edummy.next;
    }
}