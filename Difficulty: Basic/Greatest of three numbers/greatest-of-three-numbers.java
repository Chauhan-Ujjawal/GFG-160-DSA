class Solution {
    public int greatestOfThree(int a, int b, int c) {
        // code here
        if(a>b){
            int j=a;
            if(j>c) return j;
            else return c;
        }else{
            int j=b;
            if(j>c) return j;
            else return c;
        }
    }
}
