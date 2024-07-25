package Stack1D;

public class LinkedNode {

    private int data;
    private LinkedNode pointer;

    // constructors
    public LinkedNode(int data, LinkedNode pointer) {
        this.data = data;
        this.pointer = pointer;
    }

    public LinkedNode(int data) {
        this.data = data;
        pointer = null;
    }

    // returns the data of a node
    public int getData() {
        return data;
    }

    // sets the data of a node
    public void setData(int data) {
        this.data = data;
    }

    // returns the address of a pointer
    public LinkedNode getPointer() {
        return pointer;
    }

    // sets the address of a pointer
    public void setPointer(LinkedNode pointer) {
        this.pointer = pointer;
    }

}
