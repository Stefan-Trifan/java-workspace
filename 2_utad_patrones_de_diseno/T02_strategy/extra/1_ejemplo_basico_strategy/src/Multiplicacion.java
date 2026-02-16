// Estrategia concreta

public class Multiplicacion implements Operacion
{

    @Override
    public int ejecutar(int a, int b)
    {
        return a * b;
    }
}
