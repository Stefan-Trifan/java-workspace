public class Wind implements Instrument
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void play(Note note)
    {
        System.out.println("Wind play " + note);
    }
    public String what()
    {
        return "Wind";
    }
    // ________________________ Métodos Privados 
}
