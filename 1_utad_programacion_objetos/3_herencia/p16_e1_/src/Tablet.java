public class Tablet extends Computador
{
    // _________________________________________
    // _______________________________ Atributos

    private double peso;
    
    // _________________________________________
    // ___________________ Constructor Principal

    public Tablet(double peso)
    {
        this.peso = peso;
    }
    
    // _________________________________________
    // ________________ Constructores Auxiliares

    public Tablet()
    {
        this(0);
    }
    
    // _________________________________________
    // _________________________________ Getters

    public double getPeso()
    {
        return peso;
    }
    
    // _________________________________________
    // _________________________________ Setters

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    // _________________________________________
    // ________________________ Métodos Públicos

    // _________________________________________
    // ________________________ Métodos Privados 
}