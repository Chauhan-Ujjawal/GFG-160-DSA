/*
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        if(root==null || root.data==n1 || root.data==n2) return root;
        Node left1=lca(root.left,n1,n2);
        Node right1=lca(root.right,n1,n2);
        if(left1==null){
            return right1;
        }
        else if(right1==null){
            return left1;
        }
        return root;
        
    }
}

