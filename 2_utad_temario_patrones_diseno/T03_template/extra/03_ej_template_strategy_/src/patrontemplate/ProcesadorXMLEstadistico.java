package patrontemplate;

public class ProcesadorXMLEstadistico extends ProcesadorTemplate
{
    // ________________________ Métodos Públicos¡
    @Override
    protected void leer()
    {
        System.out.println("- XML: Parsear árbol");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Estadistico: Calculando media, moda y mediana");
    }
    // ________________________ Métodos Privados
}
