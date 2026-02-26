public class CircleAreaStrategy implements Strategy
{
    // ________________________ Métodos Públicos
    @Override
    public double calcular(double valor)
    {
        return Math.PI * Math.pow(valor, 2) ;
    }
}
