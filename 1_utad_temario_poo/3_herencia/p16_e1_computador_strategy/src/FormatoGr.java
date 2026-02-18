// Estrategia concreta.
// Sabe cómo representar el peso en Gramos.

public class FormatoGr implements EstrategiaFormatoPeso
{
    // ________________________ Métodos Públicos
    public String devolverPeso(double peso)
    {
        return peso + " Gr";
    }
}