class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int middle = low+(high-low)/2;
            if(arr[middle]==k) return true;
            else if(k>arr[middle]){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
        return false;
    }
}