class Solution {
    public static void permutation(Set<String> set, boolean[] arr, String s, int index, StringBuilder sb) {
        if (index == s.length()) {
            set.add(sb.toString()); // duplicate handle yahin
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!arr[i]) {
                arr[i] = true;
                sb.append(s.charAt(i));
                permutation(set, arr, s, index + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
                arr[i] = false;
            }
        }
    }

    public ArrayList<String> findPermutation(String s) {
        Set<String> set = new HashSet<>();
        boolean[] arr = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        permutation(set, arr, s, 0, sb);
        return new ArrayList<>(set); // Set -> ArrayList
    }
}
