/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int minValue(Node root) {
        //returning left most element of left subtree;
        if(root.left==null && root.right==null) return root.data;
        if(root.left==null && root.right!=null) return root.data;
        while(root.left!=null){
            root=root.left;
        }
        return root.data;

        
    }
}