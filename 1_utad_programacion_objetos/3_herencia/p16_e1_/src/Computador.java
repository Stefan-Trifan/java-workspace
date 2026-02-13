public class Computador
{
    // _________________________________________
    // _______________________________ Atributos
    private double peso;
    // _________________________________________
    // ___________________ Constructor Principal
    public Computador(double peso)
    {
        this.peso = peso;
    }
    // _________________________________________
    // ________________ Constructores Auxiliares
    public Computador()
    {
        this(0);
    }
    // _________________________________________
    // _________________________________ Getters
    public double getpeso()
    {
        return peso;
    }
    // _________________________________________
    // _________________________________ Setters
    public void setpeso(double peso)
    {
        this.peso = peso;
    }
    // _________________________________________
    // ________________________ Métodos Públicos
    // _________________________________________
    // ________________________ Métodos Privados 
}