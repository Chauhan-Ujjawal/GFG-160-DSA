// User function Template for Java

class Solution {
    boolean isSubSequence(String A, String B) {
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder(A);
        while(i<A.length() && j <B.length()){
            if(A.charAt(i)==B.charAt(j)){
                sb.deleteCharAt(0);
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(sb.length()==0) return true;
        return false;
    }
}