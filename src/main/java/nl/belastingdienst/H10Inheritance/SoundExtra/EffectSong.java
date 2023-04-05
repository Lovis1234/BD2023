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

        String lyricsAfterEffect = lyricsOriginal;

        for (Effect e : effectListAfterChange) {
            lyricsAfterEffect = e.apply(lyricsAfterEffect);
        }

        this.lyricsAfterEffect = lyricsAfterEffect;
    }

    public void setLyricsOriginal(String lyricsOriginal) {
        this.lyricsOriginal = lyricsOriginal;
    }
}
