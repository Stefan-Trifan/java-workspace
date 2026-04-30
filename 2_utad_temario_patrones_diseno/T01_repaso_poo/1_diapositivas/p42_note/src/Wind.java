public class Wind implements Instrument
{
    // ------------------------ Métodos Públicos

    @Override
    public void play(Note n)
    {
        System.out.println("Wind.play() " + n);
    }
    
    @Override
    public String what()
    {
        return "Wind";
    }
}
