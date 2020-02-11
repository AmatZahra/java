
class Queue{
    
	int key;
    Queue next;
     
    //new linked list node
    public Queue(int key) {
        this.key = key;
        this.next = null;
    }
}

class Node {
	
    Queue front;
    Queue rear;
      
    public Node() {
        this.front = this.rear = null;
    }
      
    //Add key to the queue  
    void enqueue(int key) {
         
        //new node
        Queue n = new Queue(key);
      
        if (this.rear == null)
        {
           this.front = this.rear = n;
           return;
        }
      
        //make the new node rear
        this.rear.next = n;
        this.rear = n;
    }
      
    //Remove key from queue  
    Queue dequeue()
    {
      
        if (this.front == null)
           return null;
      
        //make the temporary node front and move the front one node
        Queue n = this.front;
        this.front = this.front.next;
      
        if (this.front == null)
           this.rear = null;
        return n;
    }
}
