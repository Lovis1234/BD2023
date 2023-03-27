package nl.belastingdienst.H4StatementsAndExceptions;

import java.util.Scanner;

public class Main {
    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }

    public static void loop() throws EvenNumberException {
        int count = 0;
        while (count <= 3)
            try {
                System.out.println("Input n");
                Scanner scanner2 = new Scanner(System.in);
                Hourglass hourglass = new Hourglass();
                hourglass.printHourglass(scanner2.nextInt());
            } catch (EvenNumberException e) {
                try {
                    System.out.println("Probeer opnieuw jonguh");
                    Scanner scanner2 = new Scanner(System.in);
                    Hourglass hourglass = new Hourglass();
                    hourglass.printHourglass(scanner2.nextInt());
                    count++;
                } catch (EvenNumberException e2) {
                    System.out.println("Probeer opnieuw jonguh");
                    Scanner scanner2 = new Scanner(System.in);
                    Hourglass hourglass = new Hourglass();
                    hourglass.printHourglass(scanner2.nextInt());
                    count++;
                }

            }
    }

    public static void main(String[] args) {

        try {
            loop();
        } catch (EvenNumberException e) {
            System.out.println("oeioei " + e);
        }

        // 1
        System.out.println("Input a accountnumber in format XX.XX.XX.XXX");
        Scanner scanner = new Scanner(System.in);
        String accountNumber = scanner.nextLine();
        if (accountNumber.matches("\\d{2}[-\\.\\s]\\d{2}[-\\.\\s]\\d{2}[-\\.\\s]\\d{3}")) {
            int sum = 0;
            int proof = 9;

            for (int i = 0; i < accountNumber.length(); i++) {
                if (accountNumber.charAt(i) != '.') {
                    sum += proof * (accountNumber.charAt(i) - '0');
                    proof--;
                }
            }
            if (sum % 11 == 0) {
                System.out.println("valid");
            } else {
                System.out.println("not valid");
            }

        } else throw new IllegalArgumentException();
        printTable(2);

        // Extra
        Season season = Season.UNKNOWN;
        switch (season) {
            case FALL, WINTER -> {
                System.out.println("Cold");
                break;
            }
            case SUMMER, SPRING -> {
                System.out.println("Warm");
                break;
            }
            default -> {
                System.out.println("UNKNOWN");
                break;
            }
        }


    }


}

