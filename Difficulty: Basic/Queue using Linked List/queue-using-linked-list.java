// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node start;
    Node end;

    public myQueue() {
       start=null;
       end=null;
    }

    public boolean isEmpty() {
        return start==null && end==null;
    }

    public void enqueue(int x) {
        if(isEmpty()){
            Node new1=new Node(x);
            start=new1;
            end=new1;
            return;
        }
        Node new1= new Node(x);
        end.next=new1;
        end=new1;
    }

    public void dequeue() {
        if(isEmpty()) return;
        else if(start.next==null){
            start=null;
            end=null;
            return;
        }
        start=start.next;
    }

    public int getFront() {
        if(isEmpty()) return -1;
        return start.data;
    }

    public int size() {
        if(isEmpty()) return 0;
        Node dummy=start;
        int count=0;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        return count;
    }
}
