/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        Node dummy = new Node(-1);
        Node ptr=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
                ptr.next=temp1;
                ptr=ptr.next;
                temp1=temp1.next;
            }else{
                ptr.next=temp2;
                ptr=ptr.next;
                temp2=temp2.next;
            }
        }
        if(temp1!=null) ptr.next=temp1;
        if(temp2!=null) ptr.next=temp2;
        return dummy.next;
        
    }
}