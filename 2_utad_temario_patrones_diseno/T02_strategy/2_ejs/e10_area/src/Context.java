public class Context
{
    // ------------------------------- Atributos
    private Strategy miAreaStrategy;
    // --------------------------- Constructores
    public Context(Strategy miAreaStrategy)
    {
        this.miAreaStrategy = miAreaStrategy;
    }
    // --------------------------------- Getters
    public Strategy getMiAreaStrategy()
    {
        return miAreaStrategy;
    }
    // --------------------------------- Setters
    public void setMiAreaStrategy(Strategy miAreaStrategy)
    {
        this.miAreaStrategy = miAreaStrategy;
    }
    // ------------------------ Métodos Públicos
    public double calcularArea(double valor)
    {
        return miAreaStrategy.calcular(valor);
    }
    // ------------------------ Métodos Privados

}
