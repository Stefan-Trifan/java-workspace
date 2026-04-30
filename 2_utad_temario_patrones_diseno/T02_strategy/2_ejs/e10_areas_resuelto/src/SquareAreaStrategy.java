public class SquareAreaStrategy implements AreaStrategy
{
    // _________________________________________
    // ------------------------------- Atributos
    private double lado;
    // _________________________________________
    // ___________________ Constructor Principal
    public SquareAreaStrategy(double lado)
    {
        this.lado = lado;
    }
    // _________________________________________
    // ________________ Constructores Auxiliares
    public SquareAreaStrategy()
    {
        this(0.0);
    }
    // _________________________________________
    // ------------------------ Métodos Públicos
    public double calcArea()
    {
        return lado * lado;
    }
}
