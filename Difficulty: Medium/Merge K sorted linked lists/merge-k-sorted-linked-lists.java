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
    public static Node merge(Node head1,Node head2){
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
    Node mergeKLists(Node[] arr) {
        Node head=arr[0];
        for(int i=1;i<arr.length;i++){
            head=merge(head,arr[i]);
        }
        return head;
    }
}