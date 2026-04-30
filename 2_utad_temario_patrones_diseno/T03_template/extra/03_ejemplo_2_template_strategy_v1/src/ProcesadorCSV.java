

public class ProcesadorCSV extends ProcesadorTemplate
{
    // --------------------------- Constructores
    public ProcesadorCSV(ProcesadoStrategy estrategia)
    {
        super(estrategia);
    }
    // ------------------------ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- CSV: Parsear columnas");
    }
}

// ConcreteTemplate

// lee datos