class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length==0) return list;
        int maxi=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxi){
                list.add(arr[i]);
                maxi=Math.max(maxi,arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
