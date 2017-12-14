package soundTester;

import jm.music.data.Tempo;
import soundEngine.JMusicExample;

public class TestJMusicExample
{
    public static void main(String[] args)
    {
        JMusicExample engine = new JMusicExample();
        engine.setTempo(Tempo.DEFAULT_TEMPO);

        engine.playSoundAtFrequency(523);
    }
}
