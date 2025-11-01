/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        //we will return -1 from our helper function if tree is not balanced.
        //if checkheight!=-1 that means the tree is balanced otherwise not.
        return checkheight(root)!=-1;
    }
    public int checkheight(Node root){
        if(root==null) return 0;
        int lh=checkheight(root.left);
        if(lh==-1) return -1;
        int rh=checkheight(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return 1+Math.max(lh,rh);
    }
}