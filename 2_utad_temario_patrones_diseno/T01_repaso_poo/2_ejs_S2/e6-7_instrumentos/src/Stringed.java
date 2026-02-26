public class Stringed implements Instrument, ElectricSound
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void play(Note note)
    {
        System.out.println("Stringed play" + note);
    }
    public String what()
    {
        return "Stringed";
    }
    public void electricPlay(Note n)
    {
        System.out.println("ElectricSound Stringed play " + n);
    }
    // ________________________ Métodos Privados 
}
