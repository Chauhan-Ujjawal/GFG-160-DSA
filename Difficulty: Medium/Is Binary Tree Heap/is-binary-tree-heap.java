/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    boolean isHeap(Node tree) {
        if (tree == null) return true;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(tree);
        
        boolean nullSeen = false;
        
        while (!q.isEmpty()) {
            Node curr = q.poll();
            
            // Left child
            if (curr.left != null) {
                if (nullSeen || curr.left.data > curr.data) return false;
                q.offer(curr.left);
            } else {
                nullSeen = true; // after this, no child should appear
            }
            
            // Right child
            if (curr.right != null) {
                if (nullSeen || curr.right.data > curr.data) return false;
                q.offer(curr.right);
            } else {
                nullSeen = true;
            }
        }
        return true;
    }
}
