class SpecialStack {
    //using abstract map
    Stack<Map.Entry<Integer,Integer>> st;
    public SpecialStack() {
        st=new Stack<>();
    }

    public void push(int x) {
        if(st.isEmpty()){
            st.push(new AbstractMap.SimpleEntry<>(x,x));
            return;
        }
        st.push(new AbstractMap.SimpleEntry<>(x,Math.min(x,st.peek().getValue())));
        return;
    }

    public void pop() {
        // Remove the top element from the Stack
        st.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(st.isEmpty()) return -1;
        return st.peek().getKey();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(st.isEmpty()) return -1;
        return st.peek().getValue();
    }
}