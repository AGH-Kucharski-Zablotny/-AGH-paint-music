package soundEngine;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.View;


public class JMusicExample implements JMC
{
    /**
     * Variable stores tempo for a song
     */
    private double tempo;

    //------------------------- METHODS ----------------------------//

    public double getTempo()
    {
        return tempo;
    }

    public void setTempo(double tempo)
    {
        this.tempo = tempo;
    }

    /**
     * Method plays sine wave sound at frequency given by user
     * @param frequency
     */
    public void playSoundAtFrequency(double frequency)
    {
        // Play sine wave
        playInstrumentAtFrequency(0, frequency);
    }

    /**
     * Method plays instrument sound at frequency given by user
     * @param instrument
     * @param frequency
     */
    public void playInstrumentAtFrequency(int instrument, double frequency)
    {
        // Declare score and sine wave instrument
        Score s = new Score();
        s.setTempo(tempo);
        Part p = new Part(instrument);

        // Create note at pitch given by user (full note)
        Note freqNote = new Note(frequency, 1);

        // Create phrase and add note to the score
        Phrase phrase = new Phrase(freqNote);
        p.addPhrase(phrase);
        s.addPart(p);


        // Play sound
        //Play.audio(phrase, instrument);

        Score sc = new Score("CPhrase class example", 120);
        Part guitarPart = new Part("Guitar",JAZZ_GUITAR, 0);
        Part bassPart = new Part("Bass", ACOUSTIC_BASS, 1);
        Part ridePart = new Part("Drums", 0, 9);
        Part snarePart = new Part("Drums 2", 0, 9);
        Part saxPart = new Part("Sax", SAXOPHONE, 2);
        Phrase bassPhrase = new Phrase();

        //Let us know things have started
        System.out.println("Creating chord progression . . .");

        //choose rootPitch notes around the cycle of fifths
//        int rootPitch = c4; //set start pitch to C
//        for (int i=0;i<6;i++) {
//            for (int j=0;j<4;j++) { // 4 chords to a bar
////                guitarPart.addCPhrase(JazzGuitar.triad
////                        (rootPitch));
////            }
////            bassPart.addPhrase(JazzBass.bassLine(rootPitch));
////            ridePart.addPhrase(JazzDrums.swingTime());
////            snarePart.addPhrase(JazzDrums.swingAccents());
////            saxPart.addPhrase(JazzSax.melody(rootPitch));
////            // choose the next root pitch
////            rootPitch -= 7;
////            for (int k=0;k<4;k++) {
////                guitarPart.addCPhrase(JazzGuitar.domSeventh
////                        (rootPitch));
////            }
////            bassPart.addPhrase(JazzBass.bassLine2(rootPitch));
////            ridePart.addPhrase(JazzDrums.swingTime());
////            snarePart.addPhrase(JazzDrums.swingAccents());
////            saxPart.addPhrase(JazzSax.melody(rootPitch));
//            rootPitch += 5;
//        }

        //pack the parts into a score
//        s.addPart(guitarPart);
//        s.addPart(bassPart);
//        s.addPart(ridePart);
//        s.addPart(snarePart);
//        s.addPart(saxPart);

        //display the music
        //View.show(s);

        // write the score to a MIDIfile
        long statTime = System.currentTimeMillis();
        Play.midi(s);
        long stopTime = System.currentTimeMillis();
        System.out.println("Time of playing: " + (stopTime - statTime));

    }

}
