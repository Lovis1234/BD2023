package nl.belastingdienst.H10Inheritance.SoundExtra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SoundModuleTest {

    private SoundModule soundModule;

    @BeforeEach
    public void init() {
        this.soundModule = new SoundModule();
    }

    @Test
    void addEffectToList() {

        //Create new effects
        Distortion soundeffect1 = new Distortion();
        this.soundModule.addEffectToList(soundeffect1);
        Deformation soundeffect2 = new Deformation();
        this.soundModule.addEffectToList(soundeffect2);

        int expectedAmountOfEffects = 2;
        int actualAmountOfEffects = this.soundModule.getEffectList().size();
        Assertions.assertEquals(expectedAmountOfEffects, actualAmountOfEffects);

    }

    @Test
    void addEffectToSong() {

        Song song = new Song("Vader Jacob", "Pieter", """
                Vader Jacob, vader Jacob
                Slaapt gij nog? Slaapt gij nog
                 Alle klokken luiden, alle klokken luiden
                 Bim bam bom, bim bam bom

                 Vader Jacob, vader Jacob
                 Slaapt gij nog? Slaapt gij nog
                 Alle klokken luiden, alle klokken luiden
                 Bim bam bom, bim bam bom
                 """);
        soundModule.addSongToList(song);
        Distortion soundeffect1 = new Distortion();
        this.soundModule.addEffectToList(soundeffect1);
        soundModule.addEffectToSong("Vader Jacob", soundeffect1);

        Deformation soundeffect2 = new Deformation();
        this.soundModule.addEffectToList(soundeffect2);
        soundModule.addEffectToSong("Vader Jacob", soundeffect2);


        Effect repeatTwice = s -> s.repeat(2);

        this.soundModule.addEffectToList(repeatTwice);
        soundModule.addEffectToSong("Vader Jacob", repeatTwice);
    }

    @Test
    void newEffect() {
    }

    @Test
    public void playSong() {
        Song song = new Song("Vader Jacob", "Pieter", """
                Vader Jacob, vader Jacob
                Slaapt gij nog? Slaapt gij nog
                 Alle klokken luiden, alle klokken luiden
                 Bim bam bom, bim bam bom

                 Vader Jacob, vader Jacob
                 Slaapt gij nog? Slaapt gij nog
                 Alle klokken luiden, alle klokken luiden
                 Bim bam bom, bim bam bom
                 """);
        soundModule.addSongToList(song);
        Distortion soundeffect1 = new Distortion();
        this.soundModule.addEffectToList(soundeffect1);
        Deformation soundeffect2 = new Deformation();
        this.soundModule.addEffectToList(soundeffect2);

        Effect repeatTwice = s -> s.repeat(2);

        this.soundModule.addEffectToList(repeatTwice);

        List<Effect> effectList = new ArrayList<>();
        effectList.add(soundeffect1);
        effectList.add(soundeffect2);
        effectList.add(repeatTwice);


        soundModule.addEffectsToSong("Vader Jacob", effectList);


        soundModule.playSong("Vader Jacob");

    }
}