// User function Template for Java

class Solution {
    String removeDups(String s) {
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sb.length();i++){
            char ch =sb.charAt(i);
            if(set.contains(ch)){
                sb.deleteCharAt(i);
                i--;
                continue;
            }
            set.add(ch);
        }
        return sb.toString();
        
    }
}