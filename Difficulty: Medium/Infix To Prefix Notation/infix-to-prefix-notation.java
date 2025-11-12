

class Solution {

    // Step 1: Define precedence function
    static int precedence(char c) {
        if (c == '^') return 3;
        else if (c == '*' || c == '/') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }

    // function to check if operator is right-associative
    static boolean isRightAssociative(char c) {
        return c == '^';
    }

    // function to check if a character is an operator
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // function to convert infix expression to prefix
    static String infixToPrefix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        // scan from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c == ')') {
                st.push(c);
            }
            else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    result.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            }
            else if (isOperator(c)) {
                while (!st.isEmpty() && isOperator(st.peek()) &&
                      (precedence(st.peek()) > precedence(c) ||
                      (precedence(st.peek()) == precedence(c) && isRightAssociative(c)))) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // pop remaining operators
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        // reverse to get correct prefix
        return result.reverse().toString();
    }



}
