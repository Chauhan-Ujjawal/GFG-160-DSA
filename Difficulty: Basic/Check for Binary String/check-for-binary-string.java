class Solution {
    boolean isBinary(String s) {
        // Your code here
        for(int i=0;i<s.length();i++){
            int temp = s.charAt(i)-'0';
            if(temp!=1 && temp!=0){
                return false;
            }
        }
        return true;
    }
}