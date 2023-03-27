package nl.belastingdienst.H3TypeSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 8
        int intA = (Integer.MAX_VALUE - 2);
        long longA = 0;

        for(int i = 0; i <=5; i++){
            if (intA == Integer.MIN_VALUE || intA == Integer.MAX_VALUE) {
                longA = intA;
                longA++;
            } else {
                intA++;
            }
        }

        // 9
        Weekday c = Weekday.THURSDAY;
        System.out.println(c.ordinal());

        // 10
        Trainee t1 = new Trainee("Pieter","Paulusma");
        System.out.println(t1.firstName + " " + t1.lastName);

        // 11
        int i1 = 0;
        i1 = i1++; // i1 = 0
        int i2 = 0;
        i2 = ++i2; // i2 = 1

        // 12
        int i = 3;
        int j = i > 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);
        // i < 3 alway equals true

        // 13
        System.out.println(0b1010 + 0b100);

        // 14
        int addedHours = 80;
        int hours = 23;
        int days;

        days = addedHours / 24;
        hours += addedHours % 24;
        if (hours >= 24){
            days++;
            hours -= 24;
        }
        System.out.println(days + " days later and it's " + hours + ":00");

        // 15
        System.out.println("Ranges byte are: minimum " + Byte.MIN_VALUE + " maximum " + Byte.MAX_VALUE);
        System.out.println("Ranges int are: minimum " + Integer.MIN_VALUE + " maximum " + Integer.MAX_VALUE);
        System.out.println("Ranges long are: minimum " + Long.MIN_VALUE + " maximum " + Long.MAX_VALUE);
        System.out.println("Ranges short are: minimum " + Short.MIN_VALUE + " maximum " + Short.MAX_VALUE);
        System.out.println("Ranges double are: minimum " + Double.MIN_VALUE + " maximum " + Double.MAX_VALUE);
        System.out.println("Ranges float are: minimum " + Float.MIN_VALUE + " maximum " + Float.MAX_VALUE);
        System.out.println("Ranges char are: minimum " + Character.MIN_VALUE + " maximum " + Character.MAX_VALUE);

        // 16
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1;
        client2.name = "Joris";
        System.out.println(client2.name);








    }
}
