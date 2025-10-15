package javaPractice;
public class Stack {
    int INITIAL_SIZE = 4;
    int[] data;
    int top;
    public Stack() {
        data = new int[INITIAL_SIZE];
        top = -1;

    }

    public void copyArray() {
        int[] newArray = new int[data.length *2];
        for (int i =0; i< data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public void push(int value) {
        top++;
        if (top == data.length) {
            copyArray();
            data[top] = value;
        } else {
            data[top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[top--];
        }
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}