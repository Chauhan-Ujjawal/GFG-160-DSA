/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    void helper(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        helper(root.left, list);
        list.add(root.data);
        helper(root.right, list);
    }

}