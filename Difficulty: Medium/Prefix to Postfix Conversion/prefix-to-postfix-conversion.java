import java.util.Stack;

class Solution {
    static String preToPost(String pre_exp) {
        Stack<String> st = new Stack<>();
        for (int i = pre_exp.length() - 1; i >= 0; i--) {
            char ch = pre_exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } 
            else {
                String op1 = st.pop();  // first operand (left)
                String op2 = st.pop();  // second operand (right)
                String exp = op1 + op2 + ch;  // postfix = operand1 operand2 operator
                st.push(exp);
            }
        }

        // Final element in stack is the postfix expression
        return st.pop();
    }
}
