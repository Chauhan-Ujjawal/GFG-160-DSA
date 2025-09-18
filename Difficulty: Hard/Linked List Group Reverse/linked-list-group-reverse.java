class Solution {
    // reverse a linked list
    public static Node reverseLL(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev; // new head
    }

    // find kth node from current (agar poora group nahi mila toh last node return karega)
    public static Node traversingkth(Node head,int k){
        Node temp=head;
        k--; 
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;  // last node (even if group incomplete)
    }

    public Node reverseKGroup(Node head, int k) {
        Node temp=head;
        Node prev=null;

        while(temp!=null){
            Node kth=traversingkth(temp,k);

            Node nextNode=null;
            if(kth!=null) {
                nextNode=kth.next;
                kth.next=null; 
            }

            // reverse current group (chahe complete ho ya incomplete)
            Node reversedHead=reverseLL(temp);

            // connect with previous group
            if(temp==head){
                head=reversedHead;
            }else{
                prev.next=reversedHead;
            }

            // temp ab current group ka last node hai
            prev=temp;

            // move to next group
            temp=nextNode;
        }
        return head;
    }
}
