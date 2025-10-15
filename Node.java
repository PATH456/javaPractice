public class Node {
    
	private   int data;
	protected Node next;

	public Node () {
		this.data = 0;
		this.next = null;
	}

	public Node (int value) {
		this.data = value;
		this.next = null;
	}

	/* Purpose:  get the data value of this Node
	 * Parameters: nothing
	 * Returns:  int - the data value
	 */
	public int getData() {
		return data;
	}

	/* Purpose:  set the data value of this Node to data
	 * Parameters: int - data	 
	 * Returns:  nothing
	 */
	public void setData(int data) {
		this.data = data;
	}

	/* Purpose:  get the next of this Node
	 * Parameters: nothing
	 * Returns:  Node - reference to next node in list
	 */
	public Node getNext() {
		return next;
	}

	/* Purpose:  set the next of this Node to next
	 * Parameters: Node next
	 * Returns:  nothing
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}















