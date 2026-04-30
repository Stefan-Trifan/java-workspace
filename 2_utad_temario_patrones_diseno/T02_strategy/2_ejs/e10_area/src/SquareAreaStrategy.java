public class SquareAreaStrategy implements Strategy
{
    // ------------------------ Métodos Públicos
    @Override
    public double calcular(double valor)
    {
        return valor * valor;
    }
}
