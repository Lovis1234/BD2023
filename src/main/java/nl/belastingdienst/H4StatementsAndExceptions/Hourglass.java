package nl.belastingdienst.H4StatementsAndExceptions;

public class Hourglass {

    public Hourglass() throws EvenNumberException {
    }

    public void printHourglass(int n) throws EvenNumberException {
        if (n % 2 != 0) {
            StringBuilder horizontal = new StringBuilder();
            horizontal.append("*".repeat(Math.max(0, n)));
            System.out.println(horizontal);
            for (int i = 1; i < (n - 1); i++) {
                StringBuilder diagonal = new StringBuilder();
                diagonal.append(" ".repeat(Math.max(0, n)));
                diagonal.setCharAt((n - i - 1), '*');
                diagonal.setCharAt((i), '*');
                System.out.println(diagonal);
            }
            System.out.println(horizontal);
        } else throw new EvenNumberException();
    }


}
