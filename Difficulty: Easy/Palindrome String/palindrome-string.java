class Solution {
    boolean isPalindrome(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j && j<s.length()){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;

    }
}