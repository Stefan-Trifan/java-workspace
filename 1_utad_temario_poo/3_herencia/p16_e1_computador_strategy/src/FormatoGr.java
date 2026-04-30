// Estrategia concreta.
// Sabe cómo representar el peso en Gramos.

public class FormatoGr implements EstrategiaFormatoPeso
{
    // ------------------------ Métodos Públicos
    public String devolverPeso(double peso)
    {
        return peso + " Gr";
    }
}