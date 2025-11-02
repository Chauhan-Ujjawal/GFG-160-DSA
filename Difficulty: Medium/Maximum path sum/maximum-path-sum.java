/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int maxSum;
    public int helper(Node root){
        if(root==null) return 0;
        int lftsum=Math.max(0,helper(root.left)); //to ignore negative child sums
        int rhtsum=Math.max(0,helper(root.right));
        int case1 = lftsum + rhtsum + root.data;
        int case2 = Math.max(lftsum, rhtsum) + root.data;
        int case3 = root.data;
        // <-- compare with existing maxSum instead of overwriting
        maxSum = Math.max(maxSum, Math.max(case1, Math.max(case2, case3)));
        return Math.max(case2, case3);
    }
    int findMaxSum(Node root) {
        maxSum=Integer.MIN_VALUE;
        helper(root);
        return maxSum;

    }
}
