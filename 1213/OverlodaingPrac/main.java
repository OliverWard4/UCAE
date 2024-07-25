package OverlodaingPrac;

public class main {
    public static void main(String[] args) {

        School unc = new School(7, "History");
        System.out.println(unc.ToString());

        School Wssu = new School(21, "Science");
        System.out.println(Wssu.ToString());

        School Nc = new School();
        System.out.println(Nc.ToString());

        School Duke = new School(99);
        System.out.println(Duke.ToString());

    }
}
