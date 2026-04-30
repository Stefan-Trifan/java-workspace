public class Brass extends Wind implements ElectricSound
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void play(Note note)
    {
        System.out.println("Wind Brass play " + note);
    }
    
    public void electricPlay(Note n)
    {
        System.out.println("ElectricSound Brass play " + n);
    }
    // ------------------------ Métodos Privados 
}
