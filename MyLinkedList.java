public class MyLinkedList {
    private Node head;
    private int numElements;
    private Node tail;

    public MyLinkedList() {
        head = null;
        numElements = 0;
        tail = null;
    }

    public void addBack(int value) {
        Node newNode = new Node(value);
        if (numElements == 0) {
            tail = newNode;
            head = newNode;
            numElements++;
        } else {
            tail.next = newNode;
            tail = newNode;
            numElements++;
        }
    }

    public void addFront(int value) {
        Node newNode = new Node(value);
        if (numElements == 0) {
            head = newNode;
            tail = newNode;
            numElements++;
        } else {
            newNode.next = head;
            head = newNode;
            numElements++;
        }
    }

    // public void printValue() {
    //     Node cur = head;
    //     while(cur != null) {
    //         System.out.println(cur.value);
    //         cur = cur.next; 
    //     }
    // }

    public void printValue() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.value);
        }
    }


    public void printFromIndex(int index) {
        if (index <0 || index >= numElements) {
            System.out.println("Error");
        } else {
            int count = 0;
            Node cur = head;
            while (count < index) {
                cur = cur.next;
                count++;
            }
            while(cur!= null) {
                System.out.println(cur.value);
                cur = cur.next;
            }
        }
    }







}
