class StackQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void push(int B) {
        s1.push(B);
    }

    public int pop() {
        if(s1.isEmpty()) return -1;

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int x = s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return x;
    }
}
