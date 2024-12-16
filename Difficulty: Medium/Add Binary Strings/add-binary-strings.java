//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a = sc.next();
            b = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a, b));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        StringBuilder s = new StringBuilder();
        while(i>=0 || j>=0){
            int a=i>=0?s1.charAt(i)-'0':0;
            int b=j>=0?s2.charAt(j)-'0':0;
            int total=a+b+carry;
            if(total==0){
                carry=0;
                s.append('0');
            }
            else if(total==1){
                carry=0;
                s.append('1');
            }
            else if(total==2){
                carry=1;
                s.append('0');
            }
            else{
                carry=1;
                s.append('1');
            }
            i--;
            j--;
        }
        if(carry==1){
            s.append('1');
        }
        while(s.charAt(s.length()-1)=='0'){
            s.deleteCharAt(s.length()-1);;
        }
        return s.reverse().toString();
    }
}