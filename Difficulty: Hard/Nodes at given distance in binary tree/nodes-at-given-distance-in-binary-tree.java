class Solution {
    static Node target_node = null;

    // Step 1: Map every node's parent and locate target node
    public static void createparent(int target, Map<Node, Node> parents, Node root) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node current = q.poll();
            if (current.data == target) target_node = current;

            if (current.left != null) {
                parents.put(current.left, current);  // ✅ Correct mapping
                q.offer(current.left);
            }
            if (current.right != null) {
                parents.put(current.right, current);  // ✅ Correct mapping
                q.offer(current.right);
            }
        }
    }

    // Step 2: BFS from target node till distance k
    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        Map<Node, Node> parents = new HashMap<>();
        createparent(target, parents, root);

        int current_level = 0;
        Map<Node, Boolean> visited = new HashMap<>();

        Queue<Node> q2 = new ArrayDeque<>();
        q2.offer(target_node);
        visited.put(target_node, true);

        while (!q2.isEmpty()) {
            int size = q2.size();
            if (current_level == k) break;
            current_level++;

            for (int i = 0; i < size; i++) {
                Node current = q2.poll();

                if (current.left != null && visited.get(current.left) == null) {
                    q2.offer(current.left);
                    visited.put(current.left, true);
                }

                if (current.right != null && visited.get(current.right) == null) {
                    q2.offer(current.right);
                    visited.put(current.right, true);
                }

                if (parents.get(current) != null && visited.get(parents.get(current)) == null) {
                    q2.offer(parents.get(current));
                    visited.put(parents.get(current), true);
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!q2.isEmpty()) {
            ans.add(q2.poll().data);
        }

        Collections.sort(ans);
        return ans;
    }
}
