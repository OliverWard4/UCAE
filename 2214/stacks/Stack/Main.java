package Stack;

public class Main {
  public static void main(String[] args) {

    // creates four node
    LinkedNode p = new LinkedNode(1);
    LinkedNode p2 = new LinkedNode(2);
    LinkedNode p3 = new LinkedNode(3);
    LinkedNode p4 = new LinkedNode(4);

    // sets the first nodes pointer to the second, and so forth
    p.setNext(p2);
    p2.setNext(p3);
    p3.setNext(p4);

    // creates a temporary node to pointer to each object in the list and print it
    LinkedNode temp = p;

    // while temp is not null th elist will iterate
    while (temp != null) {
      // prints the data of temp
      System.out.println(temp.getData());
      // sets temp equal to the following value in the list, (like incrementing a
      // counter)
      temp = temp.next();
    }

  }
}