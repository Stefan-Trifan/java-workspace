public class SquareStrategy implements Strategy
{
    // ------------------------------- Atributos
    private double valor;
    // --------------------------- Constructores
    public SquareStrategy(double valor)
    {
        this.valor = valor;
    }
    // ------------------------ Métodos Públicos
    public double getArea()
    {
        return valor * valor;
    }
    // ------------------------ Métodos Privados
}
