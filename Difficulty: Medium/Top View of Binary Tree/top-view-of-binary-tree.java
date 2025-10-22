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
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }

    public ArrayList<Integer> topView(Node root) {
        //make a map of integer,arrayList
        //make a pair class to save root node and horizontal distance
        //push root node 
        //run a while loop
        //if current hd is in map then append element in  corresponding array list
        //else create a new hd and new array list \
        //add left children 
        //add right children
        Map<Integer,Integer> map= new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            Pair current = q.poll();
            //storing the element that are only first time appearing on a particular index
            if(!map.containsKey(current.hd)){
                map.put(current.hd,current.node.data);
            }
            if(current.node.left!=null){
                q.offer(new Pair(current.hd-1,current.node.left));
            }
            if(current.node.right!=null){
                q.offer(new Pair(current.hd+1,current.node.right));
            }
        }
        return new ArrayList<>(map.values());
    }
}