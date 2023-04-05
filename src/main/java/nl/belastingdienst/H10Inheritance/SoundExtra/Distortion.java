package nl.belastingdienst.H10Inheritance.SoundExtra;

public class Distortion implements Effect {

    @Override
    public String apply(String song) {
        return song.replaceAll(" ", "~");
    }
}
