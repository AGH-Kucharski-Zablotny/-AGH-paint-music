package soundTester;

import soundEngine.JavaMIDI;

public class TestJavaMIDI
{
    /**
     * Method makes initialization tests for playing a single note for JavaMIDI class
     * @param args
     */
    public static void main(String[] args)
    {
        long[] results = new long[10];

        System.out.println("Starting JavaMIDI test");

        for (int i = 0; i < 10; i++)
        {
            long startTime = System.currentTimeMillis();
            JavaMIDI.playNote(60, 1000);
            long stopTime = System.currentTimeMillis();
            results[i] = (stopTime - startTime) - 1000;
            System.out.println("(" + i + "): " + results[i] + "ms");
        }

        long average = 0l;

        for(int i = 0; i < 10; i++)
        {
            average += results[i];
        }


        System.out.println("Average JavaMIDI time: " + (double)average / 10 + "ms");
    }
}
