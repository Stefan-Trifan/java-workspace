public class CircleAreaStrategy implements Strategy
{
    // ------------------------ Métodos Públicos
    @Override
    public double calcular(double valor)
    {
        return Math.PI * Math.pow(valor, 2) ;
    }
}
