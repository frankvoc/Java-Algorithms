
public class IntSLLNode 
{
	//Initial Class/Blueprint
	public int info;						//Actual Data
	public IntSLLNode next;					//pointer to next Node
	
	public IntSLLNode(int i) 				//Constructor that receives data and calls overloaded ver
	{
		this(i,null);						//Start is null (very first spot, last spot)
	}
	
	
	public IntSLLNode(int i, IntSLLNode n)	//Set data and point to next node
	{
		info = i; next = n;					
	}
}
