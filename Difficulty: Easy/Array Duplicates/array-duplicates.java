class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        
        ArrayList<Integer> list =  new ArrayList<>();
        if(arr.length==0) return list;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length && arr[i]==arr[i+1]){
                list.add(arr[i]);
            }
        }
        return list;
        
    }
}