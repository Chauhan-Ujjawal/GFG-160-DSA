//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int second_largest=Integer.MIN_VALUE;
        int first_largest=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=first_largest){
                second_largest=arr[i];
                break;
            }
            else second_largest=-1;
        }
        return second_largest;
    }
}