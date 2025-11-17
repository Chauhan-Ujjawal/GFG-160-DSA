class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        int n = arr.length;
        if (n == 0) return new ArrayList<>();

        int[] res = new int[n];          // primitive array for speed
        Stack<Integer> st = new Stack<>(); // you wanted to keep Stack

        for (int i = 2 * n - 1; i >= 0; i--) {
            int value = arr[i % n];

            // pop all values <= current
            while (!st.isEmpty() && st.peek() <= value) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek();
                }
            }

            st.push(value);
        }

        ArrayList<Integer> list = new ArrayList<>(n);
        for (int x : res) {
            list.add(x);
        }
        return list;
        
        
       
        
       
    }
}