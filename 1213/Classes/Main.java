package Classes;

public class Main {

    public static void main(String[] args) {

        Food apple = new Food();
        System.out.println(apple.toString());

        Food sub = new Food(48);
        System.out.println(sub.getCal() ); 


        Food MacnCheese = new Food(90, "kraft");
        System.out.println(MacnCheese.toString());

        Fruit pear = new Fruit(76, "Farmer", "green");
        System.out.println(pear.toString());

    }
}
