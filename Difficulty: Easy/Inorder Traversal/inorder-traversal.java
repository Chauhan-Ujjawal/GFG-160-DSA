/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // using morris traversal
        ArrayList<Integer> inorder = new ArrayList<>();
        Node current = root;
        while(current!=null){
            if(current.left==null){
                inorder.add(current.data);
                current=current.right;
            }
            else{
                //going at rightmost node of left subtree 
                Node runner=current.left;
                while(runner.right!=null && runner.right!=current){
                    runner=runner.right;
                }
                //reached rightmost node
                if(runner.right==null){
                    //if righgtmost is null thread it and move current to left
                    runner.right=current;
                    current=current.left;
                }
                else{
                    //if rightmost is not null then it has been visited and remove 
                    //thread and move right
                    runner.right=null;
                    inorder.add(current.data);
                    current=current.right;
                }
            }
        }
        return inorder;
        
    }
}