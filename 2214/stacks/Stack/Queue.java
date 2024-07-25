package Stack;

public class Queue {

    LinkedNode head;
    LinkedNode rear;
    int size = 0;

    // Constructor
    public Queue(LinkedNode head) {
        this.head = head;
        rear = head;
    }

    public Queue(int data, LinkedNode pointer) {
        LinkedNode temp = new LinkedNode(data, pointer);
        head = temp;
        rear = temp;
    }

    // returns the next node from a node
    public LinkedNode peek() {
        return head;
    }

    public void push(LinkedNode node) {
        head.setNext(node);
        rear = node;
    }

    // sets the next from a given node
    public void setNext(LinkedNode node, LinkedNode newNode) {
        node.setNext(newNode);
    }

}
