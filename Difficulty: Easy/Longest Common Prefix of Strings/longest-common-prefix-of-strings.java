// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        char[] first=arr[0].toCharArray();
        char[] last=arr[arr.length-1].toCharArray();
        int n=Math.min(first.length,last.length);
        for(int i=0;i< n;i++){
            if(first[i]!=last[i]) break;
            sb.append(first[i]);
        }
        return sb.toString();
    }
}