/*Complete the function below
Node is as follows:
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
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
        if(root==null) return -1;
        // add code here.
        Node successor = null;
        Node current = root;
        while(current!=null){
            if(current!=null && x.data<current.data){
                successor = current;
                current=current.left;
            }
            else{
                current=current.right;
            }
        }
        return (successor != null) ? successor.data : -1;
    }
}