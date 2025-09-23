/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    public static Node reverse(Node head){
        Node prev= null;
        Node temp=head;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    Node compute(Node head) {
        // your code here
        if(head==null) return null;
        Stack<Integer> st= new Stack<>();
        Node temp= head;
        while(temp!=null){
            while(!st.isEmpty() && st.peek()<temp.data) {
                st.pop();
            }
            st.push(temp.data);
            temp=temp.next;
        }
        temp = head;
        while (!st.isEmpty()) {
        temp.data = st.pop();
        if (!st.isEmpty()) temp = temp.next;
        }
        temp.next=null;
        return reverse(head);
    }
}