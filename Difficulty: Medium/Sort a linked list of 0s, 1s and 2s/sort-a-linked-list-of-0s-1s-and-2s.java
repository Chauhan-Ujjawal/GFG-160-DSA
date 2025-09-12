/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        if(head==null) return null;
        Node dumZero=new Node(-1);
        Node zero=dumZero;
        Node dumOne=new Node(-1);
        Node one=dumOne;
        Node dumTwo=new Node(-1);
        Node two=dumTwo;
        Node temp= head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
                
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        if (dumOne.next != null) {
            zero.next = dumOne.next;
        } else {
            zero.next = dumTwo.next;
        }

        one.next = dumTwo.next;
        two.next = null;

        return dumZero.next;
        
    }
}