package patrontemplate;

public class ProcesadorXMLSimple extends ProcesadorTemplate
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
        System.out.println("- Simple: Procesando datos");
    }
    // ________________________ Métodos Privados
}
