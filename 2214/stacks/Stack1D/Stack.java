package Stack1D;

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
        node.setPointer(head);
        head = node;
        size++;
    }

    // removes a node forom the stack
    public LinkedNode pop() {
        LinkedNode temp = head;
        head = head.getPointer();
        size--;
        return temp;
    }

    // looks at the top
    public LinkedNode peek() {
        return head;
    }

    public int getSize() {

        return size;
    }
}
