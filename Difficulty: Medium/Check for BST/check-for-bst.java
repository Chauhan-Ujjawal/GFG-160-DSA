/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        return isBST(Long.MIN_VALUE,Long.MAX_VALUE,root);
    }
    public boolean isBST(Long minval , Long maxval , Node root){
        if(root==null) return true;
        if(root.data<=minval || root.data >=maxval) return false;
        return isBST(minval,(long) root.data,root.left) && isBST((long) root.data,maxval,root.right);
    }
}