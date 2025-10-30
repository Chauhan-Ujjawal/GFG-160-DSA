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
    public void helper(ArrayList <Integer> list , Node root){
        if(root==null) return;
        list.add(root.data);
        helper(list,root.left);
        helper(list,root.right);
    }
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        return list;
        
    }
}