class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char pt=s.charAt(i);
            if(pt=='(' || pt=='{' || pt=='['){
                st.push(pt);
            }
            else{
                if(st.isEmpty()) return false;
                char ch=st.pop();
                if(pt==')' && ch=='(' || pt=='}' && ch=='{' || pt==']' && ch=='['){
                    continue;
                }else{
                    return false;
                }
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
