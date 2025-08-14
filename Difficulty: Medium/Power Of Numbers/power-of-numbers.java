class Solution {
    public int reverseExponentiation(int n) {
        String str = String.valueOf(Math.abs(n)); 
        String reversedStr = new StringBuilder(str).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);
        
        if( reversedNum == 1) return n;
        n=(int)Math.pow(n,reversedNum);
        return n;
        
    }
}
