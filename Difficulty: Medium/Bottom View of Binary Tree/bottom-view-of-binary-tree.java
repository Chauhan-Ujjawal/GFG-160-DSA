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
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            Pair current = q.poll();
            map.put(current.hd,current.node.data);
            if(current.node.left!=null){
                q.offer(new Pair(current.hd-1,current.node.left));
            }
            if(current.node.right!=null){
                q.offer(new Pair(current.hd+1,current.node.right));
            }
        }
        return  new ArrayList<Integer>(map.values());
        
        
    }
}