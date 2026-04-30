public class MusicTest
{

    // ------------------------ Métodos Públicos

    static void tuneAll(Instrument[] instruments)
    {
        for (Instrument i : instruments)
        {
            tune(i);
        }
    }

    static void tune(Instrument instrument)
    {
        instrument.play(Note.DO); // Delegación
        if(instrument instanceof ElectricSound)
        {
            ElectricSound e = (ElectricSound)instrument;
            e.electricPlay(Note.MI);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Instrument[] orchestra = { 
            new Wind(), 
            new Percussion(), 
            new Stringed(), 
            new Woodwind(),
            new Brass()};
        tuneAll(orchestra);

        System.out.println("\n_______________________END\n");
    }

}