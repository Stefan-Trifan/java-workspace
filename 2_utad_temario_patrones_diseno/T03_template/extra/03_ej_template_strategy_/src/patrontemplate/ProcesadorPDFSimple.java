package patrontemplate;

public class ProcesadorPDFSimple extends ProcesadorTemplate
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
        System.out.println("- Simple: Procesando datos");
    }
    // ________________________ Métodos Privados
}
