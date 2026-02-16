public class Calculadora
{

    private Operacion operacion;

    public Calculadora(Operacion operacion)
    {
        this.operacion = operacion;
    }

    public void setOperacion(Operacion operacion)
    {
        this.operacion = operacion;
    }

    public int calcular(int a, int b)
    {
        return operacion.ejecutar(a, b);
    }
}
