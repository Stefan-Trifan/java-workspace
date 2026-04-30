public class Wind extends Instrument
{
    // ------------------------ Métodos Públicos
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
