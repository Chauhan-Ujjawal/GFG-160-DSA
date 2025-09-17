/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        Node prev=null;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    prev=prev.next;
                    slow=slow.next;
                    fast=fast.next;
                }
                prev.next=null;
            }
        }
    }
}