//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        ArrayList<Integer> list = new ArrayList<>();
        while(!s.isEmpty()){
            list.add(s.pop());
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            s.push(list.get(i));
        }
        return s;
    }
}