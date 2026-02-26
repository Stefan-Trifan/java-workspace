public class Context
{
    // _______________________________ Atributos
    private Strategy miAreaStrategy;
    // ___________________________ Constructores
    public Context(Strategy miAreaStrategy)
    {
        this.miAreaStrategy = miAreaStrategy;
    }
    // _________________________________ Getters
    public Strategy getMiAreaStrategy()
    {
        return miAreaStrategy;
    }
    // _________________________________ Setters
    public void setMiAreaStrategy(Strategy miAreaStrategy)
    {
        this.miAreaStrategy = miAreaStrategy;
    }
    // ________________________ Métodos Públicos
    public double calcularArea(double valor)
    {
        return miAreaStrategy.calcular(valor);
    }
    // ________________________ Métodos Privados

}
