/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public static Node maketree(int[] postorder,int post_start,int post_end,int[] inorder, int in_start,int in_end,Map<Integer,Integer> map){
        if(post_start>post_end || in_start>in_end)  return null;
        Node root = new Node(postorder[post_end]);
        int index_root_inorder=map.get(root.data);
        int remaining_left=index_root_inorder-in_start;
        root.left=maketree(postorder,post_start,post_start+remaining_left-1,inorder,in_start,index_root_inorder-1,map);
        root.right=maketree(postorder,post_start+remaining_left,post_end-1,inorder,index_root_inorder+1,in_end,map);
        return root;
    }
    Node buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length) return null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        Node root = maketree(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
        return root;
        
    }
}