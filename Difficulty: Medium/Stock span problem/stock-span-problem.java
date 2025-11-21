class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<AbstractMap.SimpleEntry<Integer,Integer>> st = new Stack <>();
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] span = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            span[i]=1;
            while(!st.isEmpty() && arr[i]>=st.peek().getKey()){
                span[i]+=st.peek().getValue();
                st.pop();
            }
            st.push(new AbstractMap.SimpleEntry<>(arr[i],span[i]));
        }
        return new ArrayList<>(Arrays.asList(span));
        
    }
}