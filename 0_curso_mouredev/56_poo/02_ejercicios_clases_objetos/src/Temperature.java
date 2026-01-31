public class Temperature
{
    // Atributos
    private double celsius;

    // Constructores

    // Getters
    public double getCelsius()
    {
        return celsius;
    }

    // Setters
    public void setCelsius(double celsius)
    {
        if (-100 < celsius && celsius < 100)
        {
            this.celsius = celsius;
        }
    }

    // Métodos públicos

    // Métodos privados
}
