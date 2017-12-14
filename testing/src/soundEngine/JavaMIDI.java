package soundEngine;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class JavaMIDI
{
    public static final int VELOCITY = 120;
    public static final int CHANNEL = 1;

    /**
     * Method plays sound with pitch given by the user
     * @param note
     * @param duration
     */
    public static void playNote(int note, int duration)
    {
        try
        {
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            MidiChannel[] channels = synthesizer.getChannels();
            MidiChannel channel = channels[CHANNEL];
            channel.noteOn(note, VELOCITY);
            Thread.sleep(duration);
            synthesizer.close();

        } catch (MidiUnavailableException e)
        {
            e.printStackTrace();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
