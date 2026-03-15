package patrontemplate;

public class ProcesadorCSVSimple extends ProcesadorTemplate
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
        System.out.println("- Simple: Procesando datos");
    }
    // ________________________ Métodos Privados
}
