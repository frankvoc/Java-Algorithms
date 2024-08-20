
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		IntSLList ll = new IntSLList();			//Create initial linked list
		ll.addToHead(8);						//Add this to the start
		ll.addToHead(7);
        ll.addToTail(-12);						//Add this to the start (shifting 8 to middle)
		ll.addToTail(20);						//Add this at the end
		ll.printAll();							//Print to prove our logical point

	}

}
