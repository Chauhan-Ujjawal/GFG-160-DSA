// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        if(exp.length()=='0') return exp;
        Stack<String> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            //pushing in stack if it is an operand
            if(Character.isLetterOrDigit(ch)) st.push(String.valueOf(ch));
            else{
                String operand1=st.pop();
                String operand2=st.pop();
                String exp1="("+operand1+ch+operand2+")";
                st.push(exp1);
            }
          
            
        }
       StringBuilder sb= new StringBuilder(st.pop()).reverse();
       for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)==')'){
               sb.setCharAt(i,'(');
               continue;
           }
           if(sb.charAt(i)=='('){
               sb.setCharAt(i,')');
               continue;
           }
       }
       return sb.toString();
        
    }
}
