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
    public Node insert(Node root, int key) {
        if(root==null) return new Node(key);
        Node current = root;
        while(current!=null){
            if(current.data<key){
                if(current.right!=null){
                    current=current.right;
                }
                else{
                    current.right= new Node(key);
                    break;
                } 
            }
            else{
                if(current.left!=null){
                    current=current.left;
                }
                else{
                    current.left=new Node(key);
                    break;
                } 
            }
        }
        return root;
        
    }
}
