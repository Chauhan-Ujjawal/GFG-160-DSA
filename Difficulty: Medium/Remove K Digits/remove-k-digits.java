class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Integer> st = new Stack <>();
        for(int i=0;i<s.length();i++){
            int ch=Character.getNumericValue(s.charAt(i));
            while(!st.isEmpty() && ch<st.peek()){
                if(k==0) break;
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()>0 ? sb.toString() : "0";
    }
}