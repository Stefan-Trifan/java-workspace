package patrontemplate;

public class ProcesadorXMLAvanzado extends ProcesadorTemplate
{
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- XML: Parsear árbol");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Avanzado: Investigando datos");
    }
    // ________________________ Métodos Privados
}
