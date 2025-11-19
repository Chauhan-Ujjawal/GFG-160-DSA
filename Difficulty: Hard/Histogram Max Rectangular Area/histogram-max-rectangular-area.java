class Solution {
    public static int getMaxArea(int arr[]) {
        if(arr.length==0) return 0;
       //calculating previuos smaller element for every index of array
       int[] pse = new int[arr.length];
       Stack<Integer> st = new Stack<>();
       pse[0]=arr[0];
       for(int i=0;i<arr.length;i++){
           while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
               st.pop();
           }
           if(st.isEmpty()){
               pse[i]=-1;
           }else{
               pse[i]=st.peek();
           }
           st.push(i);
       }
       while(!st.isEmpty()){
           st.pop();
       }
       //making next smaller element array
       int[] nse=new int[arr.length];
       nse[arr.length-1]=arr[arr.length-1];
       for(int i=arr.length-1;i>=0;i--){
           while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
               st.pop();
           }
           if(st.isEmpty()){
               nse[i]=arr.length;
           }else{
               nse[i]=st.peek();
           }
           st.push(i);
       }
       //calculating maxarea rectangle
       int maxarea=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           int width=(nse[i]-pse[i]-1);
           maxarea=Math.max(maxarea,width*arr[i]);
       }
       return maxarea;
       
        
    }
}
