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
    private Node first =null;
    private Node middle =null;
    private Node last =null;
    private Node prev=new Node(Integer.MIN_VALUE);
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null){
                first=prev;
                middle=root;
            }
            else{
                last=root;
            }
            
        }
        prev=root;
        inorder(root.right);
        
    }
    void correctBST(Node root) {
        first=middle=last=null;
        
        inorder(root);
        if(first!=null && last!=null){
            int t=first.data;
            first.data=last.data;
            last.data=t;
        }
        else if(first!=null && middle!=null){
            int t =first.data;
            first.data=middle.data;
            middle.data=t;
        }
        // code here.
    }
}