// User function Template for Java
import java.math.BigInteger;
class Solution {

    public static ArrayList<Integer> factorial(int n) {
        BigInteger pdt = BigInteger.ONE;
        for(int i=1;i<=n;i++){
            pdt=pdt.multiply(BigInteger.valueOf(i));
        }
        String str=pdt.toString();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int temp=ch-'0';
            list.add(temp);
        }
        return list;
    }
}