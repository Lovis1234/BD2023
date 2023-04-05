package nl.belastingdienst.H10Inheritance.SoundExtra;

import java.util.ArrayList;
import java.util.List;

public class SoundModule {
    List<Effect> effectList = new ArrayList<>();
    List<Song> songList = new ArrayList<>();

    public SoundModule() {
    }

    public void addEffectToList(Effect effect) {
        effectList.add(effect);
    }

    public void addSongToList(Song song) {
        songList.add(song);
    }

    public void addEffectsToSong(String name, Effect effect) {
        Song songFind = songList.stream().filter(song -> name.equals(song.getName())).findFirst().orElseThrow(IllegalArgumentException::new);
        songFind.addEffectsToSong(effectList);
    }


    public List<Effect> getEffectList() {
        return this.effectList;
    }

    public void newEffect(String distortion, String distiortionTrigger) {


    }

    public void playSong(String name) {
        Song songFind = songList.stream().filter(song -> name.equals(song.getName())).findFirst().orElseThrow(IllegalArgumentException::new);
        songFind.playSong();
    }


}
