public class Wind extends Instrument
{
    // ________________________ Métodos Públicos
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
