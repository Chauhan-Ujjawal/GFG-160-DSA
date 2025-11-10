import java.util.Stack;

class myQueue {
    Stack<Integer> st = new Stack<>();

    void enqueue(int x) {
        st.push(x);
    }

    int dequeue() {
        if (st.isEmpty()) return -1;
        int top = st.pop();
        if (st.isEmpty()) {
            return top;
        }
        int front = dequeue();
        st.push(top); 
        return front;
    }

  
    int front() {
        if (st.isEmpty()) return -1;
        int top = st.pop();
        if (st.isEmpty()) {
            st.push(top); 
            return top;
        }
        int f = front(); 
        st.push(top);    
        return f;
    }

    int size() {
        return st.size();
    }
}
