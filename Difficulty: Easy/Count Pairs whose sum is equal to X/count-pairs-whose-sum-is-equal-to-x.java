// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

import java.util.HashSet;

class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        HashSet<Integer> set = new HashSet<>();
        Node temp2 = head2;
        while(temp2 != null){
            set.add(temp2.data);
            temp2 = temp2.next;
        }
        int count = 0;
        Node temp1 = head1;
        while(temp1 != null){
            if(set.contains(x - temp1.data)){
                count++;
            }
            temp1 = temp1.next;
        }
        return count;
    }
}
