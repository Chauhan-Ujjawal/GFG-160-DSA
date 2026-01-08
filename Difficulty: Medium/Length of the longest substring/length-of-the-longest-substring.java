// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int size=Integer.MIN_VALUE;
        while(l<s.length() && r<s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=l){
                l=map.get(ch)+1;
            }
            map.put(ch,r);
            size=Math.max(size,r-l+1);
            r++;
        }
        return size;
    }
}