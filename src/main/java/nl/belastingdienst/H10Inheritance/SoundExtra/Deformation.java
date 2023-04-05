package nl.belastingdienst.H10Inheritance.SoundExtra;

import java.util.Random;

public class Deformation implements Effect {
    Random random = new Random();

    @Override
    public String apply(String song) {
        StringBuilder stringBuilder = new StringBuilder(song);
        for (int i = 0; i < (song.length() / 2); i++) {
            int randomInt = random.nextInt(song.length());
            stringBuilder.setCharAt(randomInt, Character.toUpperCase(stringBuilder.charAt(randomInt)));
        }
        return stringBuilder.toString();
    }
}
