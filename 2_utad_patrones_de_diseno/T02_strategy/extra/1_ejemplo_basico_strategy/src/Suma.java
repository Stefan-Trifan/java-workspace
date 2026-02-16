// Estrategia concreta

public class Suma implements Operacion
{
    @Override
    public int ejecutar(int a, int b)
    {
        return a + b;
    }
}
