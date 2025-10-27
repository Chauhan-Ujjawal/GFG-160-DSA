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
    public boolean search(Node root, int key) {
        while(root!=null){
            if(root.data==key) return true;
            else if(root.data<key) root=root.right;
            else root=root.left;
        }
        return false;
        
    }
}