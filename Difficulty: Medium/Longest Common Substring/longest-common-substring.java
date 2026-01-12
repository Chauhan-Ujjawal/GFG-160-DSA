// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int size=Integer.MIN_VALUE;
        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
                if( s2.contains(s1.substring(i,j+1))){
                    size=Math.max(size,s1.substring(i,j+1).length());
                    
                }
            }
        }
        if(size==Integer.MIN_VALUE) return 0;
        return size;
    }
}