/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public static Node maketree(int[] preorder,int pre_start,int pre_end,int[] inorder,int in_start,int in_end,Map<Integer,Integer> map){
        if(pre_start>pre_end || in_start > in_end) return null;
        Node root = new Node(preorder[pre_start]);
        int in_root=map.get(root.data);
        int remaining_left=in_root-in_start;
        root.left=maketree(preorder,pre_start+1,pre_start+remaining_left,inorder,in_start,in_root-1,map);
        root.right=maketree(preorder,pre_start+remaining_left+1,pre_end,inorder,in_root+1,in_end,map);
        return root;
    }
    public static Node buildTree(int inorder[], int preorder[]) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<inorder.length;i++){
           map.put(inorder[i],i);
       }
       Node root = maketree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
       return root;
    }
}