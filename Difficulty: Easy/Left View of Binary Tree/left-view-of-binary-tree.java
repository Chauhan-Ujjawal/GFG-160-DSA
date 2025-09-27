class Solution {
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        printleftview(root, list, 0);
        return list;
    }
    void printleftview(Node root, ArrayList<Integer> list, int level) {
        if (root == null) return;
        // agar is level pe pehli baar aaye ho, toh node ka data add karo
        if (list.size() == level) {
            list.add(root.data);
        }
        // left subtree pehle traverse hoga
        printleftview(root.left, list, level + 1);
        // phir right subtree
        printleftview(root.right, list, level + 1);
    }
}
