public class Brass implements Instrument, ElectricSound
{
    @Override
    public void play(Note n)
    {
        System.out.println("Brass.play() " + n);
    }
    
    @Override
    public String what()
    {
        return "Brass";
    }

    @Override
    public void electricPlay(Note n)
    {
        System.out.println(n + "Eléctrico");
    }
}
