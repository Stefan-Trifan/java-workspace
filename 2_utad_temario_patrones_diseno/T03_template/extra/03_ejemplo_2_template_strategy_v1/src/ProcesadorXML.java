

public class ProcesadorXML extends ProcesadorTemplate
{
    // --------------------------- Constructores
    public ProcesadorXML(ProcesadoStrategy estrategia)
    {
        super(estrategia);
    }
    // ------------------------ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- XML: Parsear árbol");
    }
}
