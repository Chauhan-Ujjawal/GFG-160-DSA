
class Solution {
    static Boolean isPallindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
        
    static String longestPalindrome(String s) {
        int start=-1;
        int end=-1;
        int size=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(isPallindrome(s,i,j)){
                    if(size<j-i+1){
                        size=Math.max(size,j-i+1);
                    start=i;
                    end=j;
                        
                    }
                    
                }
            }
        }
        if(start==-1 || end==-1) return "";
        return s.substring(start,end+1);
        
        
    }
}