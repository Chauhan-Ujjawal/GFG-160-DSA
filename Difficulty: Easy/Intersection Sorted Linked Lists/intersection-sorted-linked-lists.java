/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        if(head1==null || head2==null) return null;
        Node dummy=new Node(-1);
        Node ptr=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.data==temp2.data){
                Node new1 =new Node(temp1.data);
                ptr.next=new1;
                ptr=ptr.next;
            }
            if(temp1.data<temp2.data){
                temp1=temp1.next;
                continue;
            }
            temp2=temp2.next;
            
        }
        return dummy.next;
    }
}