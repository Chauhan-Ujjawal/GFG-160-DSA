import java.util.Stack;

public class Solution {

    // largest rectangle in a histogram (optimized stack O(n))
    static int largestHistogram(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>(); // store indices
        int max = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : arr[i]; // sentinel at end to flush stack

            // If current height is smaller than stack-top's height -> we found NSE for stack-top
            while (!st.isEmpty() && h < arr[st.peek()]) {
                int poppedIndex = st.pop();
                int height = arr[poppedIndex];

                // previous smaller element index (PSE)
                int pseIndex = st.isEmpty() ? -1 : st.peek();

                // width = NSE - PSE - 1, here NSE = i
                int width = (pseIndex == -1) ? i : (i - pseIndex - 1);

                int area = height * width;
                if (area > max) max = area;
            }

            // push current index
            st.push(i);
        }

        return max;
    }

    // maximal rectangle in binary matrix using prefix heights + histogram
    static int maxArea(int[][] mat) {
        int rows = mat.length;
        if (rows == 0) return 0;
        int cols = mat[0].length;

        // build prefix (height) matrix
        int[][] pref = new int[rows][cols];

        // first row same as input
        for (int j = 0; j < cols; j++) {
            pref[0][j] = mat[0][j];
        }

        // build heights for remaining rows
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    pref[i][j] = pref[i - 1][j] + 1;
                } else {
                    pref[i][j] = 0;
                }
            }
        }

        // each row is a histogram — compute max rectangle for each row
        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            maxArea = Math.max(maxArea, largestHistogram(pref[i]));
        }

        return maxArea;
    }

}
