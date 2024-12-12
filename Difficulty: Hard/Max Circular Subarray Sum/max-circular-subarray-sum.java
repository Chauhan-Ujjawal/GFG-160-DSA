//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    static int minkadane(int arr[]){
        int sum=arr[0];
        int minsum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.min(sum+arr[i],arr[i]);
            minsum=Math.min(minsum,sum);
        }
        return minsum;
        
    }
    static int maxkadane(int arr[]){
        //if the maximum sum subarray lies within the array instead of circular sub array 
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(sum+arr[i],arr[i]);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
        
    }

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        //calculating entire sum of the array 
        //subtracting minimum sum S1 fro total sum to get the maximum sum of circular subarray
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
        }
        int minsum=minkadane(arr);
        int maxsum=maxkadane(arr);
        int circularsum=sum1-minsum;
        if(maxsum>0){
            return Math.max(circularsum,maxsum);
        }
        return circularsum;
        
    }
}
