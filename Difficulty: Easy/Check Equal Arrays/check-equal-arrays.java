class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        if(a.length!=b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<a.length){
            if(a[i]!=b[i]) return false;
            i++;
        }
        return true;
        
    }
}