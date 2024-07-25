package Stack1D;

public class Main {
  public static void main(String[] args) {

    // creates four node
    LinkedNode p = new LinkedNode(1);
    LinkedNode p2 = new LinkedNode(2);
    LinkedNode p3 = new LinkedNode(3);
    LinkedNode p4 = new LinkedNode(4);

    Stack s1 = new Stack(p);
    s1.push(p2);
    s1.push(p3);
    s1.push(p4);

    while (s1.getSize() > 0) {

      System.out.println(s1.pop().getData());
    }

  }
}