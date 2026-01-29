class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        if(s1.length()==1) return false;
        int n=s1.length();
        
        String s3=s1.substring(2)+s1.substring(0,2);
        String s4 = s1.substring(n-2)+s1.substring(0,n-2);
        return s3.equals(s2) || s4.equals(s2);
        
    }
}