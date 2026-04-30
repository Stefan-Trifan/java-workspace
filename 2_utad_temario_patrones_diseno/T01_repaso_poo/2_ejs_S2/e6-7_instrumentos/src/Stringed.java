public class Stringed implements Instrument, ElectricSound
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
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
    // ------------------------ Métodos Privados 
}
