public class Q1 {
	
	//this is the head of the list
    Node head;
 
    //this is the Doubly Linked list Node
    class Node {
        int data;
        Node prev;
        Node next;
 
        Node(int d) { 
        	data = d;
       	}
    }
   
    //insert a new node after the given node
    
    public void InsertAfter(Node prev_Node, int new_data){
     
        //if the given prev_node is NULL
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
     
        Node newNode = new Node(new_data);
     
        newNode.next = prev_Node.next;   //next of new node is made next of prev_node
     
        prev_Node.next = newNode;     //next of prev_node is made as new_node
     
        newNode.prev = prev_Node;     //prev_node is made as previous of new_node
     
        if (newNode.next != null)
            newNode.next.prev = newNode;        //previous of new_node's next node is changed
    }}
