/* The structure of linked list is the following
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
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        HashSet <Integer> set = new HashSet<>();
        Node prev = head;
        set.add(head.data);
        Node temp=head.next;
        while(temp!=null){
            Node front = temp.next;
            if(set.contains(temp.data)){
                prev.next=front;
            }else{
                set.add(temp.data);
                prev=temp;
            }
            temp=front;
        }
        return head;
    }
}