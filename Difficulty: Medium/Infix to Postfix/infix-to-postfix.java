public class Solution {
    static int precedence(char ch){
        switch(ch){
            case '^':
                return 3; 
            case '/':
            case '*':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }
    public static String infixToPostfix(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isWhitespace(ch)) continue;

            // operand -> output
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
            // left parenthesis -> push
            else if (ch == '(') {
                st.push(ch);
            }
            // right parenthesis -> pop until '('
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') st.pop(); // remove '('
            }
            // operator
            else {
                // pop while top has higher precedence
                // or same precedence and current is left-associative
                while (!st.isEmpty() && st.peek() != '(') {
                    int precTop = precedence(st.peek());
                    int precCurr = precedence(ch);

                    if (precTop > precCurr) {
                        sb.append(st.pop());
                    } else if (precTop == precCurr) {
                        // '^' is right-assoc -> do NOT pop equal-precedence '^'
                        if (ch == '^') {
                            break;
                        } else {
                            sb.append(st.pop());
                        }
                    } else {
                        break;
                    }
                }
                st.push(ch);
            }
        }

        // pop remaining operators
        while (!st.isEmpty()) {
            if (st.peek() == '(' || st.peek() == ')') st.pop();
            else sb.append(st.pop());
        }

        return sb.toString();
    }

    // quick main to test
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(s)); // expected: abcd^e-fgh*+^*+i-
    }
}
