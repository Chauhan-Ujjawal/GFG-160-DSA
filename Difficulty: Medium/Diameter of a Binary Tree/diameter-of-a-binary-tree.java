class Solution {
    int dmtr=0;
    public int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        dmtr=Math.max(dmtr,lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameter(Node root) {
        height(root);
        return dmtr;
        
        
        
    }
}