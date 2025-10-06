// User function Template for Java

class Solution {
    public static int leftDepth(Node root){
        int dep1=0;
        while(root!=null){
            root=root.left;
            dep1++;
        }
        return dep1;
    }
    public static int rightDepth(Node root){
        int dep2=0;
        while(root!=null){
            root=root.right;
            dep2++;
        }
        return dep2;
    }
    public static int countNodes(Node root) {
        if(root==null) return 0;
        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);
        if(leftDepth==rightDepth) return (int) Math.pow(2,rightDepth)-1;
        if(leftDepth!=rightDepth) return 1+countNodes(root.left)+countNodes(root.right);
        return 0;
    }
}