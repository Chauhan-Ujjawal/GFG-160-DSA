// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<N;i++){
            //there is only one case for destruction
            //when stack top is >0 and current element is <0
            Boolean alive = true;
            int curr=asteroids[i];
            while(!st.isEmpty() && curr<0 && st.peek()>0 && alive){
                int sum=curr+st.peek();
                if(sum>0){
                    //current margya
                    alive=!alive;
                    break;
                }else if(sum==0){
                    //margya current yaha bhi
                    alive=!alive;
                    st.pop();
                    break;
                }else{
                    st.pop();
                }
            }
            if(alive) st.push(asteroids[i]);
        }
        int[] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}
