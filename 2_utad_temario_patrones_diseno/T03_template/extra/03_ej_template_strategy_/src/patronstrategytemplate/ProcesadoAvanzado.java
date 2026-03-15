package patronstrategytemplate;

public class ProcesadoAvanzado implements ProcesadoStrategy
{
    // _______________________________ Atributos
    // ________________________ Métodos Públicos
    @Override
    public void procesarDatos()
    {
        System.out.println("- Avanzado: Investigando datos");
    }
}
