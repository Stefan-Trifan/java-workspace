// Estrategia concreta

public class Suma implements Operacion
{
    @Override
    public int ejecutar(int a, int b)
    {
        return a + b;
    }
}

/* Ver info 
Define una implementación a un algoritmo mediante la interfaz de Estrategia */
