//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        //observation
        //case1: all elements are positive(multiply all)
        //case2: even number of -ve elements (multipla all)
        //case3: odd number of negative (eliminate any one negative element and find prefix and suffix product)
        //case4: if array contains 0 then reset product to 1 
        int suffix = 1, prefix = 1 , maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(prefix==0) prefix=1; 
            if(suffix==0) suffix=1;
            prefix=prefix*arr[i];
            suffix=suffix*arr[arr.length-i-1];
            maxi=Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;

    }
}