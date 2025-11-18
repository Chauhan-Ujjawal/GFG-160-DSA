class Solution {
    public int maxWater(int arr[]) {
        // code here
        int[] left=new int[arr.length];
        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        //making right array
        int[] right=new int[arr.length];
        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int rainwater=0;
        for(int i=0;i<arr.length;i++){
            rainwater+=Math.min(left[i],right[i])-arr[i];
        }
        return rainwater;
    }
}
