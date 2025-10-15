public class SinglyLinkedList {

	private Node head;
	private int size;

	public SinglyLinkedList() {
		head = null;
		size = 0;
	}

	/* Purpose: add i to the front of the list
	 * Parameters: int - i
	 * Returns: nothing
	 */
	public void addFront (int i) {
		Node n = new Node(i);
		n.next = head;
		head = n;
		size++;
	}

	/* Purpose: add i to the back of the list
	 * Parameters: int - i
	 * Returns: nothing
	 */
	public void addBack (int i){
		Node n = new Node(i);
		if(head == null) {
			head = n;
		} else {
			Node cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = n;
		}
		size++;
	}
	
	/* Purpose: get the size of the list
	 * Parameters: nothing
	 * Returns: int - size
	 */
	public int size () {
		return size;
	}


	/* Purpose:  get the data value at specified position in the list
	 * Parameters: int - position
	 * Returns: int - the data value
	 * Precondition: 0 <= position < list.size()
	 */
	public int get (int position) {
		Node cur = head;
		for(int i = 0; i < position; i++) {
			cur = cur.next;
		}
		return cur.getData();
	}

	/* Purpose: create a string representation of list
	 * Parameters: nothing	 
	 * Returns: String - the string representation of the list
	 */
	public String toString() {
		String s = "list contents:";
		Node cur = head;

		while(cur != null) {
			s += " " + cur.getData();
			cur = cur.next;
		}
		return s;
	}
}