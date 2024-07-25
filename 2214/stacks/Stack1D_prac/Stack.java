package Stack1D_prac;

public class Stack {

    LinkedNode head;
    int size = 0;

    // Constructor
    public Stack(LinkedNode head) {
        this.head = head;
        size++;
    }

    public Stack(int data, LinkedNode pointer) {
        LinkedNode temp = new LinkedNode(data, pointer);
        head = temp;
        size++;
    }

    // add a node to the stack
    public void push(LinkedNode node) {
        // code goes here
    }

    // removes a node forom the stack
    public LinkedNode pop() {
        // code goes here
    }

    // looks at the top
    public LinkedNode peek() {
        // code goes here
    }

    public int getSize() {

        return size;
    }
}
