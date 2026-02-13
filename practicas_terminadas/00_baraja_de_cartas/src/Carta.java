public class Carta
{
    // _________________________________________
    // _______________________________ Atributos

    private int  numero; 
    private Palo palo; 

    // _________________________________________
    // ___________________ Constructor Principal

    public Carta(int numero, Palo palo)
    {
        if ((numero >= 1 && numero <= 12) && (numero != 8 && numero != 9))
            this.numero = numero;
        else
            throw new IllegalArgumentException(
                "Una carta tiene un número entre 1 y 12 " +
                    "(el 8 y el 9 no los incluimos)");
        this.palo = palo;
    }

    // _________________________________________
    // _________________________________ Getters
    public int getNumero()
        return this.numero;

    public Palo getPalo()
        return this.palo;
    // _________________________________________
    // ________________________ Métodos Públicos

    @Override
    public String toString()
        return this.numero + " " + this.palo;
}
