public class MusicTest
{
    static void tune(Instrument instrument)
    {
        instrument.play(Note.DO); // Delegación
    }

    static void tuneAll(Instrument[] instruments)
    {
        for (Instrument i : instruments)
        {
            tune(i);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Instrument[] orchestra = {
            new Wind()
        };
        tuneAll(orchestra);

        System.out.println("\n_______________________END\n");
    }
}
