class Solution {
    public String reverse(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            sb.append(S.charAt(i));
        }
        return sb.reverse().toString();
    }
}