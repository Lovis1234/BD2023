package nl.belastingdienst.H6Arrays;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Sudoku {
    int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public Sudoku() {
        shuffleArray(ints);
        int[][] sudoku = new int[3][3];
        int regel = 0;
        int kolom = 0;
        for (int intje : ints) {
            if (regel == 3) {
                kolom++;
                regel = 0;
            }
            sudoku[regel][kolom] = intje;
            regel++;
        }
        StringBuilder stringBuilder = new StringBuilder("| ");
        for (int[] numjes : sudoku) {
            for (int num : numjes) {
                stringBuilder.append(num).append(" | ");
            }
        }
        System.out.println(stringBuilder);
    }

    static void shuffleArray(int[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
