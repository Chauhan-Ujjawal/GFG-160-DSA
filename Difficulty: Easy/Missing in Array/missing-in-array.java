class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        int temp=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==temp){
                temp++;
                continue;
            }
        }
        return temp;
        
    }
}