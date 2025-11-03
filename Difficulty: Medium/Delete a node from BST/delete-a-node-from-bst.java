/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node rightmost(Node root){
        if(root.right==null) return root;
        return rightmost(root.right);
    }
    public Node helper(Node root){
    if(root.left == null) return root.right;
    if(root.right == null) return root.left;

    // find rightmost node in left subtree (inorder predecessor)
    Node leftlastchild = rightmost(root.left);

    // if predecessor is the immediate left child, just attach right subtree
    if(leftlastchild == root.left){
        leftlastchild.right = root.right;
        return leftlastchild;
    }

    // otherwise we must find predecessor's parent to detach predecessor properly
    Node parent = root.left;
    while(parent.right != leftlastchild){
        parent = parent.right;
    }

    // detach predecessor from its old parent and replace parent's right with pred.left
    parent.right = leftlastchild.left;

    // attach original left and right subtrees to predecessor
    leftlastchild.left = root.left;
    leftlastchild.right = root.right;

    return leftlastchild;
}

    public Node delNode(Node root, int x) {
        if(root==null) return null;
        Node crnt=root;
        if(crnt.data==x) return helper(crnt);
        while(crnt!=null){
            if(crnt.data>x){
                if(crnt.left!=null && crnt.left.data==x){
                    crnt.left=helper(crnt.left);
                    break;
                }
                else{
                    crnt=crnt.left;
                }
            }
            else{
                if(crnt.right!=null && crnt.right.data==x){
                    crnt.right=helper(crnt.right);
                    break;
                }
                else{
                    crnt=crnt.right;
                }
            }
        }
        return root;
    }
}