class Solution {
    public int kthSmallest(Node root, int k) {
        if(root==null) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        Node current = root ;
        while(current!=null){
            if(current.left==null){
                //then add current and move right
                list.add(current.data);
                current=current.right;
            }
            else{
                Node runner = current.left ;
                while(runner.right!=null && runner.right!=current){
                    runner=runner.right;
                }
                if(runner.right==null){
                    runner.right=current;
                    current=current.left;
                }
                else{
                    runner.right=null;
                    list.add(current.data);
                    current=current.right;
                }
            }
            
        }
        if(k > list.size()) return -1;
        return list.get(k-1);
    }
}