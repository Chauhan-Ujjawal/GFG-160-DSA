class Solution {
    public int celebrity(int mat[][]) {
        Stack<Integer> st = new Stack<>();
        // psuhing all over elements in stack
        for(int i=0;i<mat.length;i++){
            st.push(i);
        }
        //finding potential candidates
        while(st.size()>1){
            int A=st.pop();
            int B=st.pop();
            if(mat[A][B]==0){
                //A dozzen knows B
                st.push(A);
            }else{
                //B dozzen knows A
                st.push(B);
            }
        }
        //row check and column check
        int C = st.pop();

        // verify row
        for (int i = 0; i < mat.length; i++) {
            if (mat[C][i] == 1 && i != C) return -1;
        }

        // verify column
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][C] == 0 && i != C) return -1;
        }

        return C;
        
        
    }
}