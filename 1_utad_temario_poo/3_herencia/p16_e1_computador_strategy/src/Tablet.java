public class Tablet extends Computador
{
    // _________________________________________
    // ------------------------------- Atributos

    // _________________________________________
    // ___________________ Constructor Principal

    public Tablet(double peso)
    {
        super(peso);
    }

    // _________________________________________
    // ________________ Constructores Auxiliares

    public Tablet()
    {
        this(0);
    }

    // _________________________________________
    // --------------------------------- Getters

    public double getpesoGramos()
    {
        return super.getpeso() * 1000;
    }

    // _________________________________________
    // --------------------------------- Setters

    // _________________________________________
    // ------------------------ Métodos Públicos

    public String imprimirPesos()
    {
        return super.getpeso() + "Kg/" + this.getpesoGramos() + "g";
    }

    // _________________________________________
    // ------------------------ Métodos Privados
}