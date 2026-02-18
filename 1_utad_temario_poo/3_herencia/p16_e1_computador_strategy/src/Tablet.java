public class Tablet extends Computador
{
    // _________________________________________
    // _______________________________ Atributos

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
    // _________________________________ Getters

    public double getpesoGramos()
    {
        return super.getpeso() * 1000;
    }

    // _________________________________________
    // _________________________________ Setters

    // _________________________________________
    // ________________________ Métodos Públicos

    public String imprimirPesos()
    {
        return super.getpeso() + "Kg/" + this.getpesoGramos() + "g";
    }

    // _________________________________________
    // ________________________ Métodos Privados
}