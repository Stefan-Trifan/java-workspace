public class ContextAreaStrategy
{
    // _________________________________________
    // _______________________________ Atributos
    AreaStrategy estrategia;
    // _________________________________________
    // ___________________ Constructor Principal
    public ContextAreaStrategy(AreaStrategy estrategia)
    {
        this.estrategia = estrategia;
    }
    // _________________________________________
    // ________________________ Métodos Públicos
    public double calcularArea()
    {
        return estrategia.calcArea();
    }
}
