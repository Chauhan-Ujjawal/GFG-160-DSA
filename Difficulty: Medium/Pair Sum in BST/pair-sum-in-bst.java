/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    boolean findTarget(Node root, int target) {
        inorder(root);
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if((list.get(i)+list.get(j))==target) return true;
            else if(list.get(i)+list.get(j)<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}