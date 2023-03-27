package nl.belastingdienst.H6Arrays;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        long[] row = new long[4];
        row[2] = 3;
        row = increaseCapacity(row, 4);
//        for (long num : row) {
//            System.out.println(num);
//        }
//        Scanner scanner = new Scanner(System.in);
//        int[] ints = new int[10];
//        for (int i = 1; i < 11; i++) {
//            ints[i - 1] = scanner.nextInt();
//        }
//        int total = 0;
//        for (int num : ints) {
//            total += num;
//        }
//        System.out.println(total);

    }

    public static long[] increaseCapacity(long[] input) {
        long[] output = new long[(input.length * 2)];
        int i = 0;
        for (long num : input) {
            output[i] = num;
            i++;
        }
        return output;
    }

    public static long[] increaseCapacity(long[] input, int multiplier) {
        long[] output = new long[(input.length * multiplier)];
        int i = 0;
        for (long num : input) {
            output[i] = num;
            i++;
        }
        return output;
    }

}
