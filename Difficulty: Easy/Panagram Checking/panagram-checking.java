class Solution {
    public static boolean checkPangram(String s) {
        // code here
        int[] arr = new int[26];
        s=s.toLowerCase();
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                int temp=ch-'a';
                arr[temp]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) return false;
        }
        return true;
    }
}