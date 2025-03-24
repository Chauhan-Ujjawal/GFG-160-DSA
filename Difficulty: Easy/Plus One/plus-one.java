//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        for (int i = N - 1; i >= 0; i--) { // Ensure we loop within bounds
            if (arr.get(i) == 9) {
                arr.set(i, 0); // Replace 9 with 0
            } else {
                arr.set(i, arr.get(i) + 1); // Increase the number
                return arr; // No need to continue
            }
        }
        // If all elements were 9, add 1 at the beginning
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1); 
        arr1.addAll(arr); // Append all 0s after 1
        return arr1;
    }
}