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
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public Node addOne(Node head) {
        if (head == null) return new Node(1);
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while (temp != null) {
            int sum=temp.data+carry;
            carry=sum/10;
            sum=sum%10;
            temp.data=sum;
            temp=temp.next;
        }
        if(carry==1){
            Node new1=new Node(carry);
            head=reverse(head);
            new1.next=head;
            return new1;
        }
        return reverse(head);
    }
}
