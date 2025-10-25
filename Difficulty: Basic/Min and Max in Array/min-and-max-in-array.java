class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[arr.length-1]);
        return list;
    }
}
