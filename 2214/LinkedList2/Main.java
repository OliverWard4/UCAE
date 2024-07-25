package LinkedList2;

public class Main {
  public static void main(String[] args) {

    // creates four node
    LinkedNode p = new LinkedNode(1);
    LinkedNode p2 = new LinkedNode(2);
    LinkedNode p3 = new LinkedNode(3);
    LinkedNode p4 = new LinkedNode(4);

    LinkedList2 list = new LinkedList2(p);
    list.push(p2);
    list.push(p3);
    list.push(p4);

    System.out.println("2d Linked List: ");
    LinkedNode temp = list.getHead();
    while (temp != null) {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }

    LinkedNode temp2 = list.pop();
    System.out.println("Deleted Node: \n" + temp2.getData() + "\nModified List");

    temp = list.getHead();
    while (temp != null) {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }

  }

}
