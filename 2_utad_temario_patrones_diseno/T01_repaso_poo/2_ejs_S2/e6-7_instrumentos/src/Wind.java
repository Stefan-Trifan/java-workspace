public class Wind implements Instrument
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void play(Note note)
    {
        System.out.println("Wind play " + note);
    }
    public String what()
    {
        return "Wind";
    }
    // ------------------------ Métodos Privados 
}
