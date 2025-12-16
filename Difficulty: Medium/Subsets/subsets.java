class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int start=0;
        backtrack(arr,ans,temp , start);
        return ans;
    }
    public void backtrack(int arr[],ArrayList<ArrayList<Integer>> ans ,ArrayList<Integer> temp,
    int start){
        ans.add(new ArrayList<>(temp));
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            backtrack(arr,ans,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}