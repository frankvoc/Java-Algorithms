public class IntSLList {
    protected IntSLLNode head, tail;	//Declare the Head and Tail
	
	public IntSLList() 					//Default Constructor.  Set nodes to null
	{
		head = tail = null;
	}
	
	public boolean isEmpty() 			//Checks to see if the head is null or has something
	{
		return head == null;
	}
	
	public void addToHead(int el)		//Adds data to the start of list
	{
		head = new IntSLLNode(el, head);	//Create new node with data (el) and point to former head
		if (tail == null)					//Adjust tail to shift pointer
			tail = head;
	}
	
	public void addToTail(int el) 		//Adds data to the end of the list
	{
		if (!isEmpty()) 						//If not empty/null, then tail points to new node
		{										
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		}
		else head = tail = new IntSLLNode(el);	//else, head and tail are new instance
	}
	
	
	public int deleteFromHead() 				//Remove the head Node
	{
		int el = head.info;						//If one node, null it
		if (head == tail)
			head = tail = null;
		else head = head.next;					//else point to next node
		
		return el;								//return the info being deleted
	}
	
	public int deleteFromTail() 				//Delete from the end node
	{
		int el = tail.info;						//Get the info
		if (head == tail)						//If only one node, null it
			head = tail = null;
		else 									// else...
		{
			IntSLLNode tmp;											//Create a temp node 
			for (tmp = head; tmp.next != tail; tmp = tmp.next);		//loop thru and 
			tail = tmp;													//tail points to next to last node
			tail.next = null;											// set its pointer to null
		}
		return el;								//Return deleted data
	}
	
	public void printAll() 						//Loop through linked list and prints data
	{
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.println(tmp.info + " ");
	}
	
	public boolean isInList(int el) 		//Search the list for data just to see if it exists
	{
		IntSLLNode tmp;														//temp node
		for (tmp = head; tmp != null && tmp.info != el; tmp = tmp.next);	//Loop till found/missing
		return tmp != null;													//Return if null or not
	}
	
	public void delete(int el) 								//Delete a node is it matches data
	{
		if (!isEmpty())										//if not empty...
			if (head == tail && el == head.info)			//If one node and matches...null it
				head = tail = null;
			else if (el == head.info)						//Else if match on first, point to 2nd
				head = head.next;
			else											//Else, loop thru to remove & reconnect 
			{
				IntSLLNode pred, tmp;
				for (pred = head, tmp = head.next;
				     tmp != null && tmp.info != el;
				     pred = pred.next, tmp = tmp.next);
				if (tmp != null) {
					pred.next = tmp.next;
					if (tmp == tail)
						tail = pred;
				}
			}
	}
}