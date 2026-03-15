package patronstrategytemplate;

public class ProcesadorXML extends ProcesadorTemplate
{
    // ___________________________ Constructores
    public ProcesadorXML(ProcesadoStrategy estrategia)
    {
        super(estrategia);
    }
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- XML: Parsear árbol");
    }
}
