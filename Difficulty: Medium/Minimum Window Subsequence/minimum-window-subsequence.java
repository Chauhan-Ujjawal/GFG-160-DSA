class Solution {
    public String minWindow(String s1, String s2) {
         int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        int i = 0;

        while (i < s1.length()) {
            int j = 0;

            // Forward scan
            while (i < s1.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                    if (j == s2.length()) break;
                }
                i++;
            }

            if (j < s2.length()) break;

            int end = i;

            // Backward shrink (FIXED)
            j = s2.length() - 1;
            while (i >= 0 && j >= 0) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j--;
                }
                if (j >= 0) {
                    i--;
                }
            }

            i++; // correct start index
            int winlen = end - i + 1;

            if (winlen < minLen) {
                minLen = winlen;
                startIndex = i;
            }

            i++; // move forward
        }

        if (startIndex == -1) return "";
        return s1.substring(startIndex-1, startIndex + minLen);
    }
}
