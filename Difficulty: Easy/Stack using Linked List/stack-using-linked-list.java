// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
  

    



class myStack {
    class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    Node top;
    public myStack() {
        top=null;
    }

    public boolean isEmpty() {
        return top==null;
    }

    public void push(int x) {
       if(top==null){
           Node new1=new Node(x,null);
           top=new1;
           return;
       }
       Node new1=new Node(x,top);
       top=new1;
       return;
    }

    public void pop() {
        if(top.next!=null){
            top=top.next;
            return;
        }
        top=null;
        
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(top!=null) return top.data;
        return -1;
    }

    public int size() {
        Node dumy=top;
        int counter=0;
        while(dumy!=null){
            counter++;
            dumy=dumy.next;
        }
        return counter;
    }
}
