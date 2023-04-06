package nl.belastingdienst.H10Inheritance.SoundExtra;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class EffectSong implements PropertyChangeListener {

    private String lyricsOriginal;
    private String lyricsAfterEffect;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setLyricsAfterEffect((List) evt.getNewValue());
    }

    public EffectSong(String lyricsOriginal) {
        this.lyricsOriginal = lyricsOriginal;
    }

    public EffectSong() {
    }

    public String getLyricsAfterEffect() {
        return this.lyricsAfterEffect;
    }

    public String getLyricsOriginal() {
        return this.lyricsOriginal;
    }

    public void setLyricsAfterEffect(List<Effect> effectListAfterChange) {

        String lyricsAfterEffect2 = lyricsOriginal;

        for (Effect e : effectListAfterChange) {
            lyricsAfterEffect2 = e.apply(lyricsAfterEffect2);
        }

        this.lyricsAfterEffect = lyricsAfterEffect2;

        System.out.println("Liedje na toevoeging effect:");
        System.out.println(this.lyricsAfterEffect);
    }

    public void setLyricsOriginal(String lyricsOriginal) {
        this.lyricsOriginal = lyricsOriginal;
    }
}
