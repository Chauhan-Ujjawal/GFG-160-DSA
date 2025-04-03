//{ Driver Code Starts
import java.util.*;

class TwoStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            twoStacks g = new twoStacks();
            int Q = sc.nextInt();
            while (Q > 0) {
                int stack_no = sc.nextInt();
                int QueryType = sc.nextInt();

                if (QueryType == 1) {
                    int a = sc.nextInt();
                    if (stack_no == 1)
                        g.push1(a);
                    else if (stack_no == 2)
                        g.push2(a);
                } else if (QueryType == 2) {
                    if (stack_no == 1)
                        System.out.print(g.pop1() + " ");
                    else if (stack_no == 2)
                        System.out.print(g.pop2() + " ");
                }

                Q--;
            }
            System.out.println();
            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class twoStacks {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2= new Stack<>();
    twoStacks() {}

    // Function to push an integer into the stack1.
    void push1(int x) {
        stack1.push(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        stack2.push(x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        int temp=-1;
        if(!stack1.isEmpty()) temp=stack1.pop();
        return temp;

    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        int temp2=-1;
        if(!stack2.isEmpty()) temp2=stack2.pop();
        return temp2;
        // code here
    }
}
