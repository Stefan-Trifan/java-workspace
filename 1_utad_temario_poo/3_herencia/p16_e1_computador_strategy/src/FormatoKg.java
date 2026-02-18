// Estrategia concreta.
// Sabe cómo representar el peso en kilogramos.

public class FormatoKg implements EstrategiaFormatoPeso
{
    // ________________________ Métodos Públicos
    public String devolverPeso(double peso)
    {
        return peso + " Kg";
    }
}
