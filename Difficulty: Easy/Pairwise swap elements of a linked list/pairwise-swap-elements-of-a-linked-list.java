/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        if(head==null) return null;
        Node dummyNode = new Node(-1);
        dummyNode.next=head;
        Node ptr=dummyNode;
        while(ptr.next!=null && ptr.next.next!=null){
            Node node1=ptr.next;
            Node node2=ptr.next.next;
            //swapping
            node1.next=node2.next;
            node2.next=node1;
            
            ptr.next=node2;
            ptr=node1;
         
        }
        return dummyNode.next;
    }
}