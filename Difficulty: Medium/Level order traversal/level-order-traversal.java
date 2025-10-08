/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        if(root ==null) return null;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size(); //it will givenumber of nodes in current level
            ArrayList<Integer> level= new ArrayList<>();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                level.add(current.data);
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            list.add(level);
        }
        return list;
        
    }
}