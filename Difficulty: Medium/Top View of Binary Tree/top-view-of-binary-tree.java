/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static class Pair{
        int index;
        Node node;
        public Pair(int index,Node node){
            this.index=index;
            this.node=node;
        }
    }
    static ArrayList<Integer> topView(Node root) {
        Queue<Pair> q = new ArrayDeque <>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair current = q.poll();
            if(!map.containsKey(current.index)){
                map.put(current.index,current.node.data);
            }
            if(current.node.left!=null) q.add(new Pair(current.index-1,current.node.left));
            if(current.node.right!=null) q.add(new Pair(current.index+1,current.node.right));
        }
        ArrayList<Integer> ans = new ArrayList<>(map.values());
        return ans;
    }
}