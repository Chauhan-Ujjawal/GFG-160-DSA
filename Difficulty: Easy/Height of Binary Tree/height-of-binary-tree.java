/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        if(root==null) return -1;
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
        
    }
}