/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del_node) {
        Node temp=del_node;
        temp.data=temp.next.data;
        temp.next=temp.next.next;
        
        
    }
}