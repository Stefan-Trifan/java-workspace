

public class ProcesadorPDF extends ProcesadorTemplate
{
    // ___________________________ Constructores
    public ProcesadorPDF(ProcesadoStrategy estrategia)
    {
        super(estrategia);
    }
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- PDF: Extraer texto");
    }
}
