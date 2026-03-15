package patrontemplate;

public class ProcesadorCSVAvanzado extends ProcesadorTemplate
{
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- CSV: Parsear columnas");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Avanzado: Investigando datos");
    }
    // ________________________ Métodos Privados
}
