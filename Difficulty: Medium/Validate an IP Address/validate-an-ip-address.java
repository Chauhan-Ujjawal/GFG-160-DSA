class Solution {
    public boolean isValid(String s) {
        // code here
        String[] words = s.split("\\.");
        if(words.length != 4) return false;
        for(int i=0;i<words.length;i++){
            if(words[i].isEmpty()) return false;
            if(words[i].length() >1 && words[i].charAt(0)=='0') return false;
            int temp=Integer.valueOf(words[i]);
            if(temp<0 || temp>255) return false;
        }
        return true;
    }
}