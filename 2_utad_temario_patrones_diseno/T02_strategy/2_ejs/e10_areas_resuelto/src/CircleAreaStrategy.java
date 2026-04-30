public class CircleAreaStrategy implements AreaStrategy
{
    // _________________________________________
    // ------------------------------- Atributos
    private double radio;
    // _________________________________________
    // ___________________ Constructor Principal
    public CircleAreaStrategy(double radio)
    {
        this.radio = radio;
    }
    // _________________________________________
    // ________________ Constructores Auxiliares
    public CircleAreaStrategy()
    {
        this(0.0);
    }
    // --------------------------------- Setters
    // _________________________________________
    // ------------------------ Métodos Públicos
    public double calcArea()
    {
        return Math.PI * Math.pow(radio, 2);
    }
}
