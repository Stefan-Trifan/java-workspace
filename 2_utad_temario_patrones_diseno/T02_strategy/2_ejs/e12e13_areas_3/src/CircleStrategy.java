public class CircleStrategy implements Strategy
{
    // ------------------------------- Atributos
    private double valor;
    // --------------------------- Constructores
    public CircleStrategy(double valor)
    {
        this.valor = valor;
    }
    // ------------------------ Métodos Públicos
    public double getArea()
    {
        return Math.PI * Math.pow(valor, 2);
    }
    // ------------------------ Métodos Privados
}
