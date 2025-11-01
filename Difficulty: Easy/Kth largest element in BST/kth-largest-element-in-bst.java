/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public void helper(ArrayList<Integer> list,Node root){
        if(root==null) return;
        helper(list,root.left);
        list.add(root.data);
        helper(list,root.right);
    }
    public int kthLargest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        Collections.reverse(list);
        return list.get(k-1);
        
        
    }
}