package patrontemplate;

public class ProcesadorPDFAvanzado extends ProcesadorTemplate
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
        System.out.println("- Avanzado: Investigando datos");
    }
    // ________________________ Métodos Privados
}
