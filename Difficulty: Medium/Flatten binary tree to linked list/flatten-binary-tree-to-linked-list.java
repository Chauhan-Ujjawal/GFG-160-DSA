// User function Template for Java

class Solution {
    public static void flatten(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node current = st.pop();
            if(current.right!=null) st.push(current.right);
            if(current.left!=null) st.push(current.left);
            if(!st.isEmpty()) current.right=st.peek();
            current.left=null;
        }
    }
}