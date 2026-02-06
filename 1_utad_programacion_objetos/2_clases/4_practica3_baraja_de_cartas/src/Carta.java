public class Carta
{
    // _________________________________________
    // _______________________________ Atributos

    public int  numero; // todo cambiar a private
    public Palo palo;   // todo cambiar a private

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
    // ________________ Constructores Auxiliares
    // _________________________________________
    // _________________________________ Getters
    // _________________________________________
    // _________________________________ Setters
    // _________________________________________
    // ________________________ Métodos Públicos
    // _________________________________________
    // ________________________ Métodos Privados
}
