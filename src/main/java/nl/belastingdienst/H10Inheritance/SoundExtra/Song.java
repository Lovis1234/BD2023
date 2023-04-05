package nl.belastingdienst.H10Inheritance.SoundExtra;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Song {
    private String name;
    private String artist;
    // TODO Check whether this is OKAY
//    private String lyricsOriginal;
    private EffectSong effectSong = new EffectSong();
    //    private String lyricsAfterEffect;
    private List<Effect> effectList = new ArrayList<>();
    private PropertyChangeSupport support;

    public Song(String name, String artist, String lyricsOriginal) {
        this.name = name;
        this.artist = artist;
        this.effectSong.setLyricsOriginal(lyricsOriginal);
        support = new PropertyChangeSupport(this);
        support.addPropertyChangeListener(this.effectSong);
    }

    public void addEffectsToSong(List<Effect> appliedEffectList) {
        support.firePropertyChange("effectListChanged", this.effectList, appliedEffectList);
        this.effectList = appliedEffectList;
    }

    public String getName() {
        return name;
    }

    public void playSong() {
        if (this.effectList.size() > 0) {
            System.out.println(this.effectSong.getLyricsAfterEffect());

        } else {
            System.out.println(this.effectSong.getLyricsOriginal());
        }


    }

    public void setEffectSong(EffectSong effectSong) {
        this.effectSong = effectSong;
    }
}
