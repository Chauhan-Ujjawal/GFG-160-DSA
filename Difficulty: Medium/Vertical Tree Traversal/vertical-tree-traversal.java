/*
class Node
{
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
    //creating a custom class for storing index(hori. distance.) and pointer to current node
    static class Pair{
        int index;
        Node node;
        public Pair(int index,Node node){
            this.index=index;
            this.node=node;
        }
    }
    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        //creating a q for storing our current node with index
        Queue<Pair> q = new LinkedList<>();
        //creating a map to store arraylist corresponding to every index
        Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
        //adding root node with index in q
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            //removing pair from q for addition in list
            Pair current = q.poll();
            //agar map me already index exist krta hai toh data append krdo arrayList me
            if(map.containsKey(current.index)){
                map.get(current.index).add(current.node.data);
            }
            else{
            //agar index exist nahi krta toh index and corresponding elements arraylist ke form me add krdo map me
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(current.node.data);
                map.put(current.index,temp);
            }
            //adding next left and right elements in queue
            if(current.node.left!=null) q.add(new Pair(current.index-1,current.node.left));
            if(current.node.right!=null) q.add(new Pair(current.index+1,current.node.right));
        }
        //kya use hai iss arrayList ka
        ArrayList<ArrayList<Integer>> valuelist = new ArrayList<>(map.values());
        return valuelist;
    }
}