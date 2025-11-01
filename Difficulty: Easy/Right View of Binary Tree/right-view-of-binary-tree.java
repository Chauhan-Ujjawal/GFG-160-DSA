/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.offer(root);
        int j=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node current = q.poll();
                if(i==size-1) list.add(current.data);
                if(current.left!=null) q.offer(current.left);
                if(current.right!=null) q.offer(current.right);
            }
        }
        return list;
    
        
    }
}