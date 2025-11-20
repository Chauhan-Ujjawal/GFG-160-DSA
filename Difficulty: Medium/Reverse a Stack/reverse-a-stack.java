class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        int n=st.size();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
    }
}
