// Estrategia concreta

// Define una implementación a un algoritmo mediante la interfaz de Estrategia

public class Suma implements Operacion
{
    @Override
    public int ejecutar(int a, int b)
    {
        return a + b;
    }
}
