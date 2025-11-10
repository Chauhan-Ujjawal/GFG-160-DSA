class myStack {
    int top;
    int arr[];
    int n;
    
    public myStack(int n) {
        this.n = n;
        arr = new int[n];
        top = -1;
    }

    // 1. Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // 2. Check if full
    public boolean isFull() {
        return top == n - 1;
    }

    // 3. Push element x
    public void push(int x) {
        if (!isFull()) {
            top++;
            arr[top] = x;
        }
        // no else part, because problem guarantees all queries valid
    }

    // 4. Pop element and return it
    public int pop() {
        if (isEmpty()) {
            return -1;   // return -1 if stack empty
        } else {
            int val = arr[top];
            top--;
            return val;
        }
    }

    // 5. Peek top element
    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[top];
        }
    }
}
