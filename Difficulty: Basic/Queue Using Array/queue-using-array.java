class myQueue {
    int arr[];
    int maxsize;
    int start=-1;
    int end=-1;
    int currentsize=0;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        this.maxsize = n;
        arr= new int[n];
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return start==-1;
    }

    public boolean isFull() {
        // Check if queue is full
        return currentsize==maxsize;
    }

    public void enqueue(int x) {
        if(isFull()) return;
        else if(start==-1 && end==-1){
            start++;
            end++;
            
        }else if(currentsize<maxsize){
            end=(end+1)%maxsize;
        }
        currentsize++;
        arr[end]=x;
    }

    public void dequeue() {
        if(isEmpty()) return;
        if(currentsize==1){ //means queue is having only one element
            start=-1;
            end=-1;
        }else{
            start=(start+1)%maxsize;
        } 
        currentsize--;
    }

    public int getFront() {
        if(start!=-1) return arr[start];
        return -1;
    }

    public int getRear() {
        if(end!=-1 && end<maxsize) return arr[end];
        return -1;
    }
}
