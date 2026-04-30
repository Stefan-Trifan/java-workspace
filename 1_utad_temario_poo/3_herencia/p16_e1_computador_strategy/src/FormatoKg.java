// Estrategia concreta.
// Sabe cómo representar el peso en kilogramos.

public class FormatoKg implements EstrategiaFormatoPeso
{
    // ------------------------ Métodos Públicos
    public String devolverPeso(double peso)
    {
        return peso + " Kg";
    }
}
