/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public static void helper(ArrayList<Integer> list,Node root){
        if(root==null) return;
        if(root!=null) list.add(root.data);
        helper( list,root.left);
        helper(list,root.right);
    }
    public int kthSmallest(Node root, int k) {
        if(root==null) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        Collections.sort(list);
        if(k>list.size()) return -1;
        return list.get(k-1);
    }
}