package patrontemplate;

public class ProcesadorPDFEstadistico extends ProcesadorTemplate
{
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- PDF: Extraer texto");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Estadistico: Calculando media, moda y mediana");
    }
    // ________________________ Métodos Privados
}
