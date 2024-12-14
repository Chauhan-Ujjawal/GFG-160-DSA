//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.myAtoi(str);
            System.out.println(num);
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public int myAtoi(String s) {
        int start = 0;
        int n = s.length();
        while (start < n && s.charAt(start) == ' ') {
            start++;
        }
        if (start == n) {
            return 0;
        }
        boolean isNegative = false;
        if (s.charAt(start) == '-') {
            isNegative = true;
            start++;
        } else if (s.charAt(start) == '+') {
            start++;
        }
        int result = 0;
        while (start < n && s.charAt(start) >= '0' && s.charAt(start) <= '9') {
            int digit = s.charAt(start) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + digit;
            start++;
        }
        return isNegative ? -result : result;
    }

}