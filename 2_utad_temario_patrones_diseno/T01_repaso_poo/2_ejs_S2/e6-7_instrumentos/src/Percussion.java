public class Percussion implements Instrument
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void play(Note note)
    {
        System.out.println("Percussion play" + note);
    }
    public String what()
    {
        return "Percussion";
    }
    // ________________________ Métodos Privados 
}
