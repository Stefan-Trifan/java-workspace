

public class ProcesadorPDF extends ProcesadorTemplate
{
    // --------------------------- Constructores
    public ProcesadorPDF(ProcesadoStrategy estrategia)
    {
        super(estrategia);
    }
    // ------------------------ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- PDF: Extraer texto");
    }
}
