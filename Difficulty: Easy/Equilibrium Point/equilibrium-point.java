class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int left=0;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(left==sum) return i;
            left+=arr[i];
        }
        return -1;
    }
}
