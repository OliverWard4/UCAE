package Recursion_prac;

import java.lang.Math;

public class main {
    public static void main(String[] args) {

        Recusion obj = new Recusion();
        int base = 2;
        int power = 5;
        double output1 = obj.powers(base, power);
        System.out.println(output1);

        String output2 = obj.PowersExplained(base, power);
        System.out.println(output2);

        String output3 = obj.Call2(power);
        System.out.println(output3);

    }
}