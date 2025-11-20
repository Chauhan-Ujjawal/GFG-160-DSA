class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>(); // indices store karte hain
        ArrayList<Integer> ans = new ArrayList<>();  // yahan answers add karenge
        for (int i = 0; i < arr.length; i++) {
            // 1) Out-of-window element hatao (front se)
            int windowStart = i - k + 1;
            if (!dq.isEmpty() && dq.peekFirst() < windowStart) {
                dq.pollFirst();
            }
            // 2) Back se chhote elements hatao (decreasing order maintain karna hai)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            // 3) Current index push karo
            dq.offerLast(i);

            // 4) Jab window full ho jaye, tab answer add karo
            if (i >= k - 1) {
                ans.add(arr[dq.peekFirst()]);  // deque front is max
            }
        }

        return ans;
    }
}