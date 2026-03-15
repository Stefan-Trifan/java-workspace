package patronstrategytemplate;

public class ProcesadorCSV extends ProcesadorTemplate
{
    // ___________________________ Constructores
    public ProcesadorCSV(ProcesadoStrategy estrategia)
    {
        super(estrategia);
    }
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- CSV: Parsear columnas");
    }
}

// ConcreteTemplate

// lee datos