public class Percussion implements Instrument
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void play(Note note)
    {
        System.out.println("Percussion play" + note);
    }
    public String what()
    {
        return "Percussion";
    }
    // ------------------------ Métodos Privados 
}
