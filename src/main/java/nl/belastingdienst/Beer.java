package nl.belastingdienst;
import java.text.MessageFormat;

public class Beer {
    static String bottles(int n) {
        return MessageFormat.format("{0,choice,0#No more bottles|1#One bottle|2#{0} bottles} of beer", n);
    }

    public static void main(String[] args) {
        String bottles = bottles(5);
        for (int n = 5; n > 0; n--) {
            System.out.println(bottles + " on the wall");
            System.out.println(bottles);
            System.out.println("Take one down, pass it around");
            bottles = bottles(n - 1);
            System.out.println(bottles + " on the wall\n");
        }
    }
}