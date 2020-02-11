public class QueueArray {
	
	int front, rear, size;
	int [] qArray;
	
	public QueueArray() {
		front = 0;
		rear = front + 1;
		qArray = new int[0];
	}

	//if empty
	public boolean isEmpty() {
		 return (qArray[front] == 0);
	}

	//if full
	public void enqueue(String str) {
	if(!isFull())
            return;
		front = (front + 1)%qArray.length;
		qArray[front] = null;
		size++;
		} 

	private boolean isFull() {
		return size == qArray.length;
	}
	
	public Integer dequeue() {
		
		if(!isEmpty()) {
			
			for(int i=0; i < qArray.length;i++) {
		
				Integer value=qArray[rear];
				qArray[rear] = null;
				rear = (rear+1) % qArray.length;
				size--;
				return value;
				}
			}
		    else {
		    	return (Integer) null;
		    	}
				return this.qArray[this.front];
		 
	}
}