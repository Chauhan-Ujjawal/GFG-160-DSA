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
    public Node swapKth(Node head, int k) {
        // calculating length of linkedlist
        if(head==null) return null;
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count<k) return head;
        temp=head;
        //kth node from start
        for(int i=0;i<(k-1);i++){
            temp=temp.next;
        }
        Node kth=temp;
        temp=head;
        //kth node from end
        for(int i=0;i<(count-k);i++){
            temp=temp.next;
        }

        int temp2=temp.data;
        temp.data=kth.data;
        kth.data=temp2;
        return head;
    }
}
