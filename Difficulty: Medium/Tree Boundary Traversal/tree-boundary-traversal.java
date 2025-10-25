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
    //function to check if a node is a leaf node
    public static boolean isLeaf(Node root){
        return (root.left==null &&  root.right==null);
    }
    public static void printLeft(ArrayList<Integer> list,Node root){
        if(root==null) return;
        Node current = root.left;
        while(current!=null){
            //if current is not leaf node then add it in tree
            if(!isLeaf(current)) list.add(current.data);
            if(current.left!=null) current=current.left;
            else current=current.right;
        }
    }
    public static void printLeaf(ArrayList<Integer> list,Node root){
        if(root==null) return;
        if(isLeaf(root)) list.add(root.data);
        printLeaf(list,root.left);
        printLeaf(list,root.right);
    }
    public static void printRight(ArrayList<Integer> list, Node root){
        if(root==null) return;
        Node current = root.right;
        Stack<Integer> st = new Stack<>();
        while(current!=null){
            if(!isLeaf(current)) st.push(current.data);
            if(current.right!=null) current=current.right;
            else current = current.left;
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }
    }
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        if(!isLeaf(root)) list.add(root.data);
        //adding left boundary in our arraylist
        printLeft(list,root);
        //adding leaf nodes in our arraylist
        printLeaf(list,root);
        //addinf right nodes in our arrylist
        printRight(list,root);
        return list;
        
    }
}