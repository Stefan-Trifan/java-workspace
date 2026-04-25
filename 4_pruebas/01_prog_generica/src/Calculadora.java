public class Calculadora<T>
{
    private Operacion<T> operacion;

    public Calculadora(Operacion<T> operacion)
    {
        this.operacion = operacion;
    }

    public T calcular(T a, T b)
    {
        return operacion.ejecutar(a, b);
    }
}