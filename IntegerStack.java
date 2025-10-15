public class IntegerStack implements Stack {
	
	private static final int CAPACITY = 10;
	
	private int[] data;
	private int top;
	
	public IntegerStack() {
		data = new int[CAPACITY];
		top = 0;
	}
	
	public void push(int v) {
		if (top == data.length) {
			int[] newArray = new int[data.length * 2];
			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}
			data = newArray;
			data[top] = v;
			top++;
		} else {
			data[top] = v;
			top++;
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			top--;
			return data[top];
		} 
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int peek() {
		return data[top-1];
	}

	public int size() {
		return top;
	}

}