package nl.belastingdienst.H2SwitchingToIDE;

import java.util.Scanner;

import static java.lang.Math.abs;

public class HelloClass {

    public static void main(String[] args) {
        // 1
        System.out.println("Hello World!");
        // 2
        for (String arg : args) {
            System.out.printf("Hello World!, %s", arg);
        }
        // 3
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = in.nextLine();
        System.out.println("Username is: " + userName);

        // 4
        int plusTwo = Math.abs(-2);
        int plusTwo2 = abs(-2);
        System.out.println(plusTwo + " " + plusTwo2);

    }
}
