public class ContextAreaStrategy
{
    // _________________________________________
    // ------------------------------- Atributos
    AreaStrategy estrategia;
    // _________________________________________
    // ___________________ Constructor Principal
    public ContextAreaStrategy(AreaStrategy estrategia)
    {
        this.estrategia = estrategia;
    }
    // _________________________________________
    // ------------------------ Métodos Públicos
    public double calcularArea()
    {
        return estrategia.calcArea();
    }
}
