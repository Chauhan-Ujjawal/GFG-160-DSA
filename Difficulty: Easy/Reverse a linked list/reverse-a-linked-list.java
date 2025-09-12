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
    Node reverseList(Node head) {
        if(head==null) return null;
        // code here
        Node temp = head ;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next= prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}