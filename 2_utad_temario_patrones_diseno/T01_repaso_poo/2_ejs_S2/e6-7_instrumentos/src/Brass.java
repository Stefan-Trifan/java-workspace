public class Brass extends Wind implements ElectricSound
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void play(Note note)
    {
        System.out.println("Wind Brass play " + note);
    }
    
    public void electricPlay(Note n)
    {
        System.out.println("ElectricSound Brass play " + n);
    }
    // ________________________ Métodos Privados 
}
