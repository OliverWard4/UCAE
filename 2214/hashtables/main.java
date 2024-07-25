package hashtables;

public class main {
    public static void main(String[] args) {

        hashtable h1 = new hashtable();

        // Table
        h1.put('G', 1);
        h1.put('H', 2);
        h1.put('I', 3);

        // Bucket
        h1.put('R', 2);
        h1.put('Q', 1);

        // Printing Table
        for (int x : h1.getTable()) {
            System.out.println(x);
        }

        System.out.println("___________________________/n");

        // Printing Bucket
        for (int x : h1.getBucket()) {
            System.out.println(x);
        }
    }
}
