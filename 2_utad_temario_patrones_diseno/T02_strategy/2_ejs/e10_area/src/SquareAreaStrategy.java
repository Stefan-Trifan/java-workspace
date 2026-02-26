public class SquareAreaStrategy implements Strategy
{
    // ________________________ Métodos Públicos
    @Override
    public double calcular(double valor)
    {
        return valor * valor;
    }
}
