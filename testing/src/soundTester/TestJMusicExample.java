package soundTester;

import jm.music.data.Tempo;
import soundEngine.JMusicExample;

public class TestJMusicExample
{
    public static void main(String[] args)
    {
        JMusicExample engine = new JMusicExample();
        engine.setTempo(Tempo.DEFAULT_TEMPO);

        for (int i = 0; i < 10; i++)
        {
            long startTime = System.currentTimeMillis();
            engine.playSoundAtFrequency(523);
            long stopTime = System.currentTimeMillis();
            System.out.println("(" + i + ") " + (stopTime-startTime));
        }


    }
}
